/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Namikaze Yanz
 */
public class GUIOperasiDuaAngka extends javax.swing.JFrame {
   
    public GUIOperasiDuaAngka() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Angka2 = new javax.swing.JTextField();
        JtHasil = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Jlsimbol1 = new javax.swing.JButton();
        Jlsimbol2 = new javax.swing.JButton();
        Jlsimbol3 = new javax.swing.JButton();
        Jlsimbol4 = new javax.swing.JButton();
        Jlsimbol5 = new javax.swing.JButton();
        Angka1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Operasi Dua Angka");

        jLabel2.setText("=");

        Jlsimbol1.setText("+");
        Jlsimbol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jlsimbol1ActionPerformed(evt);
            }
        });
        Jlsimbol1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jlsimbol1KeyTyped(evt);
            }
        });

        Jlsimbol2.setText("-");
        Jlsimbol2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jlsimbol2ActionPerformed(evt);
            }
        });

        Jlsimbol3.setText("x");
        Jlsimbol3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jlsimbol3ActionPerformed(evt);
            }
        });

        Jlsimbol4.setText("/");
        Jlsimbol4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jlsimbol4ActionPerformed(evt);
            }
        });

        Jlsimbol5.setText("Exit");
        Jlsimbol5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jlsimbol5ActionPerformed(evt);
            }
        });

        Angka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Jlsimbol1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jlsimbol2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jlsimbol3)
                        .addGap(14, 14, 14)
                        .addComponent(Jlsimbol4))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Angka2)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jlsimbol5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlsimbol1)
                    .addComponent(Jlsimbol2)
                    .addComponent(Jlsimbol3)
                    .addComponent(Jlsimbol4)
                    .addComponent(Jlsimbol5))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jlsimbol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jlsimbol1ActionPerformed
        double h = Double.parseDouble(Angka1.getText())+ Double.parseDouble(Angka2.getText());
        JtHasil.setText(String.valueOf(h));
        Jlsimbol1.setText("+");
        
    }//GEN-LAST:event_Jlsimbol1ActionPerformed

    private void Jlsimbol1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jlsimbol1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Jlsimbol1KeyTyped
        
    private void Jlsimbol2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jlsimbol2ActionPerformed
        double h = Double.parseDouble(Angka1.getText())- Double.parseDouble(Angka2.getText());
        JtHasil.setText(String.valueOf(h));
        Jlsimbol1.setText("-");
    }//GEN-LAST:event_Jlsimbol2ActionPerformed

    private void Jlsimbol3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jlsimbol3ActionPerformed
        double h = Double.parseDouble(Angka1.getText()) * Double.parseDouble(Angka2.getText());
        JtHasil.setText(String.valueOf(h));
        Jlsimbol1.setText("*");
    }//GEN-LAST:event_Jlsimbol3ActionPerformed

    private void Jlsimbol4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jlsimbol4ActionPerformed
        double h = Double.parseDouble(Angka1.getText())/ Double.parseDouble(Angka2.getText());
        JtHasil.setText(String.valueOf(h));
        Jlsimbol1.setText("/");
    }//GEN-LAST:event_Jlsimbol4ActionPerformed

    private void Angka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Angka1ActionPerformed

    private void Jlsimbol5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jlsimbol5ActionPerformed
    
        
    }//GEN-LAST:event_Jlsimbol5ActionPerformed

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
            java.util.logging.Logger.getLogger(GUIOperasiDuaAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIOperasiDuaAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIOperasiDuaAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIOperasiDuaAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIOperasiDuaAngka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Angka1;
    private javax.swing.JTextField Angka2;
    private javax.swing.JButton Jlsimbol1;
    private javax.swing.JButton Jlsimbol2;
    private javax.swing.JButton Jlsimbol3;
    private javax.swing.JButton Jlsimbol4;
    private javax.swing.JButton Jlsimbol5;
    private javax.swing.JTextField JtHasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
