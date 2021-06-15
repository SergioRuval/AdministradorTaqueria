/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagePersonas;

/**
 *
 * @author hellb
 */
public class Mesero extends Empleado{
    
    public Mesero(){
        
    }
    
    public Mesero(Empleado emp){
        super(emp);
    }

    public Mesero(String usuario, String nombre, String telefono, String correo, String direccion) {
        super(usuario, nombre, telefono, correo, direccion);
    }
    
    public void registrarPedido(){
        
    }
    
    public void modificarPedido(int codigoPedido){
        
    }
    
    public void cancelarPedido(int codigoPedido){
        
    }
    
    public void asignaMesa(){
        
    }
    
}
