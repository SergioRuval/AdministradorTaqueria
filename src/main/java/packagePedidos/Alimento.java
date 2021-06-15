package packagePedidos;

public class Alimento {
    protected int codigoAlimento;
    protected String tipoAlimento;
    protected String nombreAlimento;
    protected double precio;
    protected String descripcion;

    public Alimento(int codigoAlimento, String tipoAlimento, String nombreAlimento, double precio, String descripcion) {
        this.codigoAlimento = codigoAlimento;
        this.tipoAlimento = tipoAlimento;
        this.nombreAlimento = nombreAlimento;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public void registrarAlimento(){
        
    }
    
    public void modificarAlimento(int codigo){
        
    }
    
    public void eliminarAlimento(int codigo){
        
    }

}
