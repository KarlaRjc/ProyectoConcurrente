
 // @author Alison
 
public class Configuracion_Administrador extends javax.swing.JFrame {

 
    public Configuracion_Administrador() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cambiarFotoAdmi = new javax.swing.JButton();
        cambiarUbiAdmi = new javax.swing.JButton();
        cambiarContraAdmi = new javax.swing.JButton();
        cambiarNombreAdmi = new javax.swing.JButton();
        cambiarCorreoAdmi = new javax.swing.JButton();
        cambiarMiBar = new javax.swing.JButton();
        Actualizar_info2 = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        espacioEscribir1 = new javax.swing.JTextField();
        espacioEscribir2 = new javax.swing.JTextField();
        combobox2 = new javax.swing.JComboBox();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        panel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cambiarFotoAdmi.setBackground(new java.awt.Color(255, 255, 255));
        cambiarFotoAdmi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cambiarFotoAdmi.setText("Cambiar foto");
        cambiarFotoAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarFotoAdmiActionPerformed(evt);
            }
        });

        cambiarUbiAdmi.setBackground(new java.awt.Color(255, 255, 255));
        cambiarUbiAdmi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cambiarUbiAdmi.setText("Cambiar ubicación");
        cambiarUbiAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarUbiAdmiActionPerformed(evt);
            }
        });

        cambiarContraAdmi.setBackground(new java.awt.Color(255, 255, 255));
        cambiarContraAdmi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cambiarContraAdmi.setText("Cambiar contraseña");
        cambiarContraAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarContraAdmiActionPerformed(evt);
            }
        });

        cambiarNombreAdmi.setBackground(new java.awt.Color(255, 255, 255));
        cambiarNombreAdmi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cambiarNombreAdmi.setText("Cambiar nombre");
        cambiarNombreAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarNombreAdmiActionPerformed(evt);
            }
        });

        cambiarCorreoAdmi.setBackground(new java.awt.Color(255, 255, 255));
        cambiarCorreoAdmi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cambiarCorreoAdmi.setText("Cambiar Correo");
        cambiarCorreoAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarCorreoAdmiActionPerformed(evt);
            }
        });

        cambiarMiBar.setBackground(new java.awt.Color(255, 255, 255));
        cambiarMiBar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cambiarMiBar.setText("Mi bar");
        cambiarMiBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarMiBarActionPerformed(evt);
            }
        });

        Actualizar_info2.setBackground(new java.awt.Color(255, 255, 255));
        Actualizar_info2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Actualizar_info2.setText("Actualizar información");
        Actualizar_info2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualizar_info2ActionPerformed(evt);
            }
        });

        Regresar.setBackground(new java.awt.Color(255, 255, 255));
        Regresar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        jLabel4.setText("Foto administrador");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mi ID");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Configuraciones");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("(Número) ciclo");

        espacioEscribir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacioEscribir1ActionPerformed(evt);
            }
        });

        espacioEscribir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacioEscribir2ActionPerformed(evt);
            }
        });

        combobox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "San José", "Heredia", "Alajuela" }));

        txt1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt1.setForeground(new java.awt.Color(51, 51, 51));
        txt1.setText("Escriba el nuevo nombre");

        txt2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt2.setText("Seleccione su nueva ubicación");

        txt3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt3.setText("Confirmar contraseña");

        txt4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt4.setText("Ingrese nueva contraseña");

        txt5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt5.setForeground(new java.awt.Color(51, 51, 51));
        txt5.setText("Escriba el nuevo correo");

        panel.setBackground(new java.awt.Color(204, 255, 255));
        panel.setForeground(new java.awt.Color(102, 0, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cambiarContraAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cambiarCorreoAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cambiarFotoAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cambiarNombreAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cambiarUbiAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cambiarMiBar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt5)
                                    .addComponent(txt1)
                                    .addComponent(txt2))))
                        .addGap(5, 5, 5)
                        .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(txt3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(Actualizar_info2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(Regresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(espacioEscribir1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(espacioEscribir2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(cambiarContraAdmi))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(cambiarCorreoAdmi))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(cambiarFotoAdmi))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(cambiarNombreAdmi))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel6))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(cambiarUbiAdmi))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(cambiarMiBar))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt5)
                            .addComponent(txt1)
                            .addComponent(txt4))
                        .addGap(5, 5, 5)
                        .addComponent(txt2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(txt3)
                .addGap(35, 35, 35)
                .addComponent(Actualizar_info2)
                .addGap(97, 97, 97)
                .addComponent(Regresar))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(espacioEscribir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(espacioEscribir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarContraAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarContraAdmiActionPerformed
        txt4.setVisible(true);
        txt3.setVisible(true);
        txt1.setVisible(false);
        txt2.setVisible(false);
        combobox2.setVisible(false);
        espacioEscribir1.setVisible(true);
        espacioEscribir2.setVisible(true);
        //deshabilitar los otros botones
        cambiarUbiAdmi.setEnabled(false);
        cambiarFotoAdmi.setEnabled(false);
        cambiarNombreAdmi.setEnabled(false);
        cambiarCorreoAdmi.setEnabled(false);
        cambiarMiBar.setEnabled(false);
        Actualizar_info2.setVisible(true);

    }//GEN-LAST:event_cambiarContraAdmiActionPerformed

    private void cambiarFotoAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarFotoAdmiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarFotoAdmiActionPerformed

    private void cambiarNombreAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarNombreAdmiActionPerformed
            txt1.setVisible(true);
            txt2.setVisible(false);
            combobox2.setVisible(false);
            txt3.setVisible(false);
            txt4.setVisible(false);
            txt5.setVisible(false);
            espacioEscribir1.setVisible(false);
            espacioEscribir2.setVisible(true);
            //deshabilitar los botones
            cambiarUbiAdmi.setEnabled(false);
            cambiarContraAdmi.setEnabled(false);
            cambiarCorreoAdmi.setEnabled(false);
            cambiarFotoAdmi.setEnabled(false);
            cambiarMiBar.setEnabled(false);
            Actualizar_info2.setVisible(true); 
    }//GEN-LAST:event_cambiarNombreAdmiActionPerformed

    private void cambiarUbiAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarUbiAdmiActionPerformed
        txt1.setVisible(false);
        espacioEscribir1.setVisible(false);
        txt3.setVisible(false);
        txt4.setVisible(false);
        espacioEscribir2.setVisible(false);
        combobox2.setVisible(true);
        txt2.setVisible(true);
        //deshabilitar los botones
        cambiarNombreAdmi.setEnabled(false);
        cambiarContraAdmi.setEnabled(false);
        cambiarCorreoAdmi.setEnabled(false);
        cambiarFotoAdmi.setEnabled(false);
        Actualizar_info2.setVisible(true);
        cambiarMiBar.setEnabled(false);

    }//GEN-LAST:event_cambiarUbiAdmiActionPerformed

    private void cambiarCorreoAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarCorreoAdmiActionPerformed
        txt1.setVisible(false);
        txt2.setVisible(false);
        txt3.setVisible(false);
        txt5.setVisible(true);
        txt4.setVisible(false);
        combobox2.setVisible(false);
        espacioEscribir1.setVisible(false);
        espacioEscribir2.setVisible(true);
        //deshabilitar botones
        cambiarNombreAdmi.setEnabled(false);
        cambiarContraAdmi.setEnabled(false);
        cambiarUbiAdmi.setEnabled(false);
        cambiarFotoAdmi.setEnabled(false);
        Actualizar_info2.setVisible(true);
        cambiarMiBar.setEnabled(false);

    }//GEN-LAST:event_cambiarCorreoAdmiActionPerformed

    private void cambiarMiBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarMiBarActionPerformed
        txt1.setVisible(false);
        txt2.setVisible(false);
        txt3.setVisible(false);
        txt5.setVisible(false);
        txt4.setVisible(false);
        combobox2.setVisible(false);
        espacioEscribir1.setVisible(false);
        espacioEscribir2.setVisible(false);
        //deshabilitar botones
        cambiarNombreAdmi.setEnabled(false);
        cambiarContraAdmi.setEnabled(false);
        cambiarUbiAdmi.setEnabled(false);
        cambiarCorreoAdmi.setEnabled(false);
        cambiarFotoAdmi.setEnabled(false);
        Actualizar_info2.setVisible(true);
    }//GEN-LAST:event_cambiarMiBarActionPerformed

    private void Actualizar_info2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_info2ActionPerformed

    }//GEN-LAST:event_Actualizar_info2ActionPerformed

    private void espacioEscribir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacioEscribir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_espacioEscribir1ActionPerformed

    private void espacioEscribir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacioEscribir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_espacioEscribir2ActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        //desabilitar
        txt1.setVisible(false);
        txt2.setVisible(false);
        txt3.setVisible(false);
        txt5.setVisible(false);
        txt4.setVisible(false);
        espacioEscribir1.setVisible(false);
        espacioEscribir2.setVisible(false);
        combobox2.setVisible(false);
        Actualizar_info2.setVisible(false);
        //habilitar botones de opción
        cambiarNombreAdmi.setEnabled(true);
        cambiarContraAdmi.setEnabled(true);
        cambiarUbiAdmi.setEnabled(true);
        cambiarFotoAdmi.setEnabled(true);
        cambiarCorreoAdmi.setEnabled(true);
        cambiarMiBar.setEnabled(true);
    }//GEN-LAST:event_RegresarActionPerformed

   
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
            java.util.logging.Logger.getLogger(Configuracion_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuracion_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuracion_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuracion_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuracion_Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar_info2;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton cambiarContraAdmi;
    private javax.swing.JButton cambiarCorreoAdmi;
    private javax.swing.JButton cambiarFotoAdmi;
    private javax.swing.JButton cambiarMiBar;
    private javax.swing.JButton cambiarNombreAdmi;
    private javax.swing.JButton cambiarUbiAdmi;
    private javax.swing.JComboBox combobox2;
    private javax.swing.JTextField espacioEscribir1;
    private javax.swing.JTextField espacioEscribir2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel panel;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    // End of variables declaration//GEN-END:variables
}
