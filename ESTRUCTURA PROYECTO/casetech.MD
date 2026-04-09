CREATE DATABASE CaseTech;
USE CaseTech;

CREATE TABLE roles (
    id_rol INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    primer_nombre VARCHAR(50) NOT NULL,
    segundo_nombre VARCHAR(50),
    correo VARCHAR(100) NOT NULL UNIQUE,
    telefono VARCHAR(20),
    id_rol INT NOT NULL,
    FOREIGN KEY (id_rol) REFERENCES roles(id_rol)
);

CREATE TABLE tipo_material (
    id_tipo_material INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE proveedores (
    id_proveedor INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    contacto VARCHAR(100),
    correo VARCHAR(100),
    telefono VARCHAR(20)
);

CREATE TABLE materiales (
    id_material INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    cantidad INT DEFAULT 0,
    id_tipo_material INT NOT NULL,
    id_proveedor INT NOT NULL,
    FOREIGN KEY (id_tipo_material) REFERENCES tipo_material(id_tipo_material),
    FOREIGN KEY (id_proveedor) REFERENCES proveedores(id_proveedor)
);

CREATE TABLE producto (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10,2) NOT NULL,
    id_material INT NOT NULL,
    FOREIGN KEY (id_material) REFERENCES materiales(id_material)
);

CREATE TABLE inventario (
    id_inventario INT AUTO_INCREMENT PRIMARY KEY,
    cantidad INT NOT NULL,
    fecha_actualizacion DATE,
    id_producto INT NOT NULL UNIQUE,
    FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);

CREATE TABLE entradas (
    id_entrada INT AUTO_INCREMENT PRIMARY KEY,
    cantidad INT NOT NULL,
    fecha DATE NOT NULL,
    id_material INT NOT NULL,
    id_proveedor INT NOT NULL,
    FOREIGN KEY (id_material) REFERENCES materiales(id_material),
    FOREIGN KEY (id_proveedor) REFERENCES proveedores(id_proveedor)
);

CREATE TABLE salidas (
    id_salida INT AUTO_INCREMENT PRIMARY KEY,
    cantidad INT NOT NULL,
    fecha DATE NOT NULL,
    id_producto INT NOT NULL,
    FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);

CREATE TABLE pedidos (
    id_pedido INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE NOT NULL,
    estado VARCHAR(50) NOT NULL,
    id_usuario INT NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);

CREATE TABLE detalle_pedido (
    id_detalle_pedido INT AUTO_INCREMENT PRIMARY KEY,
    precio DECIMAL(10,2) NOT NULL,
    cantidad INT NOT NULL,
    id_pedido INT NOT NULL,
    id_producto INT NOT NULL,
    FOREIGN KEY (id_pedido) REFERENCES pedidos(id_pedido),
    FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);

CREATE TABLE envios (
    id_envio INT AUTO_INCREMENT PRIMARY KEY,
    estado VARCHAR(50) NOT NULL,
    id_pedido INT NOT NULL UNIQUE,
    FOREIGN KEY (id_pedido) REFERENCES pedidos(id_pedido)
);

CREATE TABLE factura (
    id_factura INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE NOT NULL,
    total DECIMAL(10,2) NOT NULL,
    id_usuario INT NOT NULL,
    id_pedido INT UNIQUE,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario),
    FOREIGN KEY (id_pedido) REFERENCES pedidos(id_pedido)
);

CREATE TABLE tipo_pago (
    id_tipo_pago INT AUTO_INCREMENT PRIMARY KEY,
    pago VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE pagos (
    id_pago INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE NOT NULL,
    monto DECIMAL(10,2) NOT NULL,
    id_tipo_pago INT NOT NULL,
    id_factura INT NOT NULL,
    FOREIGN KEY (id_tipo_pago) REFERENCES tipo_pago(id_tipo_pago),
    FOREIGN KEY (id_factura) REFERENCES factura(id_factura)
);

CREATE TABLE detalle_factura (
    id_detalle_factura INT AUTO_INCREMENT PRIMARY KEY,
    id_factura INT NOT NULL,
    id_producto INT NOT NULL,
    cantidad INT NOT NULL,
    precio DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (id_factura) REFERENCES factura(id_factura),
    FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);

CREATE TABLE cotizaciones (
    id_cotizacion INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE NOT NULL,
    estado VARCHAR(50) NOT NULL,
    id_usuario INT NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);

CREATE TABLE detalle_cotizacion (
    id_detalle_cotizacion INT AUTO_INCREMENT PRIMARY KEY,
    id_cotizacion INT NOT NULL,
    id_producto INT NOT NULL,
    cantidad INT NOT NULL,
    precio DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (id_cotizacion) REFERENCES cotizaciones(id_cotizacion),
    FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);

CREATE TABLE pqr (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descripcion TEXT NOT NULL,
    fecha DATE NOT NULL
);

CREATE TABLE alertas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    mensaje TEXT NOT NULL,
    fecha DATE NOT NULL
);