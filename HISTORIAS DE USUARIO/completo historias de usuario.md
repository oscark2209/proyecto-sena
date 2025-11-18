Historias de usuarios

**IDENTIFICACIÓN:**HU-001  
**Título:** Consulta y comparación de proveedores.  
**Épica/Módulo:**RF-001: Gestión de Proveedores  
**Prioridad:**  DEBE  
**Puntos de Historia:** 5  
**Sprint/Iteración:** Por definir

**Como** responsable de compras  
**Quiero** consultar y comparar proveedores registrados  
**Para** elegir la mejor opción según calidad, precio y plazo de entrega

**Descripción:**  
La selección de proveedores impacta en los costos, la calidad de los productos y los tiempos de entrega. El sistema debe permitir listar, filtrar y comparar proveedores en función de historial de cumplimiento, precios y calificaciones de otros usuarios.

**Criterios de aceptación**   
Escenario 1: Consulta básica  
Dado que existen proveedores en el sistema  
Cuando accedo al módulo de proveedores  
Entonces veo el listado completo con precios, calificaciones y plazos

Escenario 2: Comparación avanzada  
Dado que filtro por material específico  
Cuando selecciona dos proveedores  
Entonces puedo comparar sus condiciones en pantalla

Escenario 3: Proveedor sin datos suficientes  
Dado que un proveedor no tiene historial  
Cuando el usuario lo consulta  
Entonces el sistema muestra una advertencia de datos insuficientes

**IDENTIFICACIÓN:**HU-002  
**Título:** Generación automática de cotizaciones  
**Épica/Módulo:**RF-002: Cotizaciones Automatizadas  
**Prioridad:** DEBE  
**Puntos de Historia:**8  
**Sprint/Iteración:** Por definir

**Como** comprador  
**Quiero** generar cotizaciones automáticas según mis necesidades de compra  
**Para** reducir tiempos y errores manuales en adquisiciones

**Descripción:**  
El usuario debe seleccionar productos/servicios y recibir una cotización automática basada en listas de precios y condiciones de proveedores disponibles.

**Criterios de aceptación**   
Escenario 1: Cotización estándar  
Dado que existe una necesidad de compra  
Cuando ingresan los materiales y cantidades requeridas  
Entonces el sistema genera una cotización precisa en menos de un minuto

Escenario 2: Faltante de precios  
Dado que un producto no tiene precio definido  
Cuando intento cotizarlo  
Entonces el sistema lo excluye y lo reporta al usuario

**IDENTIFICACIÓN:**HU-003  
**Título:** Generación automática de órdenes de compra  
**Épica/Módulo:** RF-003: Órdenes de compra automatizadas  
**Prioridad:** DEBERÍA  
**Puntos de Historia:**8  
**Sprint/Iteración:** Por definir

**Como** responsable de los  
**Quiero** que el sistema genere órdenes de compra al llegar al stock mínimo  
**Para** evitar faltantes y mantener la operación fluida

**Descripción:**  
Garantizar el stock mínimo ayuda a prevenir interrupciones. La funcionalidad busca automatizar esta tarea, notificando únicamente aquellas órdenes a los responsables para su validación.

**Criterios de aceptación**   
Escenario 1: Stock bajo  
Dado que el inventario bajo del mínimo  
Cuando el sistema lo detecta  
Entonces se genera una orden de compra automática y se notifica al responsable

Escenario 2: Revisión y aprobación  
Dado que existe una orden automatizada pendiente  
Cuando el responsable revisa la orden  
Entonces puede aprobarla o editarla antes de su envío

**HU-004 Registro y Trazabilidad de Movimientos**

**Épica/Módulo:** RF-00: Gestión de Inventario  
**Prioridad:** DEBE  
**Puntos de Historia:**8  
**Sprint/Iteración:** Por definir

**Historia de Usuario**

Como almacenista,  
quiero que el sistema registre automáticamente todas las entradas y salidas de inventario, vinculando cada movimiento a su pedido u orden de compra.  
Para mantener la trazabilidad completa, evitar pérdidas y garantizar que cada movimiento sea verificable.

**Descripción detallada**

La trazabilidad de movimientos es crítica para la auditoría, el control y la prevención de pérdidas. Cada transacción debe estar asociada a una justificación, pedido, orden de compra o ajuste autorizado, lo que permite reconstruir el historial de cada producto desde su entrada hasta su salida del inventario.

**Criterios de aceptación** 

Escenario 1: Registro automático de movimiento por pedido

* Dado que se realiza una recepción de productos por una orden de compra existente

* Cuando el usuario registra la recepción

* Entonces el sistema crea un movimiento de entrada asociado a la orden respectiva, con datos de cantidad, fecha y usuario

Escenario 2: Registro de salida por entrega

* Dado que se prepara una entrega de productos para un pedido confirmado

* Cuando el usuario registra la salida del inventario

* Entonces el sistema guarda el movimiento de salida con referencia al pedido y actualiza el stock.

Escenario 3: Consulta de trazabilidad

* Dado que un auditor revisa un producto.

* Cuando solicita el historial de movimientos.

* Entonces el sistema muestra todos los movimientos asociados, incluyendo tipo, fecha, responsable y justificación.

  **HU-005 Consulta de productos y servicios**

  **Épica/Módulo:**RF-XX: Información comercial  
  **Prioridad:**DEBERÍA  
  **Puntos de Historia:**3  
  **Sprint/Iteración:** Por definir

  **Historia de Usuario**

  Como visitante  
  Quiero consultar fácilmente información sobre productos y servicios  
  Para decidir cuál se ajusta a mis necesidades.

  **Descripción detallada**

  El acceso público a los catálogos es clave para captar nuevos clientes; la información debe ser clara, actualizada y fácil de filtrar por categorías o características, incluyendo descripciones, imágenes y beneficios destacados.

  **Criterios de aceptación** 

  Escenario 1: Consulta de catálogo

* Dado que un visitante accede al sitio

* Cuando navega o aplica filtros por servicios/productos

* Entonces visualiza detalles relevantes, imágenes y especificaciones

  Escenario 2: Producto no encontrado

* Dado que el visitante busca un término inexistente

* Cuando realiza la búsqueda

* Entonces el sistema muestra el mensaje “No se encontraron resultados”

**HU-006 Cotización en línea rápida**

**Épica/Módulo:** RF-02: Gestión de Cotizaciones  
**Prioridad:** DEBE  
**Puntos de Historia:**5  
**Sprint/Iteración:** Por definir

**Historia de Usuario**

Como usuario registrado,  
quiero cotizar un producto en línea ingresando mis parámetros  
para recibir el precio estimado y las condiciones sin esperar contacto comercial.

**Descripción detallada**

La generación inmediata de cotizaciones agiliza la conversión de usuarios y reduce la carga al equipo comercial. Los parámetros pueden incluir cantidad, opciones de configuración, entrega y otros criterios relevantes.

**Criterios de aceptación** 

Escenario 1: Cotización exitosa

* Dado que el usuario está autenticado

* Cuando ingresa todos los parámetros requeridos y confirma

* Entonces el sistema muestra el precio, las condiciones y la validez de la cotización

Escenario 2: Parámetros incompletos

* Dado que hay campos vacíos

* Cuando intenta calcular la cotización

* Entonces el sistema solicita completar los datos obligatorios

**HU-007 Filtrado de cotizaciones**

**Épica/Módulo:** RF-02: Gestión de Cotizaciones  
**Prioridad:** COULD  
**Puntos de Historia:**3  
**Sprint/Iteración:** Por definir

**Historia de Usuario**

Como usuario,  
quiero filtrar cotizaciones por precio y características  
para encontrar opciones que se ajusten a mi presupuesto.

**Descripción detallada**

El filtro mejora la experiencia al permitir comparar rápidamente alternativas de acuerdo a las necesidades individuales, optimizando la toma de decisiones de compra.

**Criterios de aceptación** 

Escenario 1: Filtrado por precio

* Dado que existen varias cotizaciones recibidas

* Cuando se utiliza el filtro de precio máximo

* Entonces solo se muestran cotizaciones menores o iguales a dicho monto

Escenario 2: Filtrado por característica

* Dado que tiene cotizaciones recibidas

* Cuando se filtra por una característica específica

* Entonces ve únicamente opciones que cumplen con ese parámetro

**HU-008 Envío de cotización por correo electrónico**

**Épica/Módulo:** RF-02: Gestión de Cotizaciones  
**Prioridad:** DEBERÍA  
**Puntos de Historia:**2  
**Sprint/Iteración:** Por definir

**Historia de Usuario**

Como usuario  
Quiero recibir mi cotización por correo electrónico  
Para conservarla y consultarla cuando lo necesite.

**Descripción detallada**

El envío automático del documento de cotización permite a los clientes disponer de una referencia formal y trazabilidad para los siguientes contactos.

**Criterios de aceptación** 

Escenario 1: Envío automático exitoso

* Dado que el usuario genera una cotización

* Cuando solicita el envío a su correo

* Entonces recibe el correo con el PDF en minutos

Escenario 2: Falla en el envío

* Dado que hay un error de conexión o correo incorrecto

* Cuando se procesa el envío

* Entonces se muestra un mensaje de error y se pide verificar datos

**HU-009 Comparación de cotizaciones**

**Épica/Módulo:** RF-02: Gestión de Cotizaciones  
**Prioridad:** COULD  
**Puntos de Historia:**3  
**Sprint/Iteración:** Por definir

**Historia de Usuario**

Como visitante frecuente  
, quiero comparar varias cotizaciones en una sola vista  
para facilitar mi decisión de compra.

**Descripción detallada**

El usuario puede seleccionar múltiples cotizaciones y visualizarlas una al lado de la otra, comparando criterios clave como precio, plazo de entrega, garantías y condiciones.

**Criterios de aceptación** 

Escenario 1: Selección de múltiples cotizaciones

* Dado que existen varias cotizaciones en el sistema

* Cuando se marcan varias para comparar

* Entonces el sistema muestra una tabla comparativa clara

Escenario 2: Visualización de diferencias destacadas

* Dado que hay diferencias notables entre cotizaciones

* Cuando se muestran los datos

* Entonces el sistema resalta en color los valores más ventajosos o distintivos

**HU-010 Búsqueda de servicios**

**Épica/Módulo:** RF-XX: Información comercial  
**Prioridad:** DEBERÍA  
**Puntos de Historia:**2  
**Sprint/Iteración:** Por definir

**Historia de Usuario**

Como visitante,  
quiero buscar información sobre los servicios disponibles  
para elegir el más adecuado para mí.

**Descripción detallada**

La funcionalidad de búsqueda facilita la localización de servicios relevantes empleando palabras clave, filtros o categorías, mejorando la experiencia del usuario.

**Criterios de aceptación** 

Escenario 1: Búsqueda efectiva

* Dado que el visitante tiene una necesidad

* Cuando ingresa palabras clave en la barra de búsqueda

* Entonces se le presentan los servicios relacionados inmediatamente.

Escenario 2: Ausencia de servicios coincidentes

* Dado que no existe el servicio requerido

* Cuando realiza la búsqueda

* Entonces se muestra un mensaje con sugerencias de contacto para asesoría.

**HU-011 Aprobación de cotizaciones con monto alto**

**Épica/Módulo:** RF-02: Gestión de Cotizaciones  
**Prioridad:** DEBE  
**Puntos de Historia:**5  
**Sprint/Iteración:** Por definir

**Historia de Usuario**

Como gerente de compras,  
quiero aprobar cotizaciones con montos altos desde el portal  
para mantener el control sobre el presupuesto.

**Descripción detallada**

Para el cumplimiento de las políticas de control interno, las cotizaciones que superen un umbral definido requieren la aprobación del gerente antes de proceder.

**Criterios de aceptación** 

Escenario 1: Cotización alta detectada

* Dado que existe una cotización por encima del monto establecido

* Cuando se solicita aprobación desde el sistema

* Entonces el gerente es notificado y puede aprobar o rechazar con observaciones

Escenario 2: Registro de decisión

* Dado que el gerente actúa sobre la solicitud

* Cuando toma una decisión

* Entonces el sistema registra la acción y bloquea cualquier otro proceso hasta recibir esa respuesta

**HU-012 Notificación proveedor con bajo desempeño**

**Épica/Módulo:** RF-001: Gestión de Proveedores  
**Prioridad:** DEBERÍA  
**Puntos de Historia:**3  
**Sprint/Iteración:** Por definir

**Historia de Usuario**

Como responsable de calidad,  
quiero recibir una alerta cuando un proveedor tenga incumplimientos repetidos  
para evaluarlo y tomar acciones correctivas.

**Descripción detallada**

El sistema monitorea indicadores de desempeño (entregas retrasadas, reclamaciones, calidad no conforme) y, si un proveedor supera el umbral de incidencias, envía una notificación automática al responsable de calidad para que defina si se suspende, audita o renegocia el contrato.

**Criterios de aceptación** 

Escenario 1: Generación automática de alerta

* Dado que un proveedor acumula tres o más incumplimientos consecutivos

* Cuando se actualizan los KPI y se detecta la condición

* Entonces el sistema envía una alerta al responsable asignado

Escenario 2: Trazabilidad de acciones

* Dado que se recibe la alerta

* Cuando el responsable toma y registra medidas correctivas

* Entonces queda registrado en el historial del proveedor

**HU-013 Cotización rechazada por condiciones**

**Épica/Módulo:** RF-002: Cotizaciones  
**Prioridad:** PODRÍA  
**Puntos de Historia:**3  
**Sprint/Iteración:** Por definir

**Historia de Usuario**

Como comprador  
Quiero ser notificado si una cotización es rechazada por no cumplir condiciones  
Para buscar alternativas de inmediato

**Descripción detallada**

El sistema valida automáticamente cada cotización recibida y, si no cumple criterios (precio, plazo, especificaciones), la rechaza y notifica al usuario, especificando el motivo para permitir reaccionar rápido

**Criterios de aceptación** 

Escenario 1: Rechazo automático de cotización

* Dado que se registra una cotización

* Cuando el sistema detecta condiciones incumplidas

* Entonces notifica al comprador con la razón específica

Escenario 2: Propuesta de alternativas

* Dado que la cotización fue rechazada

* Cuando el usuario lo solicita

* Entonces el sistema sugiere proveedores alternativos

**HU-014 Validación de órdenes generadas**

**Épica/Módulo:** RF-003: Órdenes de Compra  
**Prioridad:** DEBERÍA  
**Puntos de Historia:**5  
**Sprint/Iteración:** Por definir

**Historia de Usuario**

Como jefe de compras:  
Quiero aprobar o rechazar las órdenes de compra generadas automáticamente  
para controlar las compras críticas antes de enviarlas a los proveedores.

**Descripción detallada**

Las órdenes de compra automáticas por reorden/alerta requieren la aprobación del jefe para evitar compras innecesarias, duplicadas o fuera de presupuesto.

**Criterios de aceptación** 

Escenario 1: Solicitud de aprobación

* Dado que el sistema genera una OC

* Cuando se supera el monto crítico

* Entonces el jefe es notificado y puede aprobar/rechazar desde el portal.

Escenario 2: Registro de decisión

* Dado que el jefe actúa sobre la OC

* Cuando aprueba o rechaza

* Entonces la acción y el motivo quedan registrados, y solo las aprobadas se envían a los proveedores.

**HU-015 Notificación automática de despacho**

**Épica/Módulo:** RF-004: Logística  
**Prioridad:** DEBE  
**Puntos de Historia:**3  
**Sprint/Iteración:** Por definir

**Historia de Usuario**

Como cliente:  
Quiero recibir una alerta cuando mi pedido se despacha  
para conocer el avance de mi entrega

**Descripción detallada**

Al crear la guía de despacho, el sistema envía una notificación al cliente por correo electrónico y a su cuenta, lo que le permite seguir su pedido y preparar la recepción.

**Criterios de aceptación** 

Escenario 1: Envío de alerta de despacho

* Dado que el pedido está preparado

* Cuando se confirma el despacho

* Entonces el cliente recibe una notificación con datos clave (guía, fecha estimada)

**HU-016 Consulta de estado de pedido**

**Épica/Módulo:** RF-006: Portal Cliente  
**Prioridad:** DEBE  
**Puntos de Historia:**5  
**Sprint/Iteración:** Por definir

**Historia de Usuario**

Como cliente,  
quiero consultar el estado actualizado de mi pedido  
para saber cuándo llegará y planificar mi operación.

**Descripción detallada**

En el portal, el cliente puede ver la información detallada del pedido: fechas, estado (pendiente, despachado, entregado), ubicación y eventos, lo que facilita la coordinación logística propia.

**Criterios de aceptación** 

Escenario 1: Consulta exitosa de pedido

* Dado que el cliente accede al portal

* Cuando selecciona el pedido

* Entonces ve el estado actualizado, la ubicación y la última acción realizada

Escenario 2: Pedido no encontrado

* Dado que el pedido no existe

* Cuando se consulta

* Entonces se muestra un mensaje de error y una sugerencia de contacto

**HU-017 Descarga de facturas y comprobantes**

**Épica/Módulo:** RF-006: Portal Cliente  
**Prioridad:** DEBERÍA  
**Puntos de Historia:**3  
**Sprint/Iteración:** Por definir

**Historia de Usuario**

Como cliente,  
quiero descargar facturas y comprobantes de cada compra  
para facilitar el control contable de mi empresa.

**Descripción detallada**

El sistema permite descargar documentos fiscales y comprobantes en PDF desde el historial de compras, facilitando la gestión administrativa.

**Criterios de aceptación** 

Escenario 1: Descarga exitosa

* Dado que la compra fue realizada

* Cuando el cliente accede al historial y selecciona la factura

* Entonces el sistema permite descargar el comprobante

Escenario 2: Documento no disponible

* Dado que la factura no se ha emitido

* Cuando se intenta descargar

* Entonces se informa que está en proceso

**HU-018 Visualización de catálogo público**

**Épica/Módulo:** RF-007: Página Pública  
**Prioridad:** DEBE  
**Puntos de Historia:**3  
**Sprint/Iteración:** Por definir

**Historia de Usuario**

Como visitante  
Quiero ver el catálogo general de productos y servicios ofrecidos  
Para evaluar si se ajustan a mis necesidades empresariales.

**Descripción detallada**

El catálogo con información clara, imágenes y filtros ayuda a captar interesados ​​y facilita que los visitantes encuentren las soluciones adecuadas.

**Criterios de aceptación** 

Escenario 1: Visualización básica

* Dado que el visitante accede

* Cuando navega por el catálogo

* Entonces puede ver productos, descripciones, imágenes y categorías

Escenario 2: Filtro y búsqueda

* Dado que existen muchos productos

* Cuando usa los filtros

* Entonces se le presentan solo los relevantes

**HU-019 Acceso a preguntas frecuentes (FAQ)**

**Épica/Módulo:** RF-007: Página Pública  
**Prioridad:** DEBE  
**Puntos de Historia:**3  
**Sprint/Iteración:** Por definir

**Historia de Usuario**

Como visitante,  
quiero consultar una sección de preguntas frecuentes  
para resolver dudas básicas sobre el sistema, la empresa o sus servicios.

**Descripción detallada**

Una sección de preguntas frecuentes estructurada resuelve la mayoría de las dudas iniciales, reduce el volumen de consultas al equipo de soporte y mejora la experiencia del usuario.

**Criterios de aceptación** 

Escenario 1: Acceso a FAQ

* Dado que el visitante busca información

* Cuando selecciona FAQ desde la página principal

* Entonces visualiza la lista de preguntas y respuestas

Escenario 2: Búsqueda en FAQ

* Dado que existen muchas preguntas

* Cuando escribe palabras clave

* Entonces solo se muestran las respuestas relevantes

**HU-020 Recepción de órdenes de compra**

**Épica/Módulo:** RF-008: Portal  
**Prioridad:** DEBE  
**Puntos de Historia:**5  
**Sprint/Iteración:** Por definir

**Historia de Usuario**

Como proveedor  
Quiero recibir una notificación y acceso inmediato a órdenes de compra aprobadas  
Para iniciar cuanto antes la preparación del pedido.

**Descripción detallada**

El sistema envía automáticamente una notificación y habilita la consulta y descarga de la OC desde el portal, permitiendo tiempos de respuesta ágiles.

**Criterios de aceptación** 

Escenario 1: Notificación de OC

* Dado que una OC fue aprobada

* Cuando el proveedor inicia sesión

* Entonces recibe una alerta y acceso al documento

Escenario 2: Documento descargable

* Dado que la OC está aprobada

* Cuando el proveedor accede a la OC

* Entonces puede descargar y visualizar el documento


