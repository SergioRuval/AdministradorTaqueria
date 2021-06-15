package packagePersonas;

public class Gerente extends Empleado{
    private String passwd;
    
    public Gerente(){
        
    }
    
    public Gerente(String usuario, String nombre, String telefono, String correo,String direccion,String passwd){
        super(usuario, nombre, telefono, correo, direccion);
        this.passwd = passwd;
    }
    
    public void consultarVentas(){
        
    }
    
    public void setPwd(String pwd){
        this.passwd = pwd;
    }
}
