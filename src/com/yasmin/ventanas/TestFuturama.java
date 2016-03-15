package com.yasmin.ventanas;

import com.yasmin.clases.Preguntas;
import com.yasmin.clases.Respuestas;
import java.applet.AudioClip;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


/**
 * Clase que contiene todas las preguntas opciones e imagenes que se muestran en
 * la ejecución
 *
 * @author Yasmín
 */
public class TestFuturama extends javax.swing.JFrame {

    public TestFuturama() {
        initComponents();
        setSize(600, 550);
        pregunta.setText(p.getPregunta(posicion));
        String[] aux = r.setOpciones(posicion);
        buttonGroup1.clearSelection();
        opc1.setText(aux[0]);
        opc2.setText(aux[1]);
        opc3.setText(aux[2]);
        opc4.setText(aux[3]);
        opc1.requestFocus();
        anterior.setEnabled(false);
        terminar.setEnabled(false);
        siguiente.setEnabled(true);
    }
    int posicion = 0;
    int posicionImagen = 0;
    Preguntas p = new Preguntas(); //Creamos un objeto de la clase Preguntas
    Respuestas r = new Respuestas(); //Creamos un objeto de la clase Respuestas
    //Array que permite saber que opciones se han seleccionado 
    Object[] seleccion = {"", "", "", "", "", "", "", "", "", ""};
    //Array que contiene las rutas de las imagenes
    String[] img = {
        "/com/yasmin/imagenes/bender.jpg",
        "/com/yasmin/imagenes/lila.jpg",
        "/com/yasmin/imagenes/fry.png",
        "/com/yasmin/imagenes/Earth.png",
        "/com/yasmin/imagenes/emi.jpg",
        "/com/yasmin/imagenes/profesor.jpg",
        "/com/yasmin/imagenes/lrrr.jpg",
        "/com/yasmin/imagenes/fry2.jpg",
        "/com/yasmin/imagenes/zoidberg.jpg",
        "/com/yasmin/imagenes/personajes.jpg"
    };
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pregunta = new javax.swing.JLabel();
        opc1 = new javax.swing.JRadioButton();
        opc2 = new javax.swing.JRadioButton();
        opc3 = new javax.swing.JRadioButton();
        opc4 = new javax.swing.JRadioButton();
        salir = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        terminar = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(506, 469));
        setMinimumSize(new java.awt.Dimension(506, 469));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Test Futurama"));
        jPanel1.setPreferredSize(new java.awt.Dimension(506, 469));

        pregunta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pregunta.setText("Preguntas");

        opc1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(opc1);
        opc1.setText("jRadioButton1");
        opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1ActionPerformed(evt);
            }
        });

        opc2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(opc2);
        opc2.setText("jRadioButton2");
        opc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc2ActionPerformed(evt);
            }
        });

        opc3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(opc3);
        opc3.setText("jRadioButton3");
        opc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc3ActionPerformed(evt);
            }
        });

        opc4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(opc4);
        opc4.setText("jRadioButton4");
        opc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc4ActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        terminar.setText("Terminar test");
        terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(anterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(terminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(opc2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opc1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opc3, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opc4, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opc1)
                .addGap(16, 16, 16)
                .addComponent(opc2)
                .addGap(17, 17, 17)
                .addComponent(opc3)
                .addGap(18, 18, 18)
                .addComponent(opc4)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siguiente)
                    .addComponent(anterior))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(terminar)
                    .addComponent(salir)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método en el que se configura el JButton Siguiente
     *
     * @param evt
     */
    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        if (posicion == 8) {
            siguiente.setEnabled(false);
            terminar.setEnabled(true);
        }
        if (posicion < 10) { //Si la posicion es menor a 10 (número de preguntas) se accede a los métodos de las preguntas
            anterior.setEnabled(true);
            posicion++;
            pregunta.setText(p.getPregunta(posicion)); //Captura en el JLabel pregunta las preguntas que están dentro del Array preguntas a través del método getPregunta
            String[] aux = r.setOpciones(posicion); //Opciones
            buttonGroup1.clearSelection(); //Borra las selecciones de los JButton
            //Captura en cada JButton las opciones del Array a través del método setOpciones
            opc1.setText(aux[0]);
            opc2.setText(aux[1]);
            opc3.setText(aux[2]);
            opc4.setText(aux[3]);
            opc1.requestFocus(); //Cursor se centre en la opcion1
        }
        if (evt.getSource() == siguiente) {
            posicionImagen++;
        }
        URL url1 = this.getClass().getResource(img[posicionImagen]);
        try {
            Image img1 = ImageIO.read(url1);
            imagen.setIcon(new ImageIcon(img1));
        } catch (IOException e) {
            e.toString();
        }
    }//GEN-LAST:event_siguienteActionPerformed
    /**
     * Método en el que se configura el JButton Anterior
     *
     * @param evt
     */
    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        if (posicion == 0) {
            anterior.setEnabled(false);
        }
        if (posicion > -1) {
            siguiente.setEnabled(true);
            posicion--;
            pregunta.setText(p.getPregunta(posicion));
            String[] a = r.setOpciones(posicion);
            buttonGroup1.clearSelection();
            opc1.setText(a[0]);
            opc2.setText(a[1]);
            opc3.setText(a[2]);
            opc4.setText(a[3]);
            opc1.requestFocus();
        }
        if (evt.getSource() == anterior) {
            posicionImagen--;
        }
        URL url1 = this.getClass().getResource(img[posicionImagen]);
        try {
            Image img1 = ImageIO.read(url1);
            imagen.setIcon(new ImageIcon(img1));
        } catch (IOException e) {
            e.toString();
        }
    }//GEN-LAST:event_anteriorActionPerformed
    /**
     * Método en el que se configura el JButton Salir
     *
     * @param evt
     */
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed
    /**
     * Obtiene las opciones seleccionadas
     *
     * @param evt
     */
    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1ActionPerformed
        seleccion[posicion] = opc1.getLabel();
    }//GEN-LAST:event_opc1ActionPerformed

    private void opc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc2ActionPerformed
        seleccion[posicion] = opc2.getLabel();
    }//GEN-LAST:event_opc2ActionPerformed

    private void opc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc3ActionPerformed
        seleccion[posicion] = opc3.getLabel();
    }//GEN-LAST:event_opc3ActionPerformed

    private void opc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc4ActionPerformed
        seleccion[posicion] = opc4.getLabel();
    }//GEN-LAST:event_opc4ActionPerformed
    /**
     * Método que calcula la nota final del test
     *
     * @param evt
     */
    private void terminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarActionPerformed
        Fin f = new Fin();
        f.setVisible(true);
        dispose();//Se cierra la ventana de test
        File puntuaciones=new File("puntuaciones.txt");
        String nota2;
        int nota = 0;
        int nota1=0;
        for (int i = 0; i < 10; i++) {
            if (seleccion[i].equals(r.getRespuesta(i))) { //Si las opciones son iguales a las respuestas correctas se suma 1 a nota1
                nota++;
                nota1 = nota;
            }else //Si no nota se queda igual a nota1
                nota=nota1;
            }
                nota1=nota1*10;
                nota2 = String.valueOf(nota1);
                f.porcentaje.setText(nota2+"%");
            
        if(nota1>=50){ //Si nota1 es mayor o igual al 50% de respuestas acertadas se muestra una imagen y se genera un sonido
            ImageIcon imagen=new ImageIcon(getClass().getResource("/com/yasmin/imagenes/take.jpg"));
            f.imagenFin.setIcon(imagen);
            AudioClip sonido;
            sonido=java.applet.Applet.newAudioClip(getClass().getResource("/com/yasmin/sonidos/futurama_intro.wav"));
            sonido.play();
        }else{
            ImageIcon imagenI=new ImageIcon(getClass().getResource("/com/yasmin/imagenes/mal.jpg"));
            f.imagenFin.setIcon(imagenI);
            AudioClip sonido2;
            sonido2=java.applet.Applet.newAudioClip(getClass().getResource("/com/yasmin/sonidos/fallo.wav"));
            sonido2.play();
        }
        
        File puntuacion = new File("puntuaciones.txt");
            try{
                FileWriter fw = new FileWriter(puntuacion,true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pr = new PrintWriter(bw);
                String p=f.porcentaje.getText();
                pr.write("Puntuación: "+p+"\r\n"); 
                pr.close();
                bw.close();
            }catch(IOException e){
                e.toString();
            }
    }//GEN-LAST:event_terminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton opc1;
    private javax.swing.JRadioButton opc2;
    private javax.swing.JRadioButton opc3;
    private javax.swing.JRadioButton opc4;
    private javax.swing.JLabel pregunta;
    private javax.swing.JButton salir;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton terminar;
    // End of variables declaration//GEN-END:variables
}
