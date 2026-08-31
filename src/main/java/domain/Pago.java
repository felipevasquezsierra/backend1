package domain;

public class Pago {

    private Integer idPago;
    private double monto;
    private String metodo;
    private String estado;
    private String fecha;
    private Pedido pedido;

    public Pago(){

    }

    public Pago(Integer idPago, double monto, String metodo, String estado, String fecha, Pedido pedido) {
        this.idPago = idPago;
        this.monto = monto;
        this.metodo = metodo;
        this.estado = estado;
        this.fecha = fecha;
        this.pedido = pedido;
    }

    public Integer getIdPago() {
        return idPago;
    }

    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void procesarPago(){

    }

    public void selectById(int id){

    }
}
