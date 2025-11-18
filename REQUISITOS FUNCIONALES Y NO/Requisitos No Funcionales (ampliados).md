# **Requisitos No Funcionales**

---

## **RNF-01: RENDIMIENTO**

### **RNF-01.0: Tiempos de Respuesta**

* Las consultas de inventario deben ejecutarse de manera instantánea (sub-segundo, \< 1 segundo).  
* La generación de reportes básicos debe completarse en menos de 3 segundos.  
* La generación de reportes complejos y dashboards ejecutivos debe completarse en menos de 10 segundos.  
* Las notificaciones de stock bajo, pedidos urgentes o alertas críticas deben ser inmediatas (tiempo real).

### **RNF-01.1: Capacidad y Concurrencia**

* El sistema debe soportar un mínimo de 5 usuarios simultáneos sin degradación del rendimiento.  
* El sistema debe permitir hasta 20 usuarios concurrentes en operaciones normales.  
* El sistema debe manejar picos de hasta 50 usuarios simultáneos durante períodos críticos (cierre de mes, inventarios).

### **RNF-01.2: Escalabilidad**

* El sistema debe ser escalable para soportar crecimiento de hasta 200% en volumen de transacciones sin cambios de arquitectura.  
* Debe permitir el incremento de capacidad de almacenamiento de datos sin interrupciones del servicio.  
* Debe soportar la adición de nuevos módulos o funcionalidades sin afectar el rendimiento de los existentes.

---

## **RNF-02: DISPONIBILIDAD Y CONFIABILIDAD**

### **RNF-02.0: Alta Disponibilidad**

* El sistema debe garantizar una disponibilidad del 99.5% mensual (tiempo de inactividad máximo de 3.6 horas/mes).  
* El sistema debe proporcionar acceso constante a la información de inventario, proveedores y procesos de compra para la toma de decisiones.  
* El sistema debe implementar mecanismos de recuperación automática ante fallos.

### **RNF-02.1: Respaldo y Recuperación**

* El sistema debe realizar respaldos automáticos diarios de toda la información.  
* Debe mantener respaldos incrementales cada 4 horas durante horario operativo.  
* El tiempo de recuperación objetivo (RTO) debe ser menor a 4 horas.  
* El punto de recuperación objetivo (RPO) debe ser menor a 1 hora (pérdida máxima de datos).

### **RNF-02.2: Continuidad del Servicio**

* El sistema debe contar con plan de continuidad operativa documentado.  
* Debe permitir operación en modo degradado ante fallas parciales, manteniendo funciones críticas activas.  
* Debe notificar automáticamente al equipo técnico sobre fallas o anomalías del sistema.

---

## **RNF-03: SEGURIDAD**

### **RNF-03.0: Control de Acceso y Autenticación**

* El sistema debe implementar control de acceso basado en roles (RBAC) de manera estricta.  
* Debe requerir autenticación segura mediante usuario y contraseña con políticas de complejidad configurables.  
* Debe implementar bloqueo automático de cuenta después de 5 intentos fallidos de inicio de sesión.  
* Debe forzar el cambio de contraseña cada 90 días.  
* Debe mantener sesiones con timeout automático después de 30 minutos de inactividad.

### **RNF-03.1: Protección de Datos Sensibles**

* La información de proveedores, precios y condiciones comerciales debe estar protegida contra accesos no autorizados (clasificación: extremadamente crítica).  
* Los datos financieros y de costos deben estar cifrados en tránsito (TLS 1.3) y en reposo (AES-256).  
* El sistema debe cumplir con normativas de protección de datos personales aplicables en Colombia.  
* Debe implementar enmascaramiento de datos sensibles en logs y auditoría.

### **RNF-03.2: Auditoría y Trazabilidad de Seguridad**

* El sistema debe registrar todos los intentos de acceso (exitosos y fallidos).  
* Debe mantener logs de auditoría inmutables por al menos 12 meses.  
* Debe permitir la exportación de logs de seguridad para análisis forense.  
* Debe alertar sobre actividades sospechosas o intentos de acceso no autorizados.

---

## **RNF-04: USABILIDAD**

### **RNF-04.0: Interfaz de Usuario**

* El sistema debe ser intuitivo y fácil de usar, considerando que algunos procesos actuales son informales y basados en experiencia.  
* La interfaz debe seguir principios de diseño consistentes en todos los módulos.  
* Debe requerir máximo 3 clics para acceder a funciones principales.  
* Debe proporcionar retroalimentación visual inmediata sobre acciones del usuario.

### **RNF-04.1: Curva de Aprendizaje**

* Los usuarios deben poder realizar tareas básicas después de máximo 2 horas de capacitación.  
* El sistema debe incluir ayuda contextual y tooltips en funciones complejas.  
* Debe proporcionar mensajes de error claros y orientados a la solución.  
* Debe incluir manual de usuario y videos tutoriales integrados.

### **RNF-04.2: Accesibilidad**

* El sistema debe ser accesible desde navegadores web modernos (Chrome, Firefox, Edge, Safari \- últimas 2 versiones).  
* Debe ser responsive y adaptarse a diferentes tamaños de pantalla (escritorio, tablet).  
* Debe soportar múltiples resoluciones de pantalla sin pérdida de funcionalidad.

---

## **RNF-05: INTEGRABILIDAD**

### **RNF-05.0: Integración con Sistema Contable**

* El sistema debe integrarse obligatoriamente con el sistema contable actual.  
* La sincronización de datos debe realizarse en tiempo real o con latencia máxima de 5 minutos.  
* Debe garantizar consistencia de datos financieros entre ambos sistemas mediante validaciones automáticas.  
* Debe proporcionar mecanismos de reconciliación ante discrepancias.

### **RNF-05.1: Integración con Sistemas Externos**

* El sistema debe proporcionar APIs RESTful documentadas para integraciones futuras.  
* Debe soportar formatos estándar de intercambio de datos (JSON, XML, CSV).  
* Debe permitir integración con sistemas de producción mediante conectores configurables.

### **RNF-05.2: Interoperabilidad**

* El sistema debe permitir exportación de datos en formatos estándar (Excel, PDF, CSV).  
* Debe soportar importación masiva de datos mediante plantillas predefinidas.  
* Debe proporcionar webhooks para notificaciones a sistemas externos.

---

## **RNF-06: MANTENIBILIDAD**

### **RNF-06.0: Facilidad de Mantenimiento**

* El sistema debe permitir actualizaciones sin interrumpir el servicio (zero-downtime deployments).  
* Las actualizaciones de seguridad críticas deben poder aplicarse en menos de 1 hora.  
* El código debe estar documentado y seguir estándares de desarrollo establecidos.

### **RNF-06.1: Monitoreo y Diagnóstico**

* El sistema debe proporcionar herramientas de monitoreo de rendimiento en tiempo real.  
* Debe generar alertas automáticas ante degradación de performance o errores críticos.  
* Debe mantener logs detallados de errores y excepciones para diagnóstico.  
* Debe proporcionar métricas de uso y estadísticas de operación.

### **RNF-06.2: Soporte Técnico**

* El proveedor debe ofrecer soporte técnico en horario laboral (8x5) con tiempo de respuesta inicial menor a 4 horas.  
* Para incidencias críticas, debe garantizar respuesta en menos de 1 hora.  
* Debe proporcionar canal de comunicación directo (teléfono, chat, email).

---

## **RNF-07: PORTABILIDAD**

### **RNF-07.0: Independencia de Plataforma**

* Fuerte preferencia por soluciones basadas en la nube (SaaS), siempre que cumplan con seguridad y ubicación de datos.  
* El sistema debe ser accesible desde cualquier ubicación con conexión a internet.  
* No debe requerir instalación de software cliente específico (excepto navegador web).

### **RNF-07.1: Ubicación de Datos**

* Los datos deben almacenarse preferiblemente en datacenters ubicados en Colombia o Latinoamérica.  
* Debe cumplir con normativas locales sobre residencia de datos.  
* En caso de almacenamiento internacional, debe garantizar cumplimiento de transferencias internacionales de datos.

---

## **RNF-08: EFICIENCIA Y OPTIMIZACIÓN**

### **RNF-08.0: Uso de Recursos**

* El sistema debe optimizar el uso de ancho de banda para operaciones remotas.  
* Debe implementar caché inteligente para reducir consultas repetitivas a la base de datos.  
* Debe minimizar el consumo de recursos del navegador cliente.

### **RNF-08.1: Optimización de Procesos**

* El sistema debe eliminar la dependencia de procesos manuales mediante automatización.  
* Debe reducir el tiempo de procesamiento de órdenes de compra en al menos 50% vs proceso actual.  
* Debe establecer una "única fuente de verdad" para datos maestros (productos, proveedores, inventario).

---

## **RNF-09: CUMPLIMIENTO Y NORMATIVAS**

### **RNF-09.0: Cumplimiento Legal**

* El sistema debe cumplir con la normativa tributaria colombiana vigente.  
* Debe permitir la generación de reportes requeridos por entidades regulatorias.  
* Debe mantener trazabilidad de transacciones según requerimientos de auditoría externa.

### **RNF-09.1: Estándares de Calidad**

* El sistema debe seguir mejores prácticas de desarrollo de software.  
* Debe implementar controles de calidad de datos (validaciones, reglas de negocio).  
* Debe mantener integridad referencial en todas las transacciones.

---

## **RNF-10: RESTRICCIONES Y LIMITACIONES**

### **RNF-10.0: Restricciones Presupuestarias**

* No se cuenta con presupuesto ilimitado.  
* La evaluación y aprobación de costos debe realizarse por orden trimestral.  
* El modelo de costos debe ser predecible y escalable según uso.

### **RNF-10.1: Restricciones Técnicas**

* El sistema debe integrarse con la infraestructura tecnológica existente.  
* Debe considerar las limitaciones de conectividad de ubicaciones remotas.  
* Debe funcionar adecuadamente con el ancho de banda disponible actualmente.

### **RNF-10.2: Restricciones Organizacionales**

* La implementación debe minimizar la interrupción de operaciones actuales.  
* Debe considerar la disponibilidad del personal para capacitación.  
* El cambio tecnológico debe ser gradual y gestionado adecuadamente.

---

## **RNF-11: DOCUMENTACIÓN**

### **RNF-11.0: Documentación Técnica**

* El sistema debe incluir documentación técnica completa de arquitectura y APIs.  
* Debe proporcionar documentación de configuración y administración.  
* Debe mantener documentación actualizada ante cambios y actualizaciones.

### **RNF-11.1: Documentación de Usuario**

* El sistema debe incluir manuales de usuario por rol.  
* Debe proporcionar guías de procedimientos operativos estándar.  
* Debe incluir FAQs y base de conocimiento consultable.

---

## **RNF-12: CALIDAD DE DATOS**

### **RNF-12.0: Integridad de Datos**

* El sistema debe garantizar la consistencia de datos en tiempo real entre todos los módulos.  
* Debe implementar validaciones estrictas en captura de datos para evitar errores.  
* Debe prevenir la duplicación de registros mediante controles automatizados.

### **RNF-12.1: Precisión y Confiabilidad**

* El sistema debe mantener precisión del 99.9% en cálculos de inventario y costos.  
* Debe detectar y alertar automáticamente sobre inconsistencias en datos.  
* Debe proporcionar mecanismos de reconciliación periódica automática.

