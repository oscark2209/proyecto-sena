**Requisitos Funcionales:**  
**Gerente de Logistica y Almacen**

- Las consultas de inventario se deben hacer de manera instantánea  
- Las notificaciones de stock bajo o pedidos urgentes también deben ser inmediatas  
- Se deben poder conectar mínimo 5 personas en simultáneo en el sistema  
- Hacer que el sistema ayude a mejorar la calidad de atención a nuestros clientes   
- El sistema debe ayudar a generar orden en la empresa ya sea en entregas como almacenamiento  
- El sistema debe poder evitar descuadres a la hora de ver el material esto significa que no haya material faltante o sobrante 

**Gerente de Compras**

- El sistema debe permitir asegurar el suministro de las materias primas   
- El sistema debe facilitar la gestión de la relación con los proveedores, buscando calidad, precio y condiciones de entrega.  
- El sistema debe proporcionar visibilidad en tiempo real de los niveles de inventario.  
- El sistema debe automatizar gran parte del proceso de gestión de órdenes de compra.  
- El sistema debe soportar el proceso de selección de proveedores (por referencias, calidad y precio).  
- El sistema debe reemplazar o integrar la base de datos interna para manejar a los proveedores.  
- El sistema debe gestionar las solicitudes de compra de Logística o Producción.  
- El sistema debe mantener un historial completo de interacciones con proveedores.

**Jefe de Sistemas/TI**

- Registro detallado y actualización de inventario en tiempo real con validación automática contra pedidos.  
- Automatización de Órdenes de Compra y evaluación formal del desempeño de proveedores.  
- Rastreo en tiempo real del transporte, optimización de rutas y confirmación digital de entrega.  
- Establecer una "única fuente de verdad" y eliminar la dependencia de procesos manuales.  
- Generación de informes clave y alertas sobre stock e incidencias críticas.  
- Integración obligatoria con el sistema contable actual.

**REQUISITOS FUNCIONALES AMPLIADOS**  
**Consulta de Inventario**

* El sistema debe permitir consultas de inventario en tiempo real con filtros por categoría, ubicación, lote y fecha de vencimiento.  
* Debe mostrar los niveles actuales, mínimos y máximos de stock  
* Debe incluir búsqueda por código de barras, SKU o nombre del producto

**Registro y Actualización de Inventario**

* El sistema debe registrar automáticamente entradas y salidas de inventario.  
* Debe validar automáticamente las transacciones contra pedidos y órdenes de compra  
* Deben ajustes permitir manuales con justificación y aprobación por niveles jerárquicos  
* Debe mantener la trazabilidad completa de todos los movimientos.

**Sistema de Alertas y Notificaciones**

* El sistema debe enviar notificaciones automáticas cuando el stock alcance el nivel mínimo.  
* Debe alerta sobre pedidos urgentes pendientes de procesar  
* Debe notificar sobre productos próximos a vencer  
* Debe alertar sobre descuadres o discrepancias en el inventario.  
* Las notificaciones deben ser configurables por usuario y enviarse por múltiples canales (correo electrónico, SMS, notificación en la aplicación)

**Control de Descuadres**

* El sistema debe detectar automáticamente discrepancias entre inventario físico y sistema.  
* Debe generar informes de diferencias y solicitar reconciliación.  
* Debe registrar causas de descuadres y responsables

**RF- Gestión de Compras y Proveedores**

**Gestión de Proveedores**

* El sistema debe permitir el registro completo de proveedores (datos de contacto, condiciones comerciales, productos suministrados)  
* Debe mantener base de datos centralizada de proveedores con toda su información histórica.  
* Debe permitir la clasificación de proveedores por categorías (materia prima, insumos, servicios, etc.)

**Evaluación y Selección de Proveedores**

* El sistema debe permitir el registro de referencias de proveedores.  
* Debe calcular automáticamente indicadores de desempeño: calidad, cumplimiento de plazos, precios competitivos  
* Debe generar ranking de proveedores basado en criterios configurables  
* Debe mantener historial de evaluaciones y comparativas.


**Gestión de Órdenes de Compra**

* El sistema debe permitir crear órdenes de compra desde solicitudes de Logística o Producción  
* Debe automatizar la generación de OC basada en puntos de reordenamiento  
* Debe permitir aprobaciones por niveles según montos establecidos  
* Debe hacer seguimiento del estado de cada OC (pendiente, aprobado, enviado, recibida parcial/total, cancelada)  
* Debe permitir modificaciones y cancelaciones con registro de justificación

**Solicitudes de Compra**

* El sistema debe permitir que diferentes departamentos generen solicitudes de compra.  
* Debe incluir flujo de aprobación configurable según tipo y monto  
* Debe consolidar solicitudes similares para optimizar compras

**Gestión de Materias Primas**

* El sistema debe asegurar la disponibilidad de materias primas mediante alertas tempranas.  
* Debe calcular las necesidades futuras basadas en producción planificada  
* Debe reabastecimiento automático según consumo histórico y proyecciones

**Historial de Interacciones con Proveedores**

* El sistema debe registrar todas las comunicaciones, cotizaciones, reclamos y acuerdos.  
* Debe mantener históricos de precios y condiciones comerciales.  
* Debe almacenar documentos relacionados (cotizaciones, contratos, certificados)


  
**RF \- Logística y Distribución**

**Gestión de Entregas**

* El sistema debe registrar y programar entregas a clientes.  
* Debe generar hojas de ruta optimizadas  
* Debe permitir reprogramación y gestión de excepciones.

**Rastreo de Transporte**

* El sistema debe permitir el seguimiento en tiempo real del estado de los envíos.  
* Debe registrar ubicación, estado y eventos durante el transporte  
* Debe notificar permitir a los clientes sobre el estado de su pedido

**Optimización de Rutas**

* El sistema debe sugerir rutas optimizadas considerando distancia, tráfico y prioridad.  
* Debe agrupar entregas según zona geográfica y ventanas horarias

 **Confirmación de Entrega**

* El sistema debe permitir confirmación digital de entregas.  
* Debe capturar firma electrónica, fotografías y observaciones.  
* Debe actualizar automáticamente el inventario tras confirmación

**Gestión de Almacenamiento**

* El sistema debe asignar ubicaciones óptimas para productos según rotación y características.  
* Debe generar órdenes de recolección optimizadas  
* Debe controlar la capacidad y ocupación de almacén.

**RF \- Reportes e Informes**

**Generación de Informes**

* El sistema debe generar informes de niveles de inventario (actual, histórico, proyectado)  
* Debe producir informes de desempeño de proveedores.  
* Debe generar análisis de rotación de productos.  
* Debe crear informes de costos de almacenamiento y logística.  
* Debe generar informes de incidencias y resoluciones.

**Tablero Ejecutivo**

* El sistema debe proporcionar tableros visuales con KPIs principales.  
* Debe personalizar permitir vistas por rol.  
* Debe mostrar alertas críticas pendientes

**Análisis y Proyecciones**

* El sistema debe analizar las tendencias de consumo.  
* Debe generar proyecciones de necesidades futuras  
* Debe identificar productos de baja rotación o obsoletos

**RF \- Integraciones**  
**Integración con Sistema Contable**

* El sistema debe sincronizar automáticamente órdenes de compra con contabilidad  
* Debe enviar información de costos de inventario  
* Debe compartir datos de proveedores y pagos.  
* Debe mantener consistencia de datos financieros

**Integración con Producción**

* El sistema debe recibir requerimientos de materiales desde producción.  
* Debe notificar disponibilidad de materias primas  
* Debe actualizar consumos de producción en inventario

**RF \- Gestión de Usuarios y Seguridad**

**Control de accesos**

* El sistema debe implementar control de acceso basado en roles (RBAC)  
* Debe definir permitir perfiles: Gerente de Compras, Gerente de Logística, Almacenista, Comprador, Auditor, etc.  
* Debe configurar permitir permisos granulares por módulo y función

**Auditoría y Trazabilidad**

* El sistema debe registrar todas las acciones de los usuarios (quién, qué, cuándo)  
* Debe mantener un registro de cambios en datos críticos  
* Debe permitir consultas de auditoría con filtros múltiples

**Gestión de Sesiones Concurrentes**

* El sistema debe soportar un mínimo de 5 usuarios simultáneos.  
* Debe controlar las sesiones activas por usuario  
* Debe manejar bloqueos optimistas para evitar conflictos de edición.

**RF \- Atención al Cliente**  
**Consulta de Estado de Pedido**s

* El sistema debe permitir que el área comercial consulte estado de pedidos en tiempo real  
* Debe mostrar disponibilidad de productos para promesa de entrega  
* Debe notificar automáticamente a los clientes sobre cambios en sus pedidos

**Gestión de Reclamos**

* El sistema debe registrar reclamos relacionados con entregas  
* Debe hacer seguimiento hasta la resolución  
* Debe generar indicadores de satisfacción


**Requisitos No funcionales:**  
**Gerente de Logistica y Almacen**

- Las consultas de inventario se deben hacer de manera instantánea  
- Las notificaciones de stock bajo o pedidos urgentes también deben ser inmediatas  
- Se deben poder conectar mínimo 5 personas en simultáneo en el sistema  
- Hacer que el sistema ayude a mejorar la calidad de atención a nuestros clientes   
- El sistema debe ayudar a generar orden en la empresa ya sea en entregas como almacenamiento  
- El sistema debe poder evitar descuadres a la hora de ver el material esto significa que no haya material faltante o sobrante

**Gerente de Compras**

- El sistema debe soportar el número esperado de usuarios del departamento de compras utilizando el sistema simultáneamente.  
- La información de proveedores y precios debe estar protegida contra accesos no autorizados.  
- El sistema debe proporcionar acceso constante a la información de inventario, proveedores y procesos de compra para la toma de decisiones.  
- El sistema debe ser intuitivo y fácil de usar, considerando que el proceso actual de evaluación de proveedores es "un poco informal" y basado en la "experiencia".  
- El sistema debe integrarse con el sistema de contabilidad existente para la emisión de órdenes de compra y la gestión de pagos.

**Jefe de Sistemas/TI**

- Protección "extremadamente crítica" para la información confidencial y controles de acceso robustos basados en roles.  
- Alta disponibilidad para garantizar un servicio estable y siempre accesible.  
- Tiempos de respuesta "sub-segundo" para consultas básicas y "en tiempo real" para notificaciones.

**Restricciones:** 

- No se tiene un presupuesto ilimitado  
- La cuenta se debe hacer por orden trimestral  
- Fuerte preferencia por soluciones basadas en la nube (SaaS), siempre que cumplan con seguridad y ubicación de datos.


