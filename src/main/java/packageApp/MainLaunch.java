/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageApp;

import javax.swing.*;

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
        jButtonCocinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCocineroActionPerformed(evt);
            }
        });
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
        InicioSesionUsuario vent = new InicioSesionUsuario("mesero");
        vent.setVisible(true);
        
    }
    
    private void jButtonCocineroActionPerformed(java.awt.event.ActionEvent evt) {                                             
        InicioSesionUsuario vent = new InicioSesionUsuario("cocinero");
        vent.setVisible(true);
        
    }
    
    private void jButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {
        InicioSesionGerente vent = new InicioSesionGerente();
        vent.setVisible(true);        
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
}
