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
    private Alimento alimento;
    private int cantidad;
    
    public DetallePedido(){
        
    }

    public DetallePedido(Alimento alimento, int cantidad) {
        this.alimento = alimento;
        this.cantidad = cantidad;
    }
    
    public boolean añadeAlimento(int codigo, int cantidad){
        return true;
    }
    
    public boolean eliminaAlimento(int cantidad){
        return true;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
    
}
