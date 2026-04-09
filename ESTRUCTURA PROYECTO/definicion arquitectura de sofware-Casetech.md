#  Arquitectura de Software del Proyecto

## 1. Definición de Arquitectura de Software


Incluye:

- Organización del sistema
- Interacción entre componentes
- Tecnologías utilizadas
- Principios como escalabilidad, mantenibilidad y rendimiento

---

## 2. Selección y Justificación del Patrón Arquitectónico

###  Patrón seleccionado: Arquitectura en Capas (Layered Architecture / MVC)

Este patrón divide el sistema en diferentes capas, cada una con una responsabilidad específica.

###  Estructura del sistema:

- **Capa de Presentación (Frontend):**
  Encargada de la interfaz de usuario.

- **Capa de Lógica de Negocio (Backend):**
  Procesa datos y ejecuta reglas del sistema.

- **Capa de Datos (Base de Datos):**
  Gestiona el almacenamiento de información.

---

###  Justificación

Se selecciona este patrón por las siguientes razones:

- **Separación de responsabilidades:** Cada capa cumple una función específica.
- **Facilidad de mantenimiento:** Permite modificar una parte sin afectar otras.
- **Escalabilidad:** Facilita el crecimiento del sistema.
- **Organización del código:** Mejora la claridad y estructura.
- **Adecuado para aplicaciones CRUD:** Ideal para sistemas de gestión de datos.

---

## 3. Definición del Stack Tecnológico

### Backend

- Node.js con Express

#### node.js
-APIs
-Servidores web
-Manejo de bases de datos

#### Express
 framework para Node.js que facilita crear servidores y APIs.

 facilita:

Crear rutas (GET, POST, etc.)
Manejar peticiones y respuestas
Organizar el backend

**Justificación:**
- Entorno ligero y eficiente
- Uso de JavaScript en todo el proyecto
- Amplia comunidad y soporte

### Otras opciones

- java spring boot

---

###  Frontend

-  JavaScript- React
- Opcional: HTML, CSS 

**Justificación:**
- Tecnologías estándar de la web
- Permiten crear interfaces dinámicas
- React mejora la reutilización de componentes

---

###  Base de Datos

- PostgreSQL

**Justificación:**
- Es una base de datos potente, gratuita y de código abierto
- Sistema robusto y confiable
- Manejo eficiente de relaciones
- Buen rendimiento

### otras opciones 
- MySQL

---

###  Herramientas adicionales

- Git (control de versiones)
- GitHub (repositorio)
- API REST

---

## Conclusión

El sistema se desarrolla bajo una arquitectura en capas (MVC), permitiendo una adecuada separación entre la presentación, la lógica de negocio y los datos.

El stack tecnológico seleccionado (Node.js, JavaScript y PostgreSQL) garantiza un equilibrio entre rendimiento, facilidad de desarrollo y escalabilidad, siendo apropiado para el tipo de aplicación implementada.

---