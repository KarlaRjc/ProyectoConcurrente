
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
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cambiarFotoUsu.setBackground(new java.awt.Color(255, 255, 255));
        cambiarFotoUsu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cambiarFotoUsu.setForeground(new java.awt.Color(0, 0, 0));
        cambiarFotoUsu.setText("Cambiar foto");
        cambiarFotoUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarFotoUsuActionPerformed(evt);
            }
        });
        getContentPane().add(cambiarFotoUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, -1));

        cambiarNombreUsu.setBackground(new java.awt.Color(255, 255, 255));
        cambiarNombreUsu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cambiarNombreUsu.setForeground(new java.awt.Color(0, 0, 0));
        cambiarNombreUsu.setText("Cambiar nombre");
        cambiarNombreUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarNombreUsuActionPerformed(evt);
            }
        });
        getContentPane().add(cambiarNombreUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, -1));

        cambiarUbiUsu.setBackground(new java.awt.Color(255, 255, 255));
        cambiarUbiUsu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cambiarUbiUsu.setForeground(new java.awt.Color(0, 0, 0));
        cambiarUbiUsu.setText("Cambiar ubicación");
        cambiarUbiUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarUbiUsuActionPerformed(evt);
            }
        });
        getContentPane().add(cambiarUbiUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 140, -1));

        cambiarContraUsu.setBackground(new java.awt.Color(255, 255, 255));
        cambiarContraUsu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cambiarContraUsu.setForeground(new java.awt.Color(0, 0, 0));
        cambiarContraUsu.setText("Cambiar contraseña");
        cambiarContraUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarContraUsuActionPerformed(evt);
            }
        });
        getContentPane().add(cambiarContraUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        cambiarCorreoUsu.setBackground(new java.awt.Color(255, 255, 255));
        cambiarCorreoUsu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cambiarCorreoUsu.setForeground(new java.awt.Color(0, 0, 0));
        cambiarCorreoUsu.setText("Cambiar Correo");
        cambiarCorreoUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarCorreoUsuActionPerformed(evt);
            }
        });
        getContentPane().add(cambiarCorreoUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 140, -1));

        Regresar.setBackground(new java.awt.Color(255, 255, 255));
        Regresar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Regresar.setForeground(new java.awt.Color(0, 0, 0));
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, -1));

        Actualizar_info.setBackground(new java.awt.Color(255, 255, 255));
        Actualizar_info.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Actualizar_info.setForeground(new java.awt.Color(0, 0, 0));
        Actualizar_info.setText("Actualizar información");
        Actualizar_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualizar_infoActionPerformed(evt);
            }
        });
        getContentPane().add(Actualizar_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Poner el ID ciclo");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 100, -1));

        jLabel4.setBackground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Foto usuario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, 110));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mi ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 40, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Configuraciones");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        espacioEscribir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacioEscribir1ActionPerformed(evt);
            }
        });
        getContentPane().add(espacioEscribir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 220, -1));

        espacioEscribir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacioEscribir2ActionPerformed(evt);
            }
        });
        getContentPane().add(espacioEscribir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 220, -1));

        txt1.setForeground(new java.awt.Color(0, 0, 0));
        txt1.setText("Escriba el nuevo nombre");
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        txt2.setForeground(new java.awt.Color(0, 0, 0));
        txt2.setText("Seleccione su nueva ubicación");
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        txt3.setForeground(new java.awt.Color(0, 0, 0));
        txt3.setText("Confirmar contraseña");
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        txt4.setForeground(new java.awt.Color(0, 0, 0));
        txt4.setText("Ingrese nueva contraseña");
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        txt5.setForeground(new java.awt.Color(0, 0, 0));
        txt5.setText("Escriba el nuevo correo");
        getContentPane().add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "San José", "Heredia", "Alajuela" }));
        getContentPane().add(combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 130, 30));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura.PNG"))); // NOI18N
        imagen.setText("jLabel7");
        getContentPane().add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 150, 110));

        panel.setBackground(new java.awt.Color(204, 255, 255));
        panel.setForeground(new java.awt.Color(102, 0, 255));
        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 390, 310));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 500));
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 460, 500));

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
