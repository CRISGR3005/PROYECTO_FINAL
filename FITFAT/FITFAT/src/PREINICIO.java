
import javax.swing.JOptionPane;


public class PREINICIO extends javax.swing.JFrame {
    
     private void CALCULAR() {
          try {
         double presion = Double.parseDouble(txtpresion1.getText());
         double frecuncia = Double.parseDouble(txtfrecuencia1.getText());
         
         if (presion<=120 && frecuncia<=100){
             txtresultado.setText("¡Excelente noticia que tus medidas de presión arterial estén en un rango saludable!"
                     + " Aquí tienes un mensaje positivo para animar a alguien que ha pasado con éxito una evaluación "
                     + "de presión arterial y está listo para emprender un programa de ejercicio:\n"
                     + "\n"
                     + "\"¡Enhorabuena por mantener tu presión arterial en niveles saludables! "
                     + "\n"
                     +"Tu dedicación a la salud cardiovascular es admirable. Con tus valores de presión arterial en un rango óptimo, estás más que"
                     + "\n"
                     + " listo/a para embarcarte en un emocionante viaje de ejercicio. Ya sea que prefieras caminar, correr, nadar o participar en clases de fitness, tu cuerpo está preparado para enfrentar nuevos desafíos."
                     + "\n"
                     + " Recuerda escuchar a tu cuerpo, disfrutar del proceso y, sobre todo,"
                     + "\n"
                     + "¡divertirte mientras te mantienes activo/a! ¡Adelante, estás en el camino correcto hacia una vida más saludable y activa!\"");
         }else 
             txtresultado.setText("Evaluación médica previa: Antes de comenzar un nuevo régimen de ejercicios, su médico puede realizar una evaluación exhaustiva para determinar su capacidad física y cualquier riesgo potencial asociado con su presión arterial elevada.\n"
                          + "\n"
                          + "Tipo de ejercicio: Opte por actividades de intensidad moderada al principio. Caminar, nadar o andar en bicicleta son ejemplos de ejercicios aeróbicos que pueden ser adecuados. Evite ejercicios intensos sin la aprobación de su médico.\n"
                          + "\n"
                          + "Frecuencia y duración: Inicie con sesiones cortas y frecuentes en lugar de ejercicios prolongados. Esto le permite adaptarse gradualmente a la actividad física sin poner demasiada presión en su sistema cardiovascular.\n"
                          + "\n"
                          + "Monitoreo constante: Durante el ejercicio, preste atención a cómo se siente. Si experimenta mareos, falta de aliento excesiva o dolor en el pecho, interrumpa la actividad y busque atención médica de inmediato.\n"
                          + "\n"
                          + "Control de la intensidad: No se esfuerce demasiado. Mantenga su frecuencia cardíaca dentro de límites seguros y evite levantar pesas pesadas sin supervisión.\n"
                          + "\n"
                          + "Hidratación: Manténgase bien hidratado, pero evite el consumo excesivo de cafeína y sodio, ya que estos pueden afectar negativamente la presión arterial.\n"
                          + "\n"
                          + "Seguimiento médico continuo: A medida que incorpora el ejercicio a su rutina, mantenga un diálogo abierto con su médico. Ajuste su plan de ejercicios según sus recomendaciones y realice chequeos regulares para monitorear su presión arterial.\n"
                          + "\n"
                          + "Recuerde que la seguridad es lo primero, y cualquier plan de ejercicios debe ser personalizado según su condición de salud única. Siempre es mejor recibir orientación profesional antes de realizar cambios significativos en su actividad física.");

  
         
         if (presion <= 0 || presion <= 0) {
                if (presion <= 0 || presion <= 0) {
                    JOptionPane.showMessageDialog(this, "Su presion es muy alta ", "favor de consultar su medico ", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
         }
      }catch(NumberFormatException ex) {
           JOptionPane.showMessageDialog(this,"Porfavor introduce lo que se te pide ","Error",JOptionPane.ERROR_MESSAGE);
}
    
     }
    
    public PREINICIO() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        salix = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtpresion1 = new javax.swing.JTextField();
        txtfrecuencia1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtresultado = new java.awt.TextArea();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(47, 72, 88));
        jPanel1.setForeground(new java.awt.Color(132, 94, 194));

        salix.setBackground(new java.awt.Color(255, 0, 51));
        salix.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salix.setText("salida");
        salix.setToolTipText("");
        salix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salixActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText(" ");

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setForeground(new java.awt.Color(132, 94, 194));
        jButton1.setText("seguir con el programa ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(15, 252, 117));
        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 251, 142));
        jLabel11.setText("frecuencia cardiaca ");

        jLabel12.setBackground(new java.awt.Color(15, 252, 117));
        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 251, 142));
        jLabel12.setText("atencion opcion antes de seguir ");

        jLabel13.setBackground(new java.awt.Color(15, 252, 117));
        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 251, 142));
        jLabel13.setText("introduce tu presion arterial ");

        txtpresion1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtpresion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpresion1ActionPerformed(evt);
            }
        });

        txtfrecuencia1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtfrecuencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfrecuencia1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 210, 252));
        jButton2.setText("CALCULAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtresultado.setEditable(false);
        txtresultado.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(txtfrecuencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(salix, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel13)
                    .addContainerGap(882, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(txtpresion1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1005, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(120, 120, 120)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtfrecuencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txtresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(salix)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(311, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(txtpresion1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(268, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1062, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salixActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salixActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      SEGUNDA prueba=new SEGUNDA();
prueba.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtpresion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpresion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpresion1ActionPerformed

    private void txtfrecuencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfrecuencia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfrecuencia1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //creado para que este boton genere los resltados del diagnostico
        CALCULAR();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PREINICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PREINICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PREINICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PREINICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PREINICIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salix;
    private javax.swing.JTextField txtfrecuencia1;
    private javax.swing.JTextField txtpresion1;
    private java.awt.TextArea txtresultado;
    // End of variables declaration//GEN-END:variables
}
