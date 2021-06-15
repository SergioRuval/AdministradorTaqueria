/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageApp;

import javax.swing.*;
import packagePedidos.*;
import packagePersonas.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author hellb
 */
public class MenuMesero extends JFrame{
    private JButton jButton2CobrarOrden;
    private JButton jButtonAceptar;
    private JButton jButtonGenerarTicket;
    private JButton jButtonGuardarInfoActual;
    private JButton jButtonSalir;
    private JComboBox<String> jComboBoxBebidas;
    private JComboBox<String> jComboBoxComida;
    private JComboBox<String> jComboBoxNumeroMesa;
    private JLabel jLabelCantidadBebida;
    private JLabel jLabelCobrarOrden;
    private JLabel jLabelColumnaNegra;
    private JLabel jLabelColumnaNegra2;
    private JLabel jLabelColumnaNegra3;
    private JLabel jLabelDetallesOrden;
    private JLabel jLabelFondo;
    private JLabel jLabelMesasDisponibles;
    private JLabel jLabelOrdenesActivas;
    private JLabel jLabelStatus;
    private JLabel jLabelTotalOrden;
    private JLabel jLabelidOrden;
    private JLabel jLabelingresarBebida;
    private JLabel jLabelingresarComida;
    private JLabel jLabelingresarOrden;
    private JLabel jLabelnumeroMesa;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JTextArea jTextAreaDetallesOrden;
    private JTextArea jTextAreaInfoOrdenActual;
    private JTextArea jTextAreaMesasDisponibles;
    private JTextArea jTextAreaOrdenesActivas;
    private JTextField jTextFieldCantidadBebida;
    private JTextField jTextFieldTotalOrden;
    private JTextField jTextFieldidOrden;
    
    private Mesero mesero;
    private SQLConnection conection = new SQLConnection();
    private Pedido pedido;

    public MenuMesero(Empleado empleado) {
        this.mesero = new Mesero(empleado);
        this.pedido = new Pedido(this.mesero);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private void initComponents() {

        jLabelnumeroMesa = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jLabelCobrarOrden = new javax.swing.JLabel();
        jLabelingresarOrden = new javax.swing.JLabel();
        jLabelingresarComida = new javax.swing.JLabel();
        jLabelingresarBebida = new javax.swing.JLabel();
        jLabelCantidadBebida = new javax.swing.JLabel();
        jLabelidOrden = new javax.swing.JLabel();
        jLabelDetallesOrden = new javax.swing.JLabel();
        jLabelTotalOrden = new javax.swing.JLabel();
        jTextFieldTotalOrden = new javax.swing.JTextField();
        jLabelMesasDisponibles = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDetallesOrden = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaInfoOrdenActual = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMesasDisponibles = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaOrdenesActivas = new javax.swing.JTextArea();
        jLabelOrdenesActivas = new javax.swing.JLabel();
        jTextFieldidOrden = new javax.swing.JTextField();
        jButtonGuardarInfoActual = new javax.swing.JButton();
        jTextFieldCantidadBebida = new javax.swing.JTextField();
        jComboBoxBebidas = new javax.swing.JComboBox<>();
        jButtonGenerarTicket = new javax.swing.JButton();
        jComboBoxNumeroMesa = new javax.swing.JComboBox<>();
        jComboBoxComida = new javax.swing.JComboBox<>();
        jButtonSalir = new javax.swing.JButton();
        jButtonAceptar = new javax.swing.JButton();
        jButton2CobrarOrden = new javax.swing.JButton();
        jLabelColumnaNegra = new javax.swing.JLabel();
        jLabelColumnaNegra2 = new javax.swing.JLabel();
        jLabelColumnaNegra3 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelnumeroMesa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelnumeroMesa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelnumeroMesa.setText("Número de mesa:");
        getContentPane().add(jLabelnumeroMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabelStatus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(255, 255, 255));
        jLabelStatus.setText("Status");
        getContentPane().add(jLabelStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, -1, -1));

        jLabelCobrarOrden.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCobrarOrden.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCobrarOrden.setText("Cobrar Orden");
        getContentPane().add(jLabelCobrarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jLabelingresarOrden.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelingresarOrden.setForeground(new java.awt.Color(255, 255, 255));
        jLabelingresarOrden.setText("Ingresar Orden");
        getContentPane().add(jLabelingresarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabelingresarComida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelingresarComida.setForeground(new java.awt.Color(255, 255, 255));
        jLabelingresarComida.setText("Tipo de alimento:");
        getContentPane().add(jLabelingresarComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, 30));

        jLabelingresarBebida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelingresarBebida.setForeground(new java.awt.Color(255, 255, 255));
        jLabelingresarBebida.setText("Ingresar alimento:");
        getContentPane().add(jLabelingresarBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabelCantidadBebida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCantidadBebida.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCantidadBebida.setText("Cantidad:");
        getContentPane().add(jLabelCantidadBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabelidOrden.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelidOrden.setForeground(new java.awt.Color(255, 255, 255));
        jLabelidOrden.setText("ID de orden:");
        getContentPane().add(jLabelidOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jLabelDetallesOrden.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDetallesOrden.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDetallesOrden.setText("Detalles de orden:");
        getContentPane().add(jLabelDetallesOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        jLabelTotalOrden.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTotalOrden.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTotalOrden.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTotalOrden.setText("Total:");
        getContentPane().add(jLabelTotalOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, -1, -1));

        jTextFieldTotalOrden.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTotalOrden.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTotalOrden.setText("$0.00");
        getContentPane().add(jTextFieldTotalOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 170, -1));

        jLabelMesasDisponibles.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMesasDisponibles.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelMesasDisponibles.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMesasDisponibles.setText("Mesas disponibles:");
        getContentPane().add(jLabelMesasDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, -1, -1));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        jTextAreaDetallesOrden.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaDetallesOrden.setColumns(20);
        jTextAreaDetallesOrden.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaDetallesOrden.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDetallesOrden);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, 210));

        jTextAreaInfoOrdenActual.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaInfoOrdenActual.setColumns(20);
        jTextAreaInfoOrdenActual.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaInfoOrdenActual.setRows(5);
        jScrollPane3.setViewportView(jTextAreaInfoOrdenActual);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 260, 210));

        jTextAreaMesasDisponibles.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaMesasDisponibles.setColumns(20);
        jTextAreaMesasDisponibles.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaMesasDisponibles.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMesasDisponibles);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, -1, 130));

        jTextAreaOrdenesActivas.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaOrdenesActivas.setColumns(20);
        jTextAreaOrdenesActivas.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaOrdenesActivas.setRows(5);
        jScrollPane4.setViewportView(jTextAreaOrdenesActivas);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, -1, 130));

        jLabelOrdenesActivas.setBackground(new java.awt.Color(255, 255, 255));
        jLabelOrdenesActivas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelOrdenesActivas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOrdenesActivas.setText("Órdenes activas:");
        getContentPane().add(jLabelOrdenesActivas, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, -1, -1));

        jTextFieldidOrden.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldidOrden.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextFieldidOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 140, -1));

        jButtonGuardarInfoActual.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGuardarInfoActual.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonGuardarInfoActual.setForeground(new java.awt.Color(0, 0, 0));
        jButtonGuardarInfoActual.setText("Continuar");
        jButtonGuardarInfoActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarInfoActualActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardarInfoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 260, 30));

        jTextFieldCantidadBebida.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCantidadBebida.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextFieldCantidadBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 120, -1));

        jComboBoxBebidas.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxBebidas.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxBebidas.setModel(new javax.swing.DefaultComboBoxModel<>(this.getComidas()));
        jComboBoxBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBebidasActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 120, -1));

        jButtonGenerarTicket.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGenerarTicket.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonGenerarTicket.setForeground(new java.awt.Color(0, 0, 0));
        jButtonGenerarTicket.setText("Generar Ticket");
        jButtonGenerarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarTicketActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGenerarTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 260, 30));

        jComboBoxNumeroMesa.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxNumeroMesa.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxNumeroMesa.setModel(new javax.swing.DefaultComboBoxModel<>(getMesas()));
        jComboBoxNumeroMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNumeroMesaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxNumeroMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 120, -1));

        jComboBoxComida.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxComida.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxComida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comida", "Bebida" }));
        jComboBoxComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxComidaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 120, -1));

        jButtonSalir.setBackground(new java.awt.Color(0, 0, 102));
        jButtonSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Regresar");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 50, 120, 50));

        jButtonAceptar.setBackground(new java.awt.Color(0, 0, 102));
        jButtonAceptar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 320, 50));

        jButton2CobrarOrden.setBackground(new java.awt.Color(0, 0, 102));
        jButton2CobrarOrden.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2CobrarOrden.setForeground(new java.awt.Color(255, 255, 255));
        jButton2CobrarOrden.setText("Cobrar");
        jButton2CobrarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2CobrarOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2CobrarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, 320, 50));

        jLabelColumnaNegra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackboard.jpg"))); // NOI18N
        getContentPane().add(jLabelColumnaNegra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 320, 550));

        jLabelColumnaNegra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackboard.jpg"))); // NOI18N
        getContentPane().add(jLabelColumnaNegra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jLabelColumnaNegra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackboard.jpg"))); // NOI18N
        getContentPane().add(jLabelColumnaNegra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallpaper1.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 710));

        pack();
    }
    
    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {
        int codigoPedido = 0;
        int mesa = 0;
        
        String query = "SELECT COUNT(*) FROM taqueriasys.pedidos;";
        
        conection.Consult(query);
        
        try{
            if(conection.rs != null && conection.rs.getRow() != 0){
                if(Integer.valueOf(conection.rs.getString(1)) == 0 ){
                    codigoPedido = 1;
                }else{
                    codigoPedido = Integer.valueOf(conection.rs.getString(1)) + 1;
                }
                System.out.println(codigoPedido);
                
                this.pedido.setCodigoPedido(codigoPedido);
                this.pedido.setMesa(new Mesa(this.jComboBoxNumeroMesa.getSelectedIndex() + 1, 
                        false));
                this.pedido.setEstado(true);
                this.pedido.setFecha(new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime()));
                this.pedido.calcularTotal();
                
                query = "INSERT INTO taqueriasys.pedidos (codigo, mesa, mesero, fecha, estado, total)"
                        + "VALUES (" + this.pedido.getCodigoPedido() +  ","  + this.pedido.getMesa().getNumeroMesa() + ",'" 
                        + this.pedido.getMesero().getNombre() + "','" + this.pedido.getFecha() + "'," + this.pedido.isEstado() + "," 
                        + this.pedido.getTotalPagar() +")";
                
                
                
                conection.Update(query);
                
                if(conection.rs != null && conection.rs.getRow() != 0){
                    System.out.println("Pedido añadido con éxito");
                    mesa = this.pedido.getMesa().getNumeroMesa();
                    this.pedido = new Pedido(this.mesero);
                    this.jTextAreaInfoOrdenActual.setText("");
                }else{
                    System.out.println("No se pudo agregar el pedido");
                }
                
                query = "UPDATE taqueriasys.mesas SET taqueriasys.mesas.disponibilidad = 0 WHERE (taqueriasys.mesas.id_mesa = " 
                        + mesa + ")";
                
                System.out.println(query);
                
                conection.Update(query);
                
                jComboBoxNumeroMesa.setModel(new javax.swing.DefaultComboBoxModel<>(getMesas()));
                if(conection.rs != null && conection.rs.getRow() != 0){
                    System.out.println("Mesa no disponible con éxito");
                    this.jTextAreaInfoOrdenActual.setText("");
                }else{
                    System.out.println("No se pudo agregar el pedido");
                }
            }else{
                System.out.println("No hay pedidos");
            }
        }catch(Exception e){
            System.out.println("Esta dando exception " + e.getMessage());
        }
        
    }
    
    private void jButtonGuardarInfoActualActionPerformed(java.awt.event.ActionEvent evt) {
        int codigoAlimento;
        int cantidad;
        String query = "SELECT * FROM taqueriasys.alimentos WHERE taqueriasys.alimentos.nombre = '" 
                + this.jComboBoxBebidas.getItemAt(this.jComboBoxBebidas.getSelectedIndex()) + "'";
        
        cantidad = Integer.valueOf(this.jTextFieldCantidadBebida.getText());
        
        System.out.println(query);
        
        conection.Consult(query);
        
        try{
            if(conection.rs != null && conection.rs.getRow() != 0){
                codigoAlimento = Integer.valueOf(conection.rs.getString("codigo"));
                this.pedido.addDetalle(new Alimento(codigoAlimento, conection.rs.getString("tipo"), conection.rs.getString("nombre"), 
                Double.valueOf(conection.rs.getString("precio")), conection.rs.getString("descripcion")), cantidad);
            }else{
                System.out.println("No Se está añadiendo el pedido?");
            }
        }catch(Exception e){
            System.out.println("Esta dando exception " + e.getMessage());
        }
        
        mostrarListado();
    }
    
    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
    }

    private void jComboBoxNumeroMesaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    
    private void jButton2CobrarOrdenActionPerformed(java.awt.event.ActionEvent evt) {
        int numeroOrden = Integer.valueOf(this.jTextFieldidOrden.getText());
        int mesa = 0;
        String query = "SELECT * FROM taqueriasys.pedidos WHERE taqueriasys.pedidos.codigo = " + numeroOrden 
                + " AND taqueriasys.pedidos.estado = 1";
        
        conection.Consult(query);
        
        try{
            
            if(conection.rs != null && conection.rs.getRow() != 0){
                mesa = Integer.valueOf(conection.rs.getString("mesa"));
            }else {
                System.out.println("No Se está obteniendo nada");
            }
            
            query = "UPDATE taqueriasys.pedidos SET estado = 0 WHERE (codigo = " + numeroOrden + " AND estado = 1)";
            conection.Update(query);
        
            if(conection.rs != null && conection.rs.getRow() != 0){
                System.out.println("Pedido modificado con éxito");
                this.jTextFieldidOrden.setText("");
                this.jTextAreaDetallesOrden.setText("");
                this.jTextFieldTotalOrden.setText("$0.00");
                
                query = "UPDATE taqueriasys.mesas SET taqueriasys.mesas.disponibilidad = 1 WHERE (taqueriasys.mesas.id_mesa = " 
                        + mesa + ")";
                
                conection.Update(query);
                
                if(conection.rs != null && conection.rs.getRow() != 0){
                    System.out.println("Mesa disponible con éxito tras cobrar");
                    jComboBoxNumeroMesa.setModel(new javax.swing.DefaultComboBoxModel<>(getMesas()));
                    this.jTextAreaInfoOrdenActual.setText("");
                }else{
                    System.out.println("No se pudo agregar el pedido");
                }
            }else{
                System.out.println("No se pudo agregar el pedido");
            }
        }catch(Exception e){
            System.out.println("Esta dando exception " + e.getMessage());
        }
            
    }
    
    private void jButtonGenerarTicketActionPerformed(java.awt.event.ActionEvent evt) {
        int numeroOrden = Integer.valueOf(this.jTextFieldidOrden.getText());
        String query = "SELECT * FROM taqueriasys.pedidos WHERE taqueriasys.pedidos.codigo = " + numeroOrden 
                + " AND taqueriasys.pedidos.estado = 1";
        String texto = "";
        
        conection.Consult(query);
        
        try{
            if(conection.rs != null && conection.rs.getRow() != 0){
                texto += "Orden: " + conection.rs.getString("codigo") + "\n" 
                        + "Fecha: " + conection.rs.getString("fecha") + "\n"
                        + "Mesa: " + conection.rs.getString("mesa");
                this.jTextAreaDetallesOrden.setText(texto);
                this.jTextFieldTotalOrden.setText("$" + conection.rs.getString("total"));
            }else if(conection.rs != null && conection.rs.getRow() == 0){
                this.jTextAreaDetallesOrden.setText("Orden no encontrada");
                this.jTextFieldTotalOrden.setText("$0.00");
            }else{
                System.out.println("No Se está obteniendo nada");
            }
        }catch(Exception e){
            System.out.println("Esta dando exception " + e.getMessage());
        }
    }

    private void jComboBoxBebidasActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    
    private void jComboBoxComidaActionPerformed(java.awt.event.ActionEvent evt) {
        if(this.jComboBoxComida.getItemAt(this.jComboBoxComida.getSelectedIndex()) == "Comida"){
            this.jComboBoxBebidas.setModel(new javax.swing.DefaultComboBoxModel<>(this.getComidas()));
        }else{
            this.jComboBoxBebidas.setModel(new javax.swing.DefaultComboBoxModel<>(this.getBebidas()));
        }
    }
    
    private String[] getMesas(){
        String[] mesas;
        String query = "SELECT id_mesa FROM taqueriasys.mesas WHERE taqueriasys.mesas.disponibilidad = 1;";
        
        conection.Consult(query);
        
        int n = 0,i;
        
        if(conection.rs!=null){
            try{
                conection.rs.last(); //se posiciona en el ultimo registros de la tabla
                n=conection.rs.getRow(); //regresa el numero actual del registro
                conection.rs.first();
            }catch(Exception e){}
            
            mesas = new String[n];
            
            for(i=0;i<n;i++){
                try{
                    mesas[i]= "Mesa " + conection.rs.getString("id_mesa");
                }catch(Exception e){ }
                
                try{
                    conection.rs.next();
                }catch(Exception e){}
            }
        }else{
            mesas = null;
        }
        
        return mesas;
    }
    
    private String[] getComidas(){
        String[] alimentos;
        String query = "SELECT nombre FROM taqueriasys.alimentos WHERE taqueriasys.alimentos.tipo = 'comida';";
        
        conection.Consult(query);
        
        int n = 0,i;
        
        if(conection.rs!=null){
            try{
                conection.rs.last(); //se posiciona en el ultimo registros de la tabla
                n=conection.rs.getRow(); //regresa el numero actual del registro
                conection.rs.first();
            }catch(Exception e){}
            
            alimentos = new String[n];
            
            for(i=0;i<n;i++){
                try{
                    alimentos[i]=conection.rs.getString("nombre");
                }catch(Exception e){ }
                
                try{
                    conection.rs.next();
                }catch(Exception e){}
            }
        }else{
            alimentos = null;
        }
        
        return alimentos;
    }
    
    private String[] getBebidas(){
        String[] bebidas;
        String query = "SELECT nombre FROM taqueriasys.alimentos WHERE taqueriasys.alimentos.tipo = 'bebida';";
        
        conection.Consult(query);
        
        int n = 0,i;
        
        if(conection.rs!=null){
            try{
                conection.rs.last(); //se posiciona en el ultimo registros de la tabla
                n=conection.rs.getRow(); //regresa el numero actual del registro
                conection.rs.first();
            }catch(Exception e){}
            
            bebidas = new String[n];
            
            for(i=0;i<n;i++){
                try{
                    bebidas[i]=conection.rs.getString("nombre");
                    System.out.print(bebidas[i]+" ");
                }catch(Exception e){ }
                System.out.println();
                try{
                    conection.rs.next();
                }catch(Exception e){}
            }
        }else{
            bebidas = null;
        }
        
        return bebidas;
        
    }
    
    public void mostrarListado(){
        String orden = "";
        for(int i = 0; i < this.pedido.getDetallePedido().length; i++){
            orden += this.pedido.getDetallePedido()[i].getAlimento().getNombreAlimento() + "   " 
                    + this.pedido.getDetallePedido()[i].getCantidad() + "   " 
                    + "$" + this.pedido.getDetallePedido()[i].getCantidad() * this.pedido.getDetallePedido()[i].getAlimento().getPrecio() + "\n";
        }
        
        this.jTextAreaInfoOrdenActual.setText(orden);
    }
    
    /*public void actualizarOrdenes(){
        String query = "SELECT * FROM taqueriasys.pedidos WHERE taqueriasys.pedidos.codigo = " + numeroOrden 
                + " AND taqueriasys.pedidos.estado = 1";
        
        conection.Consult(query);
        
        try{
            
            if(conection.rs != null && conection.rs.getRow() != 0){
                mesa = Integer.valueOf(conection.rs.getString("mesa"));
            }else {
                System.out.println("No Se está obteniendo nada");
            }
            
        }catch(Exception e){
            System.out.println("Esta dando exception " + e.getMessage());
        }
        
        jTextAreaOrdenesActivas
    }*/
    
}
