package com.yasmin.ventanas;
/**
 * Clase que muesta el resultado final del test
 * @author Yasmín
 */
public class Fin extends javax.swing.JFrame {
    public Fin() {
        initComponents();
        setSize(600, 550);
    }
    /**
     * Muestra el resultado final del test
     * @return Retorna el resultado del test
     */
    public String resultado(){
     return porcentaje.getText();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        porcentaje = new javax.swing.JLabel();
        repetir = new javax.swing.JButton();
        imagenFin = new javax.swing.JLabel();
        fondoFin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Test Futurama"));
        jPanel1.setMaximumSize(new java.awt.Dimension(506, 469));
        jPanel1.setMinimumSize(new java.awt.Dimension(506, 469));
        jPanel1.setPreferredSize(new java.awt.Dimension(506, 469));
        jPanel1.setLayout(null);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir);
        salir.setBounds(440, 469, 99, 23);

        porcentaje.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        porcentaje.setText("por");
        jPanel1.add(porcentaje);
        porcentaje.setBounds(390, 160, 130, 130);

        repetir.setText("Repetir test");
        repetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repetirActionPerformed(evt);
            }
        });
        jPanel1.add(repetir);
        repetir.setBounds(440, 440, 100, 23);
        jPanel1.add(imagenFin);
        imagenFin.setBounds(60, 140, 250, 210);
        jPanel1.add(fondoFin);
        fondoFin.setBounds(0, 0, 700, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 581, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed
/**
 * Método en el que se configura el JButton Repetir
 * @param evt 
 */
    private void repetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repetirActionPerformed
        Login l = new Login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_repetirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondoFin;
    public javax.swing.JLabel imagenFin;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel porcentaje;
    private javax.swing.JButton repetir;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
