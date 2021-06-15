package packagePedidos;

public class Mesa {
    private int numeroMesa;
    private boolean disponibilidad;
    private int capacidad;

    public Mesa(int numeroMesa, boolean disponibilidad, int capacidad) {
        this.numeroMesa = numeroMesa;
        this.disponibilidad = disponibilidad;
        this.capacidad = capacidad;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public boolean isDisponible() {
        return disponibilidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public void ocupar(){
        this.disponibilidad = false;
    }
    
    public void desocupar(){
        this.disponibilidad = true;
    }
    
    public boolean validaCapacidad(int cantidad){
        if(cantidad > this.capacidad){
            return false;
        }else{
            return true;
        }
    }
}
