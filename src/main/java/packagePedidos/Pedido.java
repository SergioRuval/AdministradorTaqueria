package packagePedidos;

import packagePersonas.*;

public class Pedido {
    private int codigoPedido;
    private Mesa mesa;
    private Mesero mesero;
    private Cliente cliente;
    private boolean estado;
    private String fecha[];
    private double totalPagar;

    public Pedido(int codigoPedido, Mesa mesa, Mesero mesero, Cliente cliente, boolean estado, String[] fecha, double totalPagar) {
        this.codigoPedido = codigoPedido;
        this.mesa = mesa;
        this.mesero = mesero;
        this.cliente = cliente;
        this.estado = estado;
        this.fecha = fecha;
        this.totalPagar = totalPagar;
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
    
}
