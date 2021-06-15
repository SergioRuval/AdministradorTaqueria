/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagePedidos;

/**
 *
 * @author hellb
 */
public class DetallePedido {
    private int codigoPedido;
    private int codigoAlimento;
    private int cantidad;
    private double costo;

    public DetallePedido(int codigoPedido, int codigoAlimento, int cantidad, double costo) {
        this.codigoPedido = codigoPedido;
        this.codigoAlimento = codigoAlimento;
        this.cantidad = cantidad;
        this.costo = costo;
    }
    
    public boolean altaDetalle(){
        return true;
    }
    
    public boolean bajaDetalle(){
        return true;
    }
    
    public boolean modificaDetalle(){
        
        return true;        
    }
}
