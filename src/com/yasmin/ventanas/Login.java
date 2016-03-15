package com.yasmin.ventanas;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.ImageIcon;

/**
 * En esta clase comienza el test
 * @author Yasmín
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setSize(600, 550); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        empezar = new javax.swing.JButton();
        user = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(516, 469));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Test Futurama"));
        jPanel1.setPreferredSize(new java.awt.Dimension(506, 469));
        jPanel1.setLayout(null);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir);
        salir.setBounds(390, 450, 140, 23);

        empezar.setText("Empezar test");
        empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empezarActionPerformed(evt);
            }
        });
        jPanel1.add(empezar);
        empezar.setBounds(390, 420, 140, 23);

        user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("Jugador");
        jPanel1.add(user);
        user.setBounds(160, 180, 70, 40);
        jPanel1.add(userName);
        userName.setBounds(240, 190, 120, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yasmin/imagenes/índice.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(600, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 580, 510);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 580, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed
/**
 * Método en el que se configura el JButton Empezar test
 * @param evt 
 */
    private void empezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezarActionPerformed
        TestFuturama test= new TestFuturama();
        Fin f = new Fin();
            test.setVisible(true);
            dispose();//Se cierra la ventana de acceso
            ImageIcon imagen1=new ImageIcon(getClass().getResource("/com/yasmin/imagenes/bender.jpg"));
            test.imagen.setIcon(imagen1);
            
        File puntuacion = new File("puntuaciones.txt");
            try{
                FileWriter fw = new FileWriter(puntuacion,true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pr = new PrintWriter(bw);
                String usuario=userName.getText();
                pr.write("Jugador: "+usuario+"\r\n");
                pr.close();
                bw.close();
            }catch(IOException e){
                e.toString();
            }
    }//GEN-LAST:event_empezarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton empezar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salir;
    private javax.swing.JLabel user;
    public javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}