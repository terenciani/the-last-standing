/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifpr.thelaststanding;

import br.edu.ifpr.thelaststanding.cadastro.CadastroGuerreiro;
import br.edu.ifpr.thelaststanding.cadastro.CadastroMistico;

/**
 *
 * @author Aluno
 */
public class TelaAbertura extends javax.swing.JFrame {

    /**
     * Creates new form TelaAbertura
     */
    public TelaAbertura() {
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

        btnCadastrarGuerreiro = new javax.swing.JButton();
        btnCadastrarMistico = new javax.swing.JButton();
        btnCadastrarItem = new javax.swing.JButton();
        btnBatalhar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCadastrarGuerreiro.setText("Cadastrar Guerreiro");
        btnCadastrarGuerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarGuerreiroActionPerformed(evt);
            }
        });

        btnCadastrarMistico.setText("Cadastrar Místico");
        btnCadastrarMistico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarMisticoActionPerformed(evt);
            }
        });

        btnCadastrarItem.setText("Cadastrar Itens");

        btnBatalhar.setText("Batalhar");
        btnBatalhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBatalhar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrarGuerreiro)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCadastrarMistico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarGuerreiro)
                    .addComponent(btnCadastrarMistico))
                .addGap(26, 26, 26)
                .addComponent(btnCadastrarItem)
                .addGap(42, 42, 42)
                .addComponent(btnBatalhar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarMisticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarMisticoActionPerformed
        CadastroMistico cadastroMistico = new CadastroMistico();
        cadastroMistico.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCadastrarMisticoActionPerformed

    private void btnBatalharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBatalharActionPerformed

    private void btnCadastrarGuerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarGuerreiroActionPerformed
        CadastroGuerreiro cadastroGuerreiro = new CadastroGuerreiro();
        cadastroGuerreiro.setVisible(true);
        this.setVisible(false);
        //this.dispose(); libera a memória
    }//GEN-LAST:event_btnCadastrarGuerreiroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAbertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAbertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAbertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAbertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAbertura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatalhar;
    private javax.swing.JButton btnCadastrarGuerreiro;
    private javax.swing.JButton btnCadastrarItem;
    private javax.swing.JButton btnCadastrarMistico;
    // End of variables declaration//GEN-END:variables
}
