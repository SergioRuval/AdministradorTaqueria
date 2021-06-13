/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageApp;

import javax.swing.*;
import java.awt.*;

public class Launch extends JFrame{
    LaunchConnection objConn=new  LaunchConnection();
    
    public static void main(String ... args){
       Launch bd = new Launch();
      
       bd.control();

       bd.setSize(400,400);
       bd.setVisible(true);

    }
    
    public void control(){
    String datos[][];
    Object matriz[][];
    String query="SELECT * FROM taqueriasys.users_sample;";
    
    
    objConn.Consult(query);
    int n=0;
        int i,j;
        if(objConn.rs!=null){
            try{
                objConn.rs.last(); //se posiciona en el ultimo registros de la tabla
                n=objConn.rs.getRow(); //regresa el numero actual del registro
                objConn.rs.first();
            }catch(Exception e){}
            
            datos=new String[n][4];
            for(i=0;i<n;i++){
                for(j=0;j<4;j++){
                    try{
                        datos[i][j]=objConn.rs.getString(j+1);
                        System.out.print(datos[i][j]+" ");
                    }catch(Exception e){ }
                }
                System.out.println();
                try{
                    objConn.rs.next();
                }catch(Exception e){}
            }
            matriz = datos;
         
        objConn.closeRsStmt();
        
        Object titulos[] = {"user_id","nombre","puesto","sueldo"};
        JTable tabla = new JTable(matriz,titulos);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 70));
        JScrollPane scrollPane = new JScrollPane(tabla);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        objConn.closeConnection();

    }


    }
}
