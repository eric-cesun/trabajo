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
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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
        btnEjercicio1 = new javax.swing.JButton();
        btnEjercicio2 = new javax.swing.JButton();
        btnEjercicio3 = new javax.swing.JButton();
        btnEjercicio4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ejercicios"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEjercicio1.setText("Ejercicio 1");
        btnEjercicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjercicio1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEjercicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 29, -1, -1));

        btnEjercicio2.setText("Ejercicio 2");
        btnEjercicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjercicio2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEjercicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 60, -1, -1));

        btnEjercicio3.setText("Ejercicio 3");
        btnEjercicio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjercicio3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEjercicio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 91, -1, -1));

        btnEjercicio4.setText("Ejercicio 4");
        btnEjercicio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjercicio4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEjercicio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 122, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEjercicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjercicio1ActionPerformed
        // TODO add your handling code here:
        SumaRestaRadio n=new SumaRestaRadio();
        n.show();
    }//GEN-LAST:event_btnEjercicio1ActionPerformed

    private void btnEjercicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjercicio2ActionPerformed
        // TODO add your handling code here:
        SumaRestaCombo n=new SumaRestaCombo();
        n.show();
    }//GEN-LAST:event_btnEjercicio2ActionPerformed

    private void btnEjercicio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjercicio3ActionPerformed
        // TODO add your handling code here:
        TablasDeMultiplicar n=new TablasDeMultiplicar();
        n.show();
    }//GEN-LAST:event_btnEjercicio3ActionPerformed

    private void btnEjercicio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjercicio4ActionPerformed
        // TODO add your handling code here:
        Ejercicio4 n=new Ejercicio4();
        n.show();
    }//GEN-LAST:event_btnEjercicio4ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjercicio1;
    private javax.swing.JButton btnEjercicio2;
    private javax.swing.JButton btnEjercicio3;
    private javax.swing.JButton btnEjercicio4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
