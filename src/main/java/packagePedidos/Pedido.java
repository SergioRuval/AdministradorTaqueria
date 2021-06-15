package packagePedidos;

import packagePersonas.*;

public class Pedido {
    private int codigoPedido;
    private DetallePedido[] detallePedido;
    private Mesa mesa;
    private Mesero mesero;
    private boolean estado;
    private String fecha;
    private double totalPagar;
    
    public Pedido(Mesero mesero){
        this.mesero = mesero;
    }

    public Pedido(int codigoPedido, Mesa mesa, Mesero mesero, boolean estado, String fecha, double totalPagar) {
        this.codigoPedido = codigoPedido;
        this.mesa = mesa;
        this.mesero = mesero;
        this.estado = estado;
        this.fecha = fecha;
        this.totalPagar = totalPagar;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public void sumarTotal(double costo){
        
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getTotalPagar() {
        return totalPagar;
    }
    
    public void addDetalle(Alimento alimento, int cantidad){
        if(this.detallePedido == null){
            this.detallePedido = new DetallePedido[1];
            this.detallePedido[0] = new DetallePedido(alimento, cantidad);
        }else{
            DetallePedido[] aux = new DetallePedido[this.detallePedido.length + 1];
        
            for(int i = 0; i < this.detallePedido.length; i++){
                aux[i] = this.detallePedido[i];
            }

            aux[this.detallePedido.length] = new DetallePedido(alimento, cantidad);

            this.detallePedido = aux;
        }
    }

    public DetallePedido[] getDetallePedido() {
        return detallePedido;
    }
    
    public void calcularTotal(){
        for(int i = 0; i < this.detallePedido.length; i++){
            this.totalPagar += this.detallePedido[i].getCantidad() * this.getDetallePedido()[i].getAlimento().getPrecio();
        }
    }
    
}
