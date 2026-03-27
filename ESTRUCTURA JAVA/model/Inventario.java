package model;

public class Inventario {

    private int idInventario;
    private int cantidad;
    private String fechaActualizacion;
    private Producto producto;

    public Inventario() {}

    public Inventario(int idInventario, int cantidad, String fechaActualizacion, Producto producto) {
        this.idInventario = idInventario;
        this.cantidad = cantidad;
        this.fechaActualizacion = fechaActualizacion;
        this.producto = producto;
    }

    public int getIdInventario() { return idInventario; }
    public void setIdInventario(int idInventario) { this.idInventario = idInventario; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public String getFechaActualizacion() { return fechaActualizacion; }
    public void setFechaActualizacion(String fechaActualizacion) { this.fechaActualizacion = fechaActualizacion; }

    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }
}