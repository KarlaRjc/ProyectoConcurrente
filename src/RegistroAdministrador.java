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
        contraTXT = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        nombreAdmin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ubicacionadmin = new javax.swing.JTextField();
        guardarDatos = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        agregarFoto = new javax.swing.JButton();
        foto = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        crreoAdmin = new javax.swing.JTextField();
        usuarioAdmin1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuarioAdmin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usuarioAdmin.setText("Nombre:");
        getContentPane().add(usuarioAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 95, 33));

        textfieldAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldAdminActionPerformed(evt);
            }
        });
        getContentPane().add(textfieldAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 170, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 107, 33));

        contraTXT.setText("jPasswordField1");
        getContentPane().add(contraTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 170, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Correo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 107, 33));

        nombreAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreAdminActionPerformed(evt);
            }
        });
        getContentPane().add(nombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 230, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Ubicacion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 107, 33));

        ubicacionadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacionadminActionPerformed(evt);
            }
        });
        getContentPane().add(ubicacionadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 250, 20));

        guardarDatos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        guardarDatos.setText("Guardar datos");
        guardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(guardarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

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
        getContentPane().add(agregarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/photo-placeholder.jpg"))); // NOI18N
        getContentPane().add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 170, 130));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Por favor, rellena con tu informacion personal los espacios en blanco.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));
        getContentPane().add(crreoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 190, 20));

        usuarioAdmin1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usuarioAdmin1.setText("Usuario:");
        getContentPane().add(usuarioAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 95, 33));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textfieldAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldAdminActionPerformed

    private void nombreAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreAdminActionPerformed

    private void ubicacionadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacionadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubicacionadminActionPerformed

    private void agregarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarFotoActionPerformed
        imagenNueva ventana = new imagenNueva();
        

    }//GEN-LAST:event_agregarFotoActionPerformed

    private void guardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDatosActionPerformed
   
     
     
       
    }//GEN-LAST:event_guardarDatosActionPerformed

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
    private javax.swing.JPasswordField contraTXT;
    private javax.swing.JTextField crreoAdmin;
    public static javax.swing.JLabel foto;
    private javax.swing.JButton guardarDatos;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JTextField nombreAdmin;
    private javax.swing.JTextField textfieldAdmin;
    public static javax.swing.JTextField ubicacionadmin;
    private javax.swing.JLabel usuarioAdmin;
    private javax.swing.JLabel usuarioAdmin1;
    // End of variables declaration//GEN-END:variables
}
