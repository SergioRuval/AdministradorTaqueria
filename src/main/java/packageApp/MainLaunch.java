/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageApp;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.*;
import packagePersonas.*;

/**
 *
 * @author hellb
 */
public class MainLaunch extends JFrame{
    private JButton jButtonAdmin;
    private JButton jButtonCocinero;
    private JButton jButtonExit;
    private JButton jButtonMesero;
    private JLabel jLabelFondo;
    private JLabel jLabelUserIcon;
    private JLabel jLabelUserIcon2;
    private JLabel jLabelUserIcon3;
    
    private static SQLConnection conection = new SQLConnection();
    
    public MainLaunch(){
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private void initComponents(){
        jLabelUserIcon = new javax.swing.JLabel();
        jLabelUserIcon2 = new javax.swing.JLabel();
        jLabelUserIcon3 = new javax.swing.JLabel();
        jButtonMesero = new javax.swing.JButton();
        jButtonCocinero = new javax.swing.JButton();
        jButtonAdmin = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userblue.png"))); // NOI18N
        getContentPane().add(jLabelUserIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabelUserIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userblue.png"))); // NOI18N
        getContentPane().add(jLabelUserIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, 340));

        jLabelUserIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userblue.png"))); // NOI18N
        getContentPane().add(jLabelUserIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, -1, -1));

        jButtonMesero.setBackground(new java.awt.Color(0, 0, 102));
        jButtonMesero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonMesero.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMesero.setText("Mesero");
        jButtonMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMeseroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 180, 40));

        jButtonCocinero.setBackground(new java.awt.Color(0, 0, 102));
        jButtonCocinero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonCocinero.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCocinero.setText("Cocinero");
        getContentPane().add(jButtonCocinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 180, 40));

        jButtonAdmin.setBackground(new java.awt.Color(0, 0, 102));
        jButtonAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdmin.setText("Administrador");
        jButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdminActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, 180, 40));

        jButtonExit.setBackground(new java.awt.Color(0, 0, 102));
        jButtonExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("Salir");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 90, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallpaper1.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }
    
    private void jButtonMeseroActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
    
    private void jButtonCocineroActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        System.exit(0);
    }
    
    private void jButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    
    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        System.exit(0);
    }
    
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainLaunch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLaunch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLaunch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLaunch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLaunch().setVisible(true);
            }
        });
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
        Scanner sn = new Scanner(System.in);
        String usuarioGerente;
        String passGerente;
        boolean valido = false;
        
        Gerente gerente = new Gerente();
        
        while(valido == false){
            System.out.println("Ingrese su usuario para acceder al sistema");
            usuarioGerente = sn.nextLine();
            
            System.out.println("Ingrese su contraseña");
            passGerente = sn.nextLine();
            
            
            if(gerente.iniciarSesion(usuarioGerente, "gerente", passGerente)){
                gerente.setPwd(passGerente);
                System.out.println("Bienvenido culero");
                System.out.println(gerente.toString());
                valido = true;
            }else{
                System.out.println("No Bienvenido culero");
                valido = false;
            }
        }
    }
}
