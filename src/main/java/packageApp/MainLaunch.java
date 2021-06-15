/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageApp;

import java.util.InputMismatchException;
import java.util.Scanner;
import packagePersonas.*;

/**
 *
 * @author hellb
 */
public class MainLaunch {
    private static SQLConnection conection = new SQLConnection();
    
    public static void main(String[] args) {
        iniciarSistema();
    }
    
    public static void iniciarSistema(){
        Scanner sn = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        
        while(salir == false){
            System.out.println("*******************************************");
            System.out.println("***** Bienvenido a Taqueria Ruvalcaba *****");
            System.out.println("*******************************************");
            System.out.println("\n");

            System.out.println("1. Mesero");
            System.out.println("2. Cocinero");
            System.out.println("3. Gerente");
            System.out.println("4. Salir");

            System.out.println("\nPor favor elige el numero del tipo de usuario.");
            opcion = sn.nextInt();

            try{

                switch (opcion) {

                    case 1:
                        iniciarMesero();
                        salir = true;
                        break;
                    case 2:
                        iniciarCocinero();
                        salir = true;
                        break;
                    case 3:
                        iniciarGerente();
                        salir = true;
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("\nSolo numero entre 1 y 4");
                }

            } catch (InputMismatchException e) {
                System.out.println("Debes de insertar un numero");
                sn.next(); 
            }   
        }
        
    }
    
    public static void iniciarMesero(){
        Scanner sn = new Scanner(System.in);
        String nombreMesero;
        boolean valido = false;
        
        Mesero mesero = new Mesero();
        
        while(valido == false){
            System.out.println("Ingrese su nombre para acceder al sistema");
            nombreMesero = sn.nextLine();
            
            if(mesero.iniciarSesion(nombreMesero, "mesero")){
                System.out.println("Bienvenido culero");
                System.out.println(mesero.toString());
                valido = true;
            }else{
                System.out.println("No Bienvenido culero");
                valido = false;
            }
        }
        
    }
    
    public static void iniciarCocinero(){
        Scanner sn = new Scanner(System.in);
        String nombreCocinero;
        boolean valido = false;
        
        Cocinero cocinero = new Cocinero();
        
        while(valido == false){
            System.out.println("Ingrese su nombre para acceder al sistema");
            nombreCocinero = sn.nextLine();
            
            if(cocinero.iniciarSesion(nombreCocinero, "cocinero")){
                System.out.println("Bienvenido culero");
                System.out.println(cocinero.toString());
                valido = true;
            }else{
                System.out.println("No Bienvenido culero");
                valido = false;
            }
        }
    }
    
    public static void iniciarGerente(){
        System.out.println("Bienvenido administrador .|.");
    }
}
