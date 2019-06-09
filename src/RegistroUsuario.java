
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Campo
 */
public class RegistroUsuario extends javax.swing.JFrame {
  static String usuario,contrasena,correo,ubicacion,nombre,sobremi;
    
    /**
     * Creates new form IngresaUsuario
     */
    public RegistroUsuario() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        correoUsuario = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        agregarFoto = new javax.swing.JButton();
        foto = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        acercaUsuario = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        ubicacionUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        usuarioTXT1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Correo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 107, 33));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 95, 33));

        correoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(correoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 250, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Guardar datos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 150, -1));

        agregarFoto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        agregarFoto.setText("Agregar Foto");
        agregarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarFotoActionPerformed(evt);
            }
        });
        jPanel1.add(agregarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/photo-placeholder.jpg"))); // NOI18N
        jPanel1.add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 170, 130));

        nombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });
        jPanel1.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 230, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 107, 33));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Acerca de mi:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 130, 50));

        acercaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(acercaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 240, 80));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 210, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Ubicacion:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 107, 33));

        ubicacionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacionUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(ubicacionUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 250, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Por favor, rellena con tu informacion personal los espacios en blanco.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Nombre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        usuarioTXT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTXT1ActionPerformed(evt);
            }
        });
        jPanel1.add(usuarioTXT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 220, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void correoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoUsuarioActionPerformed
  
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        nombre=nombreTxt.getText();
        usuario=usuarioTXT1.getText();
        contrasena=jPasswordField1.getText();
       correo=correoUsuario.getText();
       ubicacion=ubicacionUsuario.getText();
       sobremi=acercaUsuario.getText();
    
         
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void acercaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acercaUsuarioActionPerformed

    private void ubicacionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacionUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubicacionUsuarioActionPerformed

    private void agregarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarFotoActionPerformed
      imagenNueva ventana = new imagenNueva();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
      
     
    }//GEN-LAST:event_agregarFotoActionPerformed

    private void usuarioTXT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTXT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioTXT1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField acercaUsuario;
    public static javax.swing.JButton agregarFoto;
    public static javax.swing.JTextField correoUsuario;
    public static javax.swing.JLabel foto;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    public static javax.swing.JTextField nombreTxt;
    public static javax.swing.JTextField ubicacionUsuario;
    private javax.swing.JTextField usuarioTXT1;
    // End of variables declaration//GEN-END:variables
}
