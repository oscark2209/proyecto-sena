package model;

public class Pago {

    private int idPago;
    private String fecha;
    private double monto;

    public Pago() {}

    public Pago(int idPago, String fecha, double monto) {
        this.idPago = idPago;
        this.fecha = fecha;
        this.monto = monto;
    }

    public int getIdPago() { return idPago; }
    public void setIdPago(int idPago) { this.idPago = idPago; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }
}