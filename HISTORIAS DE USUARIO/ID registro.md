* **ID: HU-001**

* **Título: Registro rápido y seguro de usuario en SCM**

* **Épica/Módulo: RF-12: Gestión de Usuarios y Seguridad**

* **Prioridad: MUST (Crítico)**

* **Puntos de Historia: 8**

* **Sprint/Iteración: Sprint 1**

**Historia de Usuario**

Como nuevo usuario interesado en participar en la cadena de suministro,  
quiero registrarme en la plataforma de forma rápida y segura  
para poder acceder a funcionalidades clave como cotizaciones, órdenes de compra y seguimiento logístico.

---

**Descripción detallada**

El sistema SCM debe permitir registrar nuevos usuarios (proveedores, compradores, gestores) con un proceso ágil que garantice la seguridad y la verificación de identidad. Este registro debe cumplir con las políticas internas y regulatorias, incorporar la validación de datos como correo electrónico y teléfono, asignar roles según el tipo de usuario y generar registros para auditoría. La experiencia debe ser accesible desde dispositivos móviles.

---

**Criterios de aceptación** 

Escenario 1: Registro exitoso

* Dado que soy un nuevo usuario

* Cuando ingreso mis datos personales correctamente (nombre, correo electrónico, teléfono, rol)

* Y verifico mi identidad mediante un código enviado por correo electrónico/SMS

* Entonces el sistema crea mi cuenta y me otorga acceso según mi rol

Escenario 2: Datos incompletos o inválidos

* Dado que ingresa datos incompletos o con formato inválido

* Cuando intenta continuar

* Entonces el sistema muestra mensajes claros de error impedimento avance

Escenario 3: Usuario duplicado

* Dado que intenta registrarme con correo o teléfono ya usados

* Cuando envío el formulario

* Entonces el sistema me alerta y me ofrece recuperar contraseña o iniciar sesión

Escenario 4: Código de verificación incorrecto

* Dado que ingresa un código inválido o caducado

* Cuando se superan los intentos permitidos

* Entonces el sistema bloquea temporalmente e invita a generar un nuevo código

