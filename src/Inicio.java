
// @author Alison
 
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
    }

      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonReg_Administardor = new javax.swing.JButton();
        BotonReg_Usuario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonReg_Administardor.setText("Registarme");
        BotonReg_Administardor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReg_AdministardorActionPerformed(evt);
            }
        });
        getContentPane().add(BotonReg_Administardor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        BotonReg_Usuario.setText("Registarme");
        BotonReg_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReg_UsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(BotonReg_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 110, -1));

        jLabel3.setText("Administrador");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel4.setText("Usuario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jButton2.setText("Ingresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 240, 350));

        jLabel2.setText("jLabel1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 240, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonReg_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReg_UsuarioActionPerformed
        RegistroUsuario Obj1 = new RegistroUsuario();  //objeto de la clase registro usuario
        Obj1.setVisible(true);        //cuando se selecciona el boton aparece la interfaz del registro usuario  
        this.dispose();
    }//GEN-LAST:event_BotonReg_UsuarioActionPerformed

    private void BotonReg_AdministardorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReg_AdministardorActionPerformed
        RegistroAdministrador Obj2 = new RegistroAdministrador(); //objeto de la clase registro administrador
        Obj2.setVisible(true);      //cuando se selecciona el boton aparece la interfaz del registro administrador
        this.dispose();
    }//GEN-LAST:event_BotonReg_AdministardorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        IngresaAdministrador Obj4 = new IngresaAdministrador(); 
        Obj4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        IngresaUsuario Obj5 = new IngresaUsuario();
        Obj5.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonReg_Administardor;
    private javax.swing.JButton BotonReg_Usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
