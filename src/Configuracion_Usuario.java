
 //@author Alison
public class Configuracion_Usuario extends javax.swing.JFrame {

    boolean detectar = false;

    public Configuracion_Usuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cambiarFotoUsu = new javax.swing.JButton();
        cambiarNombreUsu = new javax.swing.JButton();
        cambiarUbiUsu = new javax.swing.JButton();
        cambiarContraUsu = new javax.swing.JButton();
        cambiarCorreoUsu = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        Actualizar_info = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        espacioEscribir1 = new javax.swing.JTextField();
        espacioEscribir2 = new javax.swing.JTextField();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox();
        imagen = new javax.swing.JLabel();
        panel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        regresar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cambiarFotoUsu.setBackground(new java.awt.Color(255, 255, 255));
        cambiarFotoUsu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cambiarFotoUsu.setForeground(new java.awt.Color(0, 0, 0));
        cambiarFotoUsu.setText("Cambiar foto");
        cambiarFotoUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarFotoUsuActionPerformed(evt);
            }
        });

        cambiarNombreUsu.setBackground(new java.awt.Color(255, 255, 255));
        cambiarNombreUsu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cambiarNombreUsu.setForeground(new java.awt.Color(0, 0, 0));
        cambiarNombreUsu.setText("Cambiar nombre");
        cambiarNombreUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarNombreUsuActionPerformed(evt);
            }
        });

        cambiarUbiUsu.setBackground(new java.awt.Color(255, 255, 255));
        cambiarUbiUsu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cambiarUbiUsu.setForeground(new java.awt.Color(0, 0, 0));
        cambiarUbiUsu.setText("Cambiar ubicación");
        cambiarUbiUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarUbiUsuActionPerformed(evt);
            }
        });

        cambiarContraUsu.setBackground(new java.awt.Color(255, 255, 255));
        cambiarContraUsu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cambiarContraUsu.setForeground(new java.awt.Color(0, 0, 0));
        cambiarContraUsu.setText("Cambiar contraseña");
        cambiarContraUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarContraUsuActionPerformed(evt);
            }
        });

        cambiarCorreoUsu.setBackground(new java.awt.Color(255, 255, 255));
        cambiarCorreoUsu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cambiarCorreoUsu.setForeground(new java.awt.Color(0, 0, 0));
        cambiarCorreoUsu.setText("Cambiar Correo");
        cambiarCorreoUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarCorreoUsuActionPerformed(evt);
            }
        });

        Regresar.setBackground(new java.awt.Color(255, 255, 255));
        Regresar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Regresar.setForeground(new java.awt.Color(0, 0, 0));
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        Actualizar_info.setBackground(new java.awt.Color(255, 255, 255));
        Actualizar_info.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Actualizar_info.setForeground(new java.awt.Color(0, 0, 0));
        Actualizar_info.setText("Actualizar información");
        Actualizar_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualizar_infoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Poner el ID ciclo");

        jLabel4.setBackground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Foto usuario");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mi ID");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Configuraciones");

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

        txt1.setForeground(new java.awt.Color(0, 0, 0));
        txt1.setText("Escriba el nuevo nombre");

        txt2.setForeground(new java.awt.Color(0, 0, 0));
        txt2.setText("Seleccione su nueva ubicación");

        txt3.setForeground(new java.awt.Color(0, 0, 0));
        txt3.setText("Confirmar contraseña");

        txt4.setForeground(new java.awt.Color(0, 0, 0));
        txt4.setText("Ingrese nueva contraseña");

        txt5.setForeground(new java.awt.Color(0, 0, 0));
        txt5.setText("Escriba el nuevo correo");

        combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "San José", "Heredia", "Alajuela" }));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura.PNG"))); // NOI18N
        imagen.setText("jLabel7");

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
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cambiarFotoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cambiarUbiUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cambiarContraUsu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cambiarCorreoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cambiarNombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(txt1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(txt2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(espacioEscribir1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(Regresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(espacioEscribir2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(txt5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(txt3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txt4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(Actualizar_info))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(10, 10, 10)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cambiarFotoUsu)
                .addGap(49, 49, 49)
                .addComponent(cambiarUbiUsu)
                .addGap(9, 9, 9)
                .addComponent(cambiarContraUsu))
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(cambiarCorreoUsu))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(cambiarNombreUsu))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(txt1)
                .addGap(4, 4, 4)
                .addComponent(txt2)
                .addGap(4, 4, 4)
                .addComponent(espacioEscribir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(Regresar))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(espacioEscribir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(txt5))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(txt3))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(txt4))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(Actualizar_info))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarContraUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarContraUsuActionPerformed
        txt4.setVisible(true);
        txt3.setVisible(true);
        txt1.setVisible(false);
        txt2.setVisible(false);
        combobox.setVisible(false);
        espacioEscribir1.setVisible(true);
        espacioEscribir2.setVisible(true);
        //deshabilitar los otros botones
        cambiarUbiUsu.setEnabled(false);
        cambiarFotoUsu.setEnabled(false);
        cambiarContraUsu.setEnabled(false);
        cambiarCorreoUsu.setEnabled(false);
        Actualizar_info.setVisible(true);

    }//GEN-LAST:event_cambiarContraUsuActionPerformed

    private void Actualizar_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_infoActionPerformed


    }//GEN-LAST:event_Actualizar_infoActionPerformed

    private void cambiarNombreUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarNombreUsuActionPerformed
            txt1.setVisible(true);
            txt2.setVisible(false);
            combobox.setVisible(false);
            txt3.setVisible(false);
            txt4.setVisible(false);
            txt5.setVisible(false);
            espacioEscribir1.setVisible(false);
            espacioEscribir2.setVisible(true);
            //deshabilitar los botones
            cambiarUbiUsu.setEnabled(false);
            cambiarContraUsu.setEnabled(false);
            cambiarCorreoUsu.setEnabled(false);
            cambiarFotoUsu.setEnabled(false);
            Actualizar_info.setVisible(true);
        

// TODO add your handling code here:
    }//GEN-LAST:event_cambiarNombreUsuActionPerformed

    private void cambiarUbiUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarUbiUsuActionPerformed
        txt1.setVisible(false);
        espacioEscribir1.setVisible(false);
        txt3.setVisible(false);
        txt4.setVisible(false);
        espacioEscribir2.setVisible(false);
        combobox.setVisible(true);
        txt2.setVisible(true);
        //deshabilitar botones
        cambiarNombreUsu.setEnabled(false);
        cambiarContraUsu.setEnabled(false);
        cambiarCorreoUsu.setEnabled(false);
        cambiarFotoUsu.setEnabled(false);
        Actualizar_info.setVisible(true);
    }//GEN-LAST:event_cambiarUbiUsuActionPerformed

    private void espacioEscribir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacioEscribir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_espacioEscribir2ActionPerformed

    private void espacioEscribir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacioEscribir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_espacioEscribir1ActionPerformed

    private void cambiarCorreoUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarCorreoUsuActionPerformed
        txt1.setVisible(false);
        txt2.setVisible(false);
        txt3.setVisible(false);
        txt5.setVisible(true);
        txt4.setVisible(false);
        combobox.setVisible(false);
        espacioEscribir1.setVisible(false);
        espacioEscribir2.setVisible(true);
    //deshabilitar botones
        cambiarNombreUsu.setEnabled(false);
        cambiarContraUsu.setEnabled(false);
        cambiarUbiUsu.setEnabled(false);
        cambiarFotoUsu.setEnabled(false);
        Actualizar_info.setVisible(true);
    }//GEN-LAST:event_cambiarCorreoUsuActionPerformed

    private void cambiarFotoUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarFotoUsuActionPerformed

    }//GEN-LAST:event_cambiarFotoUsuActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        //desabilitar
        txt1.setVisible(false);
        txt2.setVisible(false);
        txt3.setVisible(false);
        txt5.setVisible(false);
        txt4.setVisible(false);
        espacioEscribir1.setVisible(false);
        espacioEscribir2.setVisible(false);
        combobox.setVisible(false);
        Actualizar_info.setVisible(false);
        //habilitar botones de opción 
        cambiarNombreUsu.setEnabled(true);
        cambiarContraUsu.setEnabled(true);
        cambiarUbiUsu.setEnabled(true);
        cambiarFotoUsu.setEnabled(true);
        cambiarCorreoUsu.setEnabled(true);
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
            java.util.logging.Logger.getLogger(Configuracion_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuracion_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuracion_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuracion_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuracion_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar_info;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton cambiarContraUsu;
    private javax.swing.JButton cambiarCorreoUsu;
    private javax.swing.JButton cambiarFotoUsu;
    private javax.swing.JButton cambiarNombreUsu;
    private javax.swing.JButton cambiarUbiUsu;
    private javax.swing.JComboBox combobox;
    private javax.swing.JTextField espacioEscribir1;
    private javax.swing.JTextField espacioEscribir2;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel panel;
    private javax.swing.JLabel regresar;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    // End of variables declaration//GEN-END:variables
}
