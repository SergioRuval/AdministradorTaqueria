/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagePersonas;

import packageApp.SQLConnection;

/**
 *
 * @author hellb
 */
public class Empleado extends Persona{
    protected String usuario;
    private static SQLConnection conection = new SQLConnection();

    public Empleado(){
        
    }
    
    public Empleado(String usuario, String nombre, String telefono, String correo, String direccion) {
        super(nombre, telefono, correo, direccion);
        this.usuario = usuario;
    }
    
    public boolean iniciarSesion(String usuario, String puesto){
        String query = "SELECT * FROM taqueriasys.empleados "
                + "WHERE taqueriasys.empleados.usuario = " + "'" + usuario + "' AND taqueriasys.empleados.puesto = " + "'" + puesto + "'";
        conection.Consult(query);
        try{
            if(conection.rs != null && conection.rs.getRow() != 0){
                this.usuario = usuario;
                this.nombre = conection.rs.getString("nombre");
                this.telefono = conection.rs.getString("telefono");
                this.correo = conection.rs.getString("correo");
                this.direccion = conection.rs.getString("direccion");
                return true;
            }else{
                System.out.println("No existe el usuario en el sistema");
                return false;
            }
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean iniciarSesion(String usuario, String puesto, String passwd){
        String query = "SELECT * FROM taqueriasys.empleados JOIN taqueriasys.gerentes "
                + "ON taqueriasys.empleados.id_empleado = taqueriasys.gerentes.id_empleado "
                + "WHERE taqueriasys.empleados.usuario = " + "'" + usuario + "'" + " AND taqueriasys.empleados.puesto = " + "'" + puesto + "'"
                + "AND taqueriasys.gerentes.passwd = " + "'" + passwd + "'";
        conection.Consult(query);
        try{
            if(conection.rs != null && conection.rs.getRow() != 0){
                this.usuario = usuario;
                this.nombre = conection.rs.getString("nombre");
                this.telefono = conection.rs.getString("telefono");
                this.correo = conection.rs.getString("correo");
                this.direccion = conection.rs.getString("direccion");
                return true;
            }else{
                System.out.println("No existe el usuario en el sistema");
                return false;
            }
        }catch(Exception e){
            return false;
        }
    }
    
    public void cerrarSesion(){
        
    }
    
    
    
}
