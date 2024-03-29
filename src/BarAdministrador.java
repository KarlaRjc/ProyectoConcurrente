
// @author emilio
 
public class BarAdministrador extends javax.swing.JFrame {

    //Atributos
    String Nombre, Telefono, Ubicacion, parqueo, moneda, horario;

    public BarAdministrador() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Parqueo = new javax.swing.ButtonGroup();
        Moneda = new javax.swing.ButtonGroup();
        jFileChooser = new javax.swing.JFileChooser();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelUbicacion = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelParqueo = new javax.swing.JLabel();
        jLabelTipoDeMoneda = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        Imagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaUbcacion = new javax.swing.JTextArea();
        jRadioButtonParqueoSi = new javax.swing.JRadioButton();
        jRadioButtonParqueoNo = new javax.swing.JRadioButton();
        jButtonAI = new javax.swing.JButton();
        jButtonAC = new javax.swing.JButton();
        jButtonAP = new javax.swing.JButton();
        jRadioButtonTDMC = new javax.swing.JRadioButton();
        jRadioButtonTDMD = new javax.swing.JRadioButton();
        jRadioButtonTDMA = new javax.swing.JRadioButton();
        Guardar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNombre.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabelNombre.setText("Nombre");

        jLabelUbicacion.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabelUbicacion.setText("Ubicacion");

        jLabelTelefono.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabelTelefono.setText("Telefono");

        jLabelParqueo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabelParqueo.setText("Parqueo");

        jLabelTipoDeMoneda.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabelTipoDeMoneda.setText("Tipo de moneda");

        jTextFieldNombre.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        jTextFieldTelefono.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignoPregunta.jpg"))); // NOI18N

        jTextAreaUbcacion.setColumns(20);
        jTextAreaUbcacion.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jTextAreaUbcacion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaUbcacion);

        Parqueo.add(jRadioButtonParqueoSi);
        jRadioButtonParqueoSi.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jRadioButtonParqueoSi.setText("Si");

        Parqueo.add(jRadioButtonParqueoNo);
        jRadioButtonParqueoNo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jRadioButtonParqueoNo.setText("No");

        jButtonAI.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonAI.setText("Agregar Imagen");

        jButtonAC.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonAC.setText("Agregar comidas");
        jButtonAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonACActionPerformed(evt);
            }
        });

        jButtonAP.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonAP.setText("Agregar promociones");
        jButtonAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAPActionPerformed(evt);
            }
        });

        Moneda.add(jRadioButtonTDMC);
        jRadioButtonTDMC.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jRadioButtonTDMC.setText("Colones");

        Moneda.add(jRadioButtonTDMD);
        jRadioButtonTDMD.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jRadioButtonTDMD.setText("Dolares");

        Moneda.add(jRadioButtonTDMA);
        jRadioButtonTDMA.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jRadioButtonTDMA.setText("Ambos");

        Guardar.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Volver.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Volver.setText("Volver");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setText("Horario");

        jTextField1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefono)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)))
                .addGap(140, 140, 140)
                .addComponent(Imagen))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200)
                .addComponent(jButtonAI))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelUbicacion))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButtonAC)
                .addGap(13, 13, 13)
                .addComponent(jButtonAP))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabelParqueo))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jRadioButtonParqueoSi))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jRadioButtonParqueoNo))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelTipoDeMoneda))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jRadioButtonTDMC))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jRadioButtonTDMD))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jRadioButtonTDMA)
                .addGap(176, 176, 176)
                .addComponent(Guardar)
                .addGap(25, 25, 25)
                .addComponent(Volver))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelNombre)
                        .addGap(19, 19, 19)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabelTelefono)
                        .addGap(19, 19, 19)
                        .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addComponent(Imagen))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButtonAI)))
                .addGap(19, 19, 19)
                .addComponent(jLabelUbicacion)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAC)
                            .addComponent(jButtonAP))))
                .addGap(30, 30, 30)
                .addComponent(jLabelParqueo)
                .addGap(19, 19, 19)
                .addComponent(jRadioButtonParqueoSi)
                .addGap(5, 5, 5)
                .addComponent(jRadioButtonParqueoNo)
                .addGap(25, 25, 25)
                .addComponent(jLabelTipoDeMoneda)
                .addGap(29, 29, 29)
                .addComponent(jRadioButtonTDMC)
                .addGap(5, 5, 5)
                .addComponent(jRadioButtonTDMD)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonTDMA)
                    .addComponent(Guardar)
                    .addComponent(Volver)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonACActionPerformed
        AgregarComidas comidas = new AgregarComidas();
        comidas.setVisible(true);

    }//GEN-LAST:event_jButtonACActionPerformed

    private void jButtonAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAPActionPerformed
        AgregarPromos promos = new AgregarPromos();
        promos.setVisible(true);
    }//GEN-LAST:event_jButtonAPActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        Nombre = jTextFieldNombre.getText();
        Telefono = jTextFieldTelefono.getText();
        Ubicacion = jTextAreaUbcacion.getText();
        horario = jTextField1.getText();
        if (jRadioButtonParqueoSi.isSelected()) {
            parqueo = "Si";
        } else if (jRadioButtonParqueoNo.isSelected()) {
            parqueo = "No";
        }

        if (jRadioButtonTDMC.isSelected()) {
            moneda = "Colones";
        } else {
            if (jRadioButtonTDMD.isSelected()) {
                moneda = "Dolares";
            } else {
                if (jRadioButtonTDMA.isSelected()) {
                    moneda = "Colones o Dolares";
                }
            }
        }
    }//GEN-LAST:event_GuardarActionPerformed

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
            java.util.logging.Logger.getLogger(BarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel Imagen;
    private javax.swing.ButtonGroup Moneda;
    private javax.swing.ButtonGroup Parqueo;
    private javax.swing.JButton Volver;
    private javax.swing.JButton jButtonAC;
    private javax.swing.JButton jButtonAI;
    private javax.swing.JButton jButtonAP;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelParqueo;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTipoDeMoneda;
    private javax.swing.JLabel jLabelUbicacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonParqueoNo;
    private javax.swing.JRadioButton jRadioButtonParqueoSi;
    private javax.swing.JRadioButton jRadioButtonTDMA;
    private javax.swing.JRadioButton jRadioButtonTDMC;
    private javax.swing.JRadioButton jRadioButtonTDMD;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaUbcacion;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
