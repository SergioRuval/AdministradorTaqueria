package packagePedidos;

import packagePersonas.Mesero;

public class Pedido {
    private Mesa mesa;
    private Mesero mesero;
    private boolean estado;
    private Alimento[] alimentosAdquiridos;

    public Pedido(Mesa mesa, Mesero mesero, boolean estado, Alimento[] alimentosAdquiridos) {
        this.mesa = mesa;
        this.mesero = mesero;
        this.estado = estado;
        this.alimentosAdquiridos = alimentosAdquiridos;
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

    public Alimento[] getAlimentosAdquiridos() {
        return alimentosAdquiridos;
    }

    public void setAlimentosAdquiridos(Alimento[] alimentosAdquiridos) {
        this.alimentosAdquiridos = alimentosAdquiridos;
    }
    
    
}
