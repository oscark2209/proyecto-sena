package model;

public class Factura {

    private int idFactura;
    private String fecha;
    private double total;
    private Usuario usuario;

    public Factura() {}

    public Factura(int idFactura, String fecha, double total, Usuario usuario) {
        this.idFactura = idFactura;
        this.fecha = fecha;
        this.total = total;
        this.usuario = usuario;
    }

    public int getIdFactura() { return idFactura; }
    public void setIdFactura(int idFactura) { this.idFactura = idFactura; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
}