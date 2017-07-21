/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import calculadora2grau.Calculadora2Grau;
import java.awt.Color;

/**
 *
 * @author Jefferson
 */
public class TelaCalculo extends javax.swing.JFrame {

    /**
     * Creates new form TelaCalculo
     */
    public TelaCalculo() {
        initComponents();
        jlMensagem.setVisible(false);
        jlMsgX1.setVisible(false);
        jlMsgX2.setVisible(false);
        getRootPane().setDefaultButton(jbCalcular);
        setTitle("Calculadora");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jtX2 = new javax.swing.JTextField();
        jtX = new javax.swing.JTextField();
        jtC = new javax.swing.JTextField();
        jl0 = new javax.swing.JLabel();
        jLEquacao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbCalcular = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jlMensagem = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jlMsgX1 = new javax.swing.JLabel();
        jlMsgX2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora do 2º Grau");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Aplicativo para calcular equações do 2º Grau.\nDesenvolvido por Jéfferson Soares");
        jScrollPane1.setViewportView(jTextArea1);

        jl0.setText("= 0");

        jLEquacao.setText("Equação:");

        jLabel1.setText("X² +");

        jLabel2.setText("X +");

        jbCalcular.setText("Calcular");
        jbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        jlMensagem.setText("Mensagem");

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlMsgX1.setText("Mensagem X'");

        jlMsgX2.setText("Mensagem X''");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(26, 26, 26)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 307, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 26, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(45, 45, 45)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jLEquacao)
                                .add(18, 18, 18)
                                .add(jtX2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jtX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jtC, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jl0))
                            .add(layout.createSequentialGroup()
                                .add(jbCalcular)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton1)
                                .add(10, 10, 10)
                                .add(btSair)))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jlMsgX2)
                            .add(jlMsgX1)
                            .add(jlMensagem))
                        .add(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(12, 12, 12)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jtX2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jtX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jtC, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jl0)
                    .add(jLEquacao)
                    .add(jLabel1)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jbCalcular)
                    .add(btSair)
                    .add(jButton1))
                .add(18, 18, 18)
                .add(jlMensagem, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jlMsgX1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jlMsgX2)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularActionPerformed
        // TODO add your handling code here:
        Calculadora2Grau calculadora = new Calculadora2Grau();
        Double resultado;
        Double x1;
        Double x2;
        
        if ("".equals(jtX2.getText()) || "".equals(jtX.getText()) || "".equals(jtC.getText())) {
        
            jlMensagem.setVisible(true);
            jlMensagem.setText("Todos os campos devem ser preenchidos");
            jlMensagem.setForeground(Color.red);
        
        } else {
            
            jlMensagem.setVisible(true);
            resultado = calculadora.calculaDelta(jtX2.getText(), jtX.getText(), jtC.getText());
            

            jlMensagem.setText("Delta = " + resultado);
            jlMensagem.setForeground(Color.blue);
            
            if(resultado>=0){
                
                x1 = calculadora.calculaX1(resultado.toString(), jtX2.getText(), jtX.getText());
                x2 = calculadora.calculaX2(resultado.toString(), jtX2.getText(), jtX.getText());
                
                jlMsgX1.setText("X' = " + x1.toString());
                jlMsgX2.setText("X'' = " + x2.toString());
                
                jlMsgX1.setVisible(true);
                jlMsgX2.setVisible(true);
                
                jlMsgX1.setForeground(Color.blue);
                jlMsgX2.setForeground(Color.blue);
                
            } else{
                
                jlMsgX1.setText("Delta é menor que 0, numero negativo não tem Raiz");
                jlMsgX1.setVisible(true);
                jlMsgX1.setForeground(Color.red);
                
            }
            
        }

    }//GEN-LAST:event_jbCalcularActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed

        dispose();

    }//GEN-LAST:event_btSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        jtX2.setText("");
        jtX.setText("");
        jtC.setText("");
        jlMensagem.setVisible(false);
        jlMsgX1.setVisible(false);
        jlMsgX2.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLEquacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbCalcular;
    private javax.swing.JLabel jl0;
    private javax.swing.JLabel jlMensagem;
    private javax.swing.JLabel jlMsgX1;
    private javax.swing.JLabel jlMsgX2;
    private javax.swing.JTextField jtC;
    private javax.swing.JTextField jtX;
    private javax.swing.JTextField jtX2;
    // End of variables declaration//GEN-END:variables
}
