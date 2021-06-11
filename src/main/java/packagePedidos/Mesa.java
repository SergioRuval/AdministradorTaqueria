package packagePedidos;

public class Mesa {
    private int numeroMesa;
    private boolean ocupada;
    private int numeroComensales;

    public Mesa(int numeroMesa, boolean ocupada, int numeroComensales) {
        this.numeroMesa = numeroMesa;
        this.ocupada = ocupada;
        this.numeroComensales = numeroComensales;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public int getNumeroComensales() {
        return numeroComensales;
    }

    public void setNumeroComensales(int numeroComensales) {
        this.numeroComensales = numeroComensales;
    }
    
    public void ocupar(){
        
    }
    
    public void desocupar(){
        
    }
}
