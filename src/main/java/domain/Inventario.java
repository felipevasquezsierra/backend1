package domain;

public class Inventario {

    private Integer idInventario;
    private Integer cantidadDisponible;
    private Integer stockMinimo;
    private producto producto;

    public Inventario() {
    }

    public Inventario(Integer idInventario, Integer cantidadDisponible, Integer stockMinimo, producto producto) {
        this.idInventario = idInventario;
        this.cantidadDisponible = cantidadDisponible;
        this.stockMinimo = stockMinimo;
        this.producto = producto;
    }

    public Integer getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Integer idInventario) {
        this.idInventario = idInventario;
    }

    public Integer getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(Integer cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public Integer getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(Integer stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public producto getProducto() {
        return producto;
    }

    public void setProducto(producto producto) {
        this.producto = producto;
    }

    public void consultarStock(){

    }

    public void actualizarStock(int id){

    }
}
