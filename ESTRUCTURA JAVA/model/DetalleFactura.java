package model;

public class DetalleFactura {

    private int idDetalleFactura;
    private Factura factura;
    private Producto producto;
    private int cantidad;
    private double precio;

    public DetalleFactura() {}

    public DetalleFactura(int idDetalleFactura, Factura factura, Producto producto, int cantidad, double precio) {
        this.idDetalleFactura = idDetalleFactura;
        this.factura = factura;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getIdDetalleFactura() { return idDetalleFactura; }
    public void setIdDetalleFactura(int idDetalleFactura) { this.idDetalleFactura = idDetalleFactura; }

    public Factura getFactura() { return factura; }
    public void setFactura(Factura factura) { this.factura = factura; }

    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
}