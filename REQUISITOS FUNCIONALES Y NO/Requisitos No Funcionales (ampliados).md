# 1. REQUISITOS NO FUNCIONALES DEL SISTEMA

---

## 1.1 RNF-001: RENDIMIENTO

### 1.1.1 RNF-001.1: Tiempos de Respuesta

#### Descripción
El sistema debe garantizar tiempos de respuesta óptimos en todas las operaciones.

#### Actor
Sistema

#### Precondiciones
- Sistema en operación normal.
- Conectividad estable.

#### Flujo Principal
1. El usuario realiza una solicitud.
2. El sistema procesa la solicitud.
3. El sistema retorna el resultado al usuario.

#### Criterios de Aceptación
- Consultas en menos de 1 segundo.
- Reportes básicos en menos de 3 segundos.
- Reportes complejos en menos de 10 segundos.
- Notificaciones en tiempo real.

#### Prioridad
MUST (Crítico)

---

### 1.1.2 RNF-001.2: Capacidad y Concurrencia

#### Descripción
El sistema debe soportar múltiples usuarios concurrentes sin degradación del servicio.

#### Actor
Sistema

#### Precondiciones
- Múltiples usuarios conectados simultáneamente.

#### Flujo Principal
1. Varios usuarios acceden al sistema.
2. El sistema gestiona las solicitudes concurrentes.
3. El sistema mantiene el rendimiento estable.

#### Criterios de Aceptación
- Soporta mínimo 5 usuarios sin degradación.
- Soporta 20 usuarios concurrentes en condiciones normales.
- Soporta picos de 50 usuarios simultáneos.

#### Prioridad
MUST (Crítico)

---

### 1.1.3 RNF-001.3: Escalabilidad

#### Descripción
El sistema debe poder escalar en capacidad y funcionalidad sin afectar su desempeño.

#### Actor
Sistema

#### Precondiciones
- Incremento en usuarios o volumen de datos.

#### Flujo Principal
1. Aumenta la carga del sistema.
2. Se incrementan recursos de infraestructura.
3. El sistema mantiene su funcionamiento.

#### Criterios de Aceptación
- Escala hasta 200% de transacciones.
- Permite ampliar almacenamiento sin interrupciones.
- Soporta nuevos módulos sin afectar el rendimiento.

#### Prioridad
SHOULD (Alta)

---

## 1.2 RNF-002: DISPONIBILIDAD Y CONFIABILIDAD

### 1.2.1 RNF-002.1: Alta Disponibilidad

#### Descripción
El sistema debe estar disponible de forma continua para los usuarios.

#### Actor
Sistema

#### Precondiciones
- Infraestructura operativa.

#### Flujo Principal
1. El sistema se encuentra en ejecución.
2. Los usuarios acceden al sistema.
3. El sistema responde sin interrupciones.

#### Criterios de Aceptación
- Disponibilidad mínima del 99.5% mensual.
- Acceso continuo a la información.
- Recuperación automática ante fallos.

#### Prioridad
MUST (Crítico)

---

### 1.2.2 RNF-002.2: Respaldo y Recuperación

#### Descripción
El sistema debe garantizar la recuperación de información ante fallos.

#### Actor
Sistema

#### Precondiciones
- Datos almacenados.

#### Flujo Principal
1. El sistema realiza respaldos automáticos.
2. Ocurre una falla.
3. El sistema ejecuta proceso de recuperación.
4. Se restauran los datos.

#### Criterios de Aceptación
- Backups diarios automáticos.
- Backups cada 4 horas.
- RTO menor a 4 horas.
- RPO menor a 1 hora.

#### Prioridad
MUST (Crítico)

---

### 1.2.3 RNF-002.3: Continuidad del Servicio

#### Descripción
El sistema debe continuar operando ante fallas parciales.

#### Actor
Sistema

#### Precondiciones
- Fallas parciales del sistema.

#### Flujo Principal
1. Se detecta una falla.
2. El sistema activa modo degradado.
3. Se mantienen funciones críticas.
4. Se notifica al equipo técnico.

#### Criterios de Aceptación
- Plan de continuidad definido.
- Operación en modo degradado.
- Notificación automática de fallas.

#### Prioridad
SHOULD (Alta)

---

## 1.3 RNF-003: SEGURIDAD

### 1.3.1 RNF-003.1: Control de Acceso

#### Descripción
El sistema debe controlar el acceso mediante autenticación y roles.

#### Actor
Usuario / Sistema

#### Precondiciones
- Usuario intenta acceder.

#### Flujo Principal
1. Usuario ingresa credenciales.
2. El sistema valida la información.
3. El sistema permite o deniega acceso.

#### Criterios de Aceptación
- Implementación de roles (RBAC).
- Bloqueo tras 5 intentos fallidos.
- Cambio de contraseña cada 90 días.
- Timeout de 30 minutos.

#### Prioridad
MUST (Crítico)

---

### 1.3.2 RNF-003.2: Protección de Datos

#### Descripción
El sistema debe proteger los datos sensibles.

#### Actor
Sistema

#### Precondiciones
- Existencia de datos sensibles.

#### Flujo Principal
1. Los datos son transmitidos o almacenados.
2. El sistema aplica cifrado.
3. Se restringe acceso no autorizado.

#### Criterios de Aceptación
- Cifrado con TLS 1.3 y AES-256.
- Cumplimiento normativo colombiano.
- Enmascaramiento de datos en logs.

#### Prioridad
MUST (Crítico)

---

### 1.3.3 RNF-003.3: Auditoría

#### Descripción
El sistema debe registrar y monitorear actividades.

#### Actor
Sistema / Administrador

#### Precondiciones
- Uso del sistema.

#### Flujo Principal
1. Usuario realiza acciones.
2. El sistema registra eventos.
3. El administrador consulta logs.

#### Criterios de Aceptación
- Registro de accesos.
- Logs por 12 meses.
- Alertas de actividad sospechosa.

#### Prioridad
SHOULD (Alta)

---
