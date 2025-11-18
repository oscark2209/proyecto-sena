Caso de uso: CU-01: Gestionar Orden de Compra Automatizada de Materiales

## **DESCRIPCIÓN**

Este caso de uso permite al sistema SCM gestionar de forma automatizada el proceso completo de generación de órdenes de compra cuando se detectan niveles bajos de inventario de materiales para la fabricación de casetones.

El sistema solicita cotizaciones a los proveedores registrados, evalúa y compara las ofertas según criterios de calidad, precio y tiempo de entrega, selecciona al mejor proveedor y genera automáticamente la orden de compra correspondiente.

**Actores:**

* **Actor Principal:** Sistema SCM (automatizado)  
* **Actores Secundarios:** Administrador del Sistema, Proveedor, Sistema de Inventario

**Objetivo:** Automatizar el proceso de abastecimiento de materiales para garantizar disponibilidad continua de materia prima, reducir tiempos de gestión manual, optimizar costos mediante selección automatizada del mejor proveedor y mantener trazabilidad completa del proceso de compra.

## **PRECONDICIONES**

* El sistema SCM debe estar operativo y configurado  
* Los proveedores deben estar registrados en el sistema con sus datos de contacto y catálogo de productos  
* Los parámetros de punto de reorden y stock mínimo deben estar definidos para cada material  
* Los criterios de evaluación de proveedores (peso de precio, calidad, tiempo) deben estar configurados  
* El sistema de inventario debe estar integrado con el SCM

**4\. FLUJO BÁSICO**

1. Sistema de Inventario: Detecta que el material "X" ha alcanzado el punto de reorden y envía alerta al Sistema SCM

2.  Sistema SCM: Recibe la alerta y consulta los datos del material (cantidad mínima a pedir, especificaciones técnicas)

3. Sistema SCM: Consulta la base de datos de proveedores que suministran el material "X"

4. Sistema SCM: Genera solicitud de cotización automática con especificaciones del material y cantidad requerida  
     
5. Sistema SCM: Envía solicitud de cotización a todos los proveedores elegibles (mínimo 3\)  
     
6. Proveedor: Recibe solicitud de cotización y la procesa  
     
7. Proveedor: Envía cotización con: precio unitario, cantidad disponible, tiempo de entrega y condiciones de pago  
     
8. Sistema SCM: Recibe y registra todas las cotizaciones en un plazo de 24 horas  
     
9. Sistema SCM: Evalúa y compara las cotizaciones según criterios configurados (precio 40%, tiempo de entrega 30%, historial de calidad 30%)  
     
10. Sistema SCM: Selecciona al proveedor con la mejor puntuación  
      
11. Sistema SCM: Genera automáticamente la orden de compra con: código único, fecha, proveedor seleccionado, material, cantidad, precio total, fecha de entrega esperada  
      
12. Sistema SCM: Envía la orden de compra al proveedor seleccionado por correo electrónico y/o portal  
      
13. Sistema SCM: Actualiza el inventario proyectado sumando la cantidad ordenada  
      
14. Sistema SCM: Registra la orden con estado "Pendiente de recepción" y genera número de trazabilidad  
      
15. Sistema SCM: Envía notificación al administrador informando sobre la orden generada  
      
16. Proveedor: Confirma recepción de la orden de compra  
      
17. Sistema SCM: Actualiza el estado de la orden a "Confirmada por proveedor"  
    

**5\. FLUJOS ALTERNOS**

### **FA-01: Ningún proveedor responde la cotización**

**Paso en que se activa:** Después del paso 8 del flujo básico

| Paso | Actor | Acción |
| ----- | ----- | ----- |
| 8a | Sistema SCM | Detecta que después de 24 horas no se han recibido cotizaciones |
| 8b | Sistema SCM | Envía alerta al administrador indicando falta de respuesta de proveedores |
| 8c | Administrador | Debe gestionar manualmente la solicitud de cotización contactando a los proveedores |
| 8d | Sistema SCM | Registra el evento y finaliza el proceso automático |

### **FA-02: Solo un proveedor responde la cotización**

**Paso en que se activa:** En el paso 8 del flujo básico

| Paso | Actor | Acción |
| ----- | ----- | ----- |
| 8a | Sistema SCM | Detecta que solo un proveedor respondió dentro del plazo establecido |
| 8b | Sistema SCM | Evalúa si el proveedor cumple con criterios mínimos establecidos (precio máximo, tiempo máximo de entrega) |
| 8c | Sistema SCM | Si cumple los criterios: Continúa directamente con el paso 11 del flujo básico (genera orden con ese proveedor) |
| 8d | Sistema SCM | Si NO cumple los criterios: Salta a FA-01 (alerta al administrador para gestión manual) |

### **FA-03: Proveedor seleccionado no confirma la orden**

**Paso en que se activa:** Después del paso 16 del flujo básico

| Paso | Actor | Acción |
| ----- | ----- | ----- |
| 16a | Sistema SCM | Detecta que el proveedor no ha confirmado la orden en 48 horas |
| 16b | Sistema SCM | Cancela automáticamente la orden y actualiza su estado a "Cancelada por falta de confirmación" |
| 16c | Sistema SCM | Selecciona al siguiente proveedor mejor puntuado de las cotizaciones recibidas |
| 16d | Sistema SCM | Regresa al paso 11 del flujo básico con el nuevo proveedor seleccionado |
| 16e | Sistema SCM | Si no hay más proveedores disponibles en las cotizaciones, salta a FA-01 (alerta al administrador) |

### **FA-04: Material requerido no está disponible en cantidad necesaria**

**Paso en que se activa:** En el paso 7 del flujo básico

| Paso | Actor | Acción |
| ----- | ----- | ----- |
| 7a | Proveedor | Indica en su cotización que solo tiene disponible una cantidad parcial del material solicitado |
| 7b | Sistema SCM | Registra la cotización con la cantidad disponible y el proveedor como "disponibilidad parcial" |
| 7c | Sistema SCM | Continúa recibiendo las demás cotizaciones (paso 8\) |
| 7d | Sistema SCM | En el paso 10, puede dividir la orden entre múltiples proveedores para completar la cantidad total requerida |
| 7e | Sistema SCM | Genera órdenes de compra separadas a cada proveedor seleccionado con sus respectivas cantidades |
| 7f | Sistema SCM | Continúa con el paso 12 para cada orden generada (envío, actualización, notificación) |

### **FA-05: Todas las cotizaciones exceden el presupuesto disponible**

**Paso en que se activa:** En el paso 9 del flujo básico

| Paso | Actor | Acción |
| ----- | ----- | ----- |
| 9a | Sistema SCM | Detecta que todas las cotizaciones recibidas superan el presupuesto máximo configurado para ese material |
| 9b | Sistema SCM | Genera un reporte comparativo con todas las cotizaciones recibidas |
| 9c | Sistema SCM | Envía alerta al administrador con el reporte comparativo y solicita aprobación o ajuste de presupuesto |
| 9d | Administrador | Revisa las cotizaciones y aprueba manualmente una de ellas, o ajusta el presupuesto máximo en el sistema |
| 9e | Sistema SCM | Una vez recibida la aprobación del administrador, continúa con el paso 11 del flujo básico |

### **FA-06: Error en comunicación con proveedores**

**Paso en que se activa:** En el paso 5 del flujo básico

| Paso | Actor | Acción |
| ----- | ----- | ----- |
| 5a | Sistema SCM | Detecta error al intentar enviar la solicitud de cotización (problemas de red, servidor caído, email no válido) |
| 5b | Sistema SCM | Registra el error en el log del sistema con detalles del proveedor y tipo de error |
| 5c | Sistema SCM | Reintenta el envío automáticamente después de 2 horas |
| 5d | Sistema SCM | Si el error persiste después de 3 intentos, marca al proveedor como "no disponible temporalmente" |
| 5e | Sistema SCM | Si logró contactar al menos 3 proveedores, continúa con el paso 6 del flujo básico |
| 5f | Sistema SCM | Si no logró contactar a 3 proveedores mínimo, salta a FA-01 (notifica al administrador) |

### **FA-07: Base de datos de proveedores vacía o sin proveedores para el material**

**Paso en que se activa:** En el paso 3 del flujo básico

| Paso | Actor | Acción |
| ----- | ----- | ----- |
| 3a | Sistema SCM | Consulta la base de datos y no encuentra proveedores registrados que suministren el material requerido |
| 3b | Sistema SCM | Genera alerta crítica al administrador indicando que no existen proveedores para el material |
| 3c | Sistema SCM | Proporciona los datos del material requerido para facilitar el registro de proveedores |
| 3d | Administrador | Debe registrar al menos un proveedor en el sistema con ese material en su catálogo |
| 3e | Sistema SCM | Una vez registrado el proveedor, el administrador puede reiniciar manualmente el proceso desde el paso 1  |

## **6\. POSCONDICIONES**

### **Postcondición de éxito:**

* Orden de compra generada y enviada al proveedor seleccionado  
* Registro de la orden en el sistema con estado "Confirmada por proveedor"  
* Notificación enviada al administrador sobre la orden generada  
* Inventario proyectado actualizado con la cantidad ordenada  
* Trazabilidad del proceso registrada en el sistema (desde alerta de inventario hasta confirmación de orden)  
* Todas las cotizaciones recibidas quedan almacenadas para referencia futura

### **Postcondición de fracaso:**

* Ninguna orden de compra es generada automáticamente  
* El administrador es notificado para que realice la gestión manual del proceso  
* El registro del intento fallido queda documentado en el sistema con el motivo de la falla  
* El inventario proyectado no se actualiza  
* El material permanece en estado de "reorden requerido" hasta resolución manual

