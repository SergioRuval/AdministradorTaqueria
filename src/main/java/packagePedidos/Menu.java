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
public class Menu {
    private Alimento[] alimentos;

    public Menu(Alimento[] alimentos) {
        this.alimentos = alimentos;
    }

    public Alimento[] getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(Alimento[] alimentos) {
        this.alimentos = alimentos;
    }
    
    
}
