/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Campo
 */
public class RegistroAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form RegistroAdministrador
     */
    public RegistroAdministrador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuarioAdmin = new javax.swing.JLabel();
        textfieldAdmin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        textfieldAdmin1 = new javax.swing.JTextField();
        ubicacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ubicacion1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        agregarFoto = new javax.swing.JButton();
        foto = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuarioAdmin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usuarioAdmin.setText("Usuario:");
        getContentPane().add(usuarioAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 95, 33));

        textfieldAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldAdminActionPerformed(evt);
            }
        });
        getContentPane().add(textfieldAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 170, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 107, 33));

        jPasswordField1.setText("jPasswordField1");
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 170, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Correo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 107, 33));

        textfieldAdmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldAdmin1ActionPerformed(evt);
            }
        });
        getContentPane().add(textfieldAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 170, 20));

        ubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacionActionPerformed(evt);
            }
        });
        getContentPane().add(ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 250, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Ubicacion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 107, 33));

        ubicacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacion1ActionPerformed(evt);
            }
        });
        getContentPane().add(ubicacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 250, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Guardar datos");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Agregar Bar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 230, 20));

        agregarFoto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        agregarFoto.setText("Agregar Foto");
        agregarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarFotoActionPerformed(evt);
            }
        });
        getContentPane().add(agregarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/photo-placeholder.jpg"))); // NOI18N
        getContentPane().add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 170, 130));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Por favor, rellena con tu informacion personal los espacios en blanco.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textfieldAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldAdminActionPerformed

    private void textfieldAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldAdmin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldAdmin1ActionPerformed

    private void ubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubicacionActionPerformed

    private void ubicacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubicacion1ActionPerformed

    private void agregarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarFotoActionPerformed
        imagenNueva ventana = new imagenNueva();
        

    }//GEN-LAST:event_agregarFotoActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton agregarFoto;
    public static javax.swing.JLabel foto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField textfieldAdmin;
    private javax.swing.JTextField textfieldAdmin1;
    private javax.swing.JTextField ubicacion;
    private javax.swing.JTextField ubicacion1;
    private javax.swing.JLabel usuarioAdmin;
    // End of variables declaration//GEN-END:variables
}
