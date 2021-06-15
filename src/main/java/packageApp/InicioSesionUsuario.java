/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageApp;

import java.awt.*;
import javax.swing.*;
import packagePersonas.*;

/**
 *
 * @author hellb
 */
public class InicioSesionUsuario extends JFrame{
    private JButton jButton1;
    private JButton jButtonInicioSesion;
    private JLabel jLabel1Fondo;
    private JLabel jLabel2;
    private JLabel jLabelimagenUsuario;
    private JLabel jLabelRespuestaUsuario;
    private JTextField jTextFieldUser;
    private String tipoUsuario;

    public InicioSesionUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabelimagenUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jButtonInicioSesion = new javax.swing.JButton();
        jLabel1Fondo = new javax.swing.JLabel();
        jLabelRespuestaUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 90, 30));

        jLabelimagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N
        getContentPane().add(jLabelimagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 310, 340));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));
        
        jLabelRespuestaUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelRespuestaUsuario.setForeground(new java.awt.Color(255, 51, 51));
        jLabelRespuestaUsuario.setText("");
        getContentPane().add(jLabelRespuestaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 570, 160, 20));

        jTextFieldUser.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldUser.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 230, 30));

        jButtonInicioSesion.setBackground(new java.awt.Color(0, 0, 102));
        jButtonInicioSesion.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButtonInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicioSesion.setText("Iniciar Sesión");
        jButtonInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 600, 170, 40));

        jLabel1Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallpaper1.jpg"))); // NOI18N
        getContentPane().add(jLabel1Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 598, 676));
        

        pack();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
    }
    
    private void jTextFieldUserActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
    
    private void jButtonInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {
        Empleado empleado = new Empleado();
                
        if(empleado.iniciarSesion(this.jTextFieldUser.getText(), this.tipoUsuario)){
            this.jLabelRespuestaUsuario.setText("¡¡¡Bienvenido!!!");
            this.jLabelRespuestaUsuario.setForeground(new Color(255,255,255));
            if(this.tipoUsuario == "mesero"){
                MenuMesero menuMesero = new MenuMesero(empleado);
                menuMesero.setVisible(true);
                this.dispose();
            }
        }else{
            this.jTextFieldUser.setText("");
            this.jLabelRespuestaUsuario.setText("Usuario erróneo");
            this.jLabelRespuestaUsuario.setForeground(new Color(255,51,51));
        }
    }
}
