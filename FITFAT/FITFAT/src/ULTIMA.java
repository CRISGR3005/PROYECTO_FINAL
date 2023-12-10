import java.util.Random;
public class ULTIMA extends javax.swing.JFrame {

 
    public void CALCULAR() {
        int arreglo;
        String[] frases = {
            "Cada gota de sudor te acerca a tu meta.",
            "No te preocupes por el paso lento; preocúpate por detenerte",
            "Tu único límite es tú mismo. ¡Supérate!",
            "Cada repetición cuenta, estás más cerca de tu transformación.",
            "No se trata de ser el mejor, se trata de ser mejor que ayer",
            "El dolor que sientes hoy será tu fuerza mañana.",
            "Tus sueños no funcionarán a menos que lo hagas. ¡A entrenar!",
            "Cada día es una nueva oportunidad para ser más fuerte que ayer.",
            "La magia sucede fuera de tu zona de confort. ¡Vamos, tú puedes!",
            "El único mal entrenamiento es el que no se hace. ¡Dale con todo!"
        };
        
        arreglo=  (int) (Math.random()*9);
   
        if (arreglo == 0) {
            txtArea1.setText(frases[0]);
        } else if (arreglo == 2) {
            txtArea1.setText(frases[2]);
        } else if (arreglo == 3) {
            txtArea1.setText(frases[3]);
        } else if (arreglo == 1) {
            txtArea1.setText(frases[1]);
        } else if (arreglo == 3) {
            txtArea1.setText(frases[3]);
        } else if (arreglo == 4) {
            txtArea1.setText(frases[4]);
        } else if (arreglo == 5) {
            txtArea1.setText(frases[5]);
        } else if (arreglo == 6) {
            txtArea1.setText(frases[6]);
        } else if (arreglo == 7) {
            txtArea1.setText(frases[7]);
        } else if (arreglo == 8) {
            txtArea1.setText(frases[8]);
        } else if (arreglo == 9) {
            txtArea1.setText(frases[9]);
        } else{
            txtArea1.setText("si nada esta bien es que no emos llegado al final");
                                  
      }
   
    }

 
   

    
    
    public ULTIMA() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtArea1 = new java.awt.TextArea();
        jButton2 = new javax.swing.JButton();
        salix = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(47, 72, 88));
        jPanel1.setForeground(new java.awt.Color(0, 76, 105));

        jLabel10.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(242, 242, 66));
        jLabel10.setText("frase del dia ");

        txtArea1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jButton2.setBackground(new java.awt.Color(0, 210, 252));
        jButton2.setText("FRASE :)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        salix.setBackground(new java.awt.Color(255, 0, 51));
        salix.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salix.setText("salida");
        salix.setToolTipText("");
        salix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salixActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(txtArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salix, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(salix)
                .addContainerGap())
        );

        jButton2.getAccessibleContext().setAccessibleName("FRASE DEL DIA ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //creado para que este boton genere los resltados del diagnostico
        CALCULAR();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void salixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salixActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salixActionPerformed

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
            java.util.logging.Logger.getLogger(ULTIMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ULTIMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ULTIMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ULTIMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ULTIMA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salix;
    private java.awt.TextArea txtArea1;
    // End of variables declaration//GEN-END:variables
}
