RNF-001: RENDIMIENTO
RNF-001.1: Tiempos de Respuesta

Descripción:
El sistema debe garantizar tiempos de respuesta óptimos en todas las operaciones.

Actor:
Sistema

Precondiciones:

Sistema en operación normal.
Conectividad estable.

Flujo Principal:

El usuario realiza una solicitud.
El sistema procesa la solicitud.
El sistema retorna el resultado al usuario.

Criterios de Aceptación:

Consultas en menos de 1 segundo.
Reportes básicos en menos de 3 segundos.
Reportes complejos en menos de 10 segundos.
Notificaciones en tiempo real.

Prioridad:
MUST (Crítico)

RNF-001.2: Capacidad y Concurrencia

Descripción:
El sistema debe soportar múltiples usuarios concurrentes sin degradación del servicio.

Actor:
Sistema

Precondiciones:

Múltiples usuarios conectados simultáneamente.

Flujo Principal:

Varios usuarios acceden al sistema.
El sistema gestiona las solicitudes concurrentes.
El sistema mantiene el rendimiento estable.

Criterios de Aceptación:

Soporta mínimo 5 usuarios sin degradación.
Soporta 20 usuarios concurrentes en condiciones normales.
Soporta picos de 50 usuarios simultáneos.

Prioridad:
MUST (Crítico)

RNF-001.3: Escalabilidad

Descripción:
El sistema debe poder escalar en capacidad y funcionalidad sin afectar su desempeño.

Actor:
Sistema

Precondiciones:

Incremento en usuarios o volumen de datos.

Flujo Principal:

Aumenta la carga del sistema.
Se incrementan recursos de infraestructura.
El sistema mantiene su funcionamiento.

Criterios de Aceptación:

Escala hasta 200% de transacciones.
Permite ampliar almacenamiento sin interrupciones.
Soporta nuevos módulos sin afectar el rendimiento.

Prioridad:
SHOULD (Alta)

RNF-002: DISPONIBILIDAD Y CONFIABILIDAD
RNF-002.1: Alta Disponibilidad

Descripción:
El sistema debe estar disponible de forma continua para los usuarios.

Actor:
Sistema

Precondiciones:

Infraestructura operativa.

Flujo Principal:

El sistema se encuentra en ejecución.
Los usuarios acceden al sistema.
El sistema responde sin interrupciones.

Criterios de Aceptación:

Disponibilidad mínima del 99.5% mensual.
Acceso continuo a la información.
Recuperación automática ante fallos.

Prioridad:
MUST (Crítico)

RNF-002.2: Respaldo y Recuperación

Descripción:
El sistema debe garantizar la recuperación de información ante fallos.

Actor:
Sistema

Precondiciones:

Datos almacenados.

Flujo Principal:

El sistema realiza respaldos automáticos.
Ocurre una falla.
El sistema ejecuta proceso de recuperación.
Se restauran los datos.

Criterios de Aceptación:

Backups diarios automáticos.
Backups cada 4 horas.
RTO menor a 4 horas.
RPO menor a 1 hora.

Prioridad:
MUST (Crítico)

RNF-002.3: Continuidad del Servicio

Descripción:
El sistema debe continuar operando ante fallas parciales.

Actor:
Sistema

Precondiciones:

Fallas parciales del sistema.

Flujo Principal:

Se detecta una falla.
El sistema activa modo degradado.
Se mantienen funciones críticas.
Se notifica al equipo técnico.

Criterios de Aceptación:

Plan de continuidad definido.
Operación en modo degradado.
Notificación automática de fallas.

Prioridad:
SHOULD (Alta)

RNF-003: SEGURIDAD
RNF-003.1: Control de Acceso

Descripción:
El sistema debe controlar el acceso mediante autenticación y roles.

Actor:
Usuario / Sistema

Precondiciones:

Usuario intenta acceder.

Flujo Principal:

Usuario ingresa credenciales.
El sistema valida la información.
El sistema permite o deniega acceso.

Criterios de Aceptación:

Implementación de roles (RBAC).
Bloqueo tras 5 intentos fallidos.
Cambio de contraseña cada 90 días.
Timeout de 30 minutos.

Prioridad:
MUST (Crítico)

RNF-003.2: Protección de Datos

Descripción:
El sistema debe proteger los datos sensibles.

Actor:
Sistema

Precondiciones:

Existencia de datos sensibles.

Flujo Principal:

Los datos son transmitidos o almacenados.
El sistema aplica cifrado.
Se restringe acceso no autorizado.

Criterios de Aceptación:

Cifrado con TLS 1.3 y AES-256.
Cumplimiento normativo colombiano.
Enmascaramiento de datos en logs.

Prioridad:
MUST (Crítico)

RNF-003.3: Auditoría

Descripción:
El sistema debe registrar y monitorear actividades.

Actor:
Sistema / Administrador

Precondiciones:

Uso del sistema.

Flujo Principal:

Usuario realiza acciones.
El sistema registra eventos.
El administrador consulta logs.

Criterios de Aceptación:

Registro de accesos.
Logs por 12 meses.
Alertas de actividad sospechosa.

Prioridad:
SHOULD (Alta)

RNF-004: USABILIDAD
RNF-004.1: Interfaz de Usuario

Descripción:
El sistema debe ser intuitivo y fácil de usar.

Actor:
Usuario

Precondiciones:

Usuario accede al sistema.

Flujo Principal:

Usuario interactúa con la interfaz.
El sistema responde visualmente.
Usuario completa tareas.

Criterios de Aceptación:

Máximo 3 clics para funciones principales.
Interfaz consistente.
Retroalimentación inmediata.

Prioridad:
SHOULD (Alta)

RNF-004.2: Curva de Aprendizaje

Descripción:
El sistema debe ser fácil de aprender.

Actor:
Usuario

Precondiciones:

Usuario nuevo.

Flujo Principal:

Usuario recibe capacitación.
Usuario utiliza el sistema.
Usuario ejecuta tareas básicas.

Criterios de Aceptación:

Uso básico en 2 horas.
Ayuda contextual disponible.
Mensajes claros.

Prioridad:
SHOULD (Alta)

RNF-004.3: Accesibilidad

Descripción:
El sistema debe ser accesible desde múltiples dispositivos.

Actor:
Usuario

Precondiciones:

Uso de navegador web.

Flujo Principal:

Usuario accede desde un dispositivo.
El sistema adapta la interfaz.
Usuario navega sin inconvenientes.

Criterios de Aceptación:

Compatible con navegadores modernos.
Diseño responsive.
Soporte múltiples resoluciones.

Prioridad:
SHOULD (Alta)

RNF-005: INTEGRABILIDAD
RNF-005.1: Integración con Sistema Contable

Descripción:
El sistema debe integrarse con el sistema contable existente.

Actor:
Sistema

Precondiciones:

Sistema contable disponible.

Flujo Principal:

Se generan datos financieros.
El sistema sincroniza la información.
Se validan los datos.

Criterios de Aceptación:

Sincronización menor a 5 minutos.
Consistencia de datos.

Prioridad:
MUST (Crítico)

RNF-005.2: Integración con Sistemas Externos

Descripción:
El sistema debe permitir integración con otras plataformas.

Actor:
Sistema

Precondiciones:

Sistemas externos disponibles.

Flujo Principal:

Sistema externo realiza solicitud.
El sistema procesa la petición.
Retorna respuesta.

Criterios de Aceptación:

APIs REST documentadas.
Soporte JSON, XML, CSV.

Prioridad:
SHOULD (Alta)

RNF-006: MANTENIBILIDAD
RNF-006.1: Mantenimiento del Sistema

Descripción:
El sistema debe permitir actualizaciones sin interrupciones.

Actor:
Equipo técnico

Precondiciones:

Necesidad de actualización.

Flujo Principal:

Se despliega la actualización.
El sistema continúa funcionando.
Se aplican cambios.

Criterios de Aceptación:

Zero-downtime.
Actualizaciones críticas en menos de 1 hora.

Prioridad:
SHOULD (Alta)

RNF-006.2: Monitoreo y Diagnóstico

Descripción:
El sistema debe permitir monitoreo continuo.

Actor:
Administrador

Precondiciones:

Sistema en ejecución.

Flujo Principal:

El sistema recolecta métricas.
Detecta anomalías.
Genera alertas.

Criterios de Aceptación:

Monitoreo en tiempo real.
Alertas automáticas.

Prioridad:
SHOULD (Alta)

RNF-007: PORTABILIDAD
RNF-007.1: Acceso al Sistema

Descripción:
El sistema debe ser accesible desde cualquier ubicación.

Actor:
Usuario

Precondiciones:

Conexión a internet.

Flujo Principal:

Usuario accede desde navegador.
El sistema carga la aplicación.
Usuario interactúa con el sistema.

Criterios de Aceptación:

Acceso web sin instalación.
Funcionamiento en la nube.

Prioridad:
SHOULD (Alta)

RNF-008: EFICIENCIA
RNF-008.1: Optimización del Sistema

Descripción:
El sistema debe optimizar el uso de recursos y procesos.

Actor:
Sistema

Precondiciones:

Sistema en operación.

Flujo Principal:

El sistema ejecuta procesos.
Optimiza recursos.
Reduce tiempos de ejecución.

Criterios de Aceptación:

Reducción de tiempos en al menos 50%.
Uso eficiente de recursos.

Prioridad:
SHOULD (Alta)

RNF-009: CUMPLIMIENTO
RNF-009.1: Normativa Legal

Descripción:
El sistema debe cumplir la normativa colombiana vigente.

Actor:
Sistema

Precondiciones:

Operación dentro del territorio colombiano.

Flujo Principal:

Se generan datos del sistema.
Se validan conforme a normativa.
Se generan reportes regulatorios.

Criterios de Aceptación:

Cumplimiento tributario.
Disponibilidad de reportes obligatorios.

Prioridad:
MUST (Crítico)

RNF-010: RESTRICCIONES
RNF-010.1: Restricciones del Sistema

Descripción:
El sistema debe adaptarse a limitaciones técnicas y organizacionales.

Actor:
Organización

Precondiciones:

Infraestructura existente.

Flujo Principal:

Se implementa el sistema.
Se adapta a condiciones existentes.
Opera dentro de las limitaciones.

Criterios de Aceptación:

Costos controlados.
Funcionamiento con conectividad disponible.

Prioridad:
SHOULD (Alta)

RNF-011: DOCUMENTACIÓN
RNF-011.1: Documentación del Sistema

Descripción:
El sistema debe contar con documentación técnica y de usuario completa.

Actor:
Usuario / Técnico

Precondiciones:

Sistema implementado.

Flujo Principal:

Se genera documentación del sistema.
Se actualiza ante cambios.
Usuarios consultan la documentación.

Criterios de Aceptación:

Manuales disponibles.
Documentación actualizada.
Guías accesibles para usuarios y técnicos.

Prioridad:
SHOULD (Alta)

RNF-012: CALIDAD DE DATOS
RNF-012.1: Integridad y Precisión

Descripción:
El sistema debe garantizar la integridad y precisión de los datos.

Actor:
Sistema

Precondiciones:

Datos ingresados en el sistema.

Flujo Principal:

Se registran datos.
El sistema valida la información.
Se almacenan datos consistentes.

Criterios de Aceptación:

Precisión del 99.9%.
Validaciones activas.
Prevención de duplicados.

Prioridad:
MUST (Crítico)

