/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo;

/**
 *
 * @author kirito205
 */
public class SumaRestaRadio extends javax.swing.JFrame {

    /**
     * Creates new form SumaRestaRadio
     */
    public SumaRestaRadio() {
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

        bg = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtNumero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumero2 = new javax.swing.JTextField();
        rbSuma = new javax.swing.JRadioButton();
        rbResta = new javax.swing.JRadioButton();
        rbMultiplicacion = new javax.swing.JRadioButton();
        rbDivision = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RadioButton Seleccion");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Operacion"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 44, 78, -1));

        jLabel1.setText("Numero 1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 49, -1, -1));

        jLabel2.setText("Numero 2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 86, -1, -1));
        jPanel1.add(txtNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 81, 78, -1));

        bg.add(rbSuma);
        rbSuma.setText("Suma");
        rbSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSumaActionPerformed(evt);
            }
        });
        jPanel1.add(rbSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 118, -1, -1));

        bg.add(rbResta);
        rbResta.setText("Resta");
        rbResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRestaActionPerformed(evt);
            }
        });
        jPanel1.add(rbResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 146, -1, -1));

        bg.add(rbMultiplicacion);
        rbMultiplicacion.setText("Multiplicacion");
        rbMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMultiplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(rbMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 174, -1, -1));

        bg.add(rbDivision);
        rbDivision.setText("Division");
        rbDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDivisionActionPerformed(evt);
            }
        });
        jPanel1.add(rbDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblResultado.setText("Resultado:");
        jPanel2.add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 44, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSumaActionPerformed
        // TODO add your handling code here:
        Quees(1);
    }//GEN-LAST:event_rbSumaActionPerformed

    private void rbRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRestaActionPerformed
        // TODO add your handling code here:
        Quees(2);
    }//GEN-LAST:event_rbRestaActionPerformed

    private void rbMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMultiplicacionActionPerformed
        // TODO add your handling code here:
        Quees(3);
    }//GEN-LAST:event_rbMultiplicacionActionPerformed

    private void rbDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDivisionActionPerformed
        // TODO add your handling code here:
        Quees(4);
    }//GEN-LAST:event_rbDivisionActionPerformed

    public static void Quees(int n)
    {
        if (txtNumero.getText().length()!=0 && txtNumero2.getText().length()!=0) {
        float numero= Float.parseFloat(txtNumero.getText());
        float numero2=Float.parseFloat(txtNumero2.getText());
        float resultado=0;
        if (n==1) {
            resultado=numero+numero2;
            lblResultado.setText("Resultado Suma: "+ resultado);
        }
        if (n==2) {
            resultado=numero-numero2;
            lblResultado.setText("Resultado Resta: "+ resultado);
        }
        if (n==3) {
            resultado=numero*numero2;
            lblResultado.setText("Resultado Multiplicacion: "+ resultado);
        }
        if (n==4) {
            resultado=numero/numero2;
            lblResultado.setText("Resultado Divicion: "+ resultado);
        }
        }
        else{
        lblResultado.setText("Resultado: ");
        }
    }
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
            java.util.logging.Logger.getLogger(SumaRestaRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SumaRestaRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SumaRestaRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SumaRestaRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SumaRestaRadio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel lblResultado;
    public static javax.swing.JRadioButton rbDivision;
    public static javax.swing.JRadioButton rbMultiplicacion;
    public static javax.swing.JRadioButton rbResta;
    public static javax.swing.JRadioButton rbSuma;
    public static javax.swing.JTextField txtNumero;
    public static javax.swing.JTextField txtNumero2;
    // End of variables declaration//GEN-END:variables
}
