/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.formularios;

import estudodirigido.Controle.RepositorioBase;
import estudodirigido.modelo.Usuario;

/**
 *
 * @author Renato
 */
public class FormFaltas extends javax.swing.JFrame {

    public static RepositorioBase _bd;
    public static Usuario _usuario;
   
    public FormFaltas() {
        initComponents();
        this.setSize(650, 377);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblTurma = new javax.swing.JLabel();
        lblAlunoAluno5 = new javax.swing.JLabel();
        lblAlunoAluno4 = new javax.swing.JLabel();
        lblAlunoAluno1 = new javax.swing.JLabel();
        lblAlunoAluno2 = new javax.swing.JLabel();
        lblAlunoAluno3 = new javax.swing.JLabel();
        lblAula1 = new javax.swing.JLabel();
        lblAula2 = new javax.swing.JLabel();
        lblAula3 = new javax.swing.JLabel();
        lblAula4 = new javax.swing.JLabel();
        ckbAula1Aluno1 = new javax.swing.JCheckBox();
        ckbAula2Aluno1 = new javax.swing.JCheckBox();
        ckbAula3Aluno1 = new javax.swing.JCheckBox();
        ckbAula4Aluno1 = new javax.swing.JCheckBox();
        ckbAula1Aluno2 = new javax.swing.JCheckBox();
        ckbAula2Aluno2 = new javax.swing.JCheckBox();
        ckbAula3Aluno2 = new javax.swing.JCheckBox();
        ckbAula4Aluno2 = new javax.swing.JCheckBox();
        cbkAula1Aluno3 = new javax.swing.JCheckBox();
        cbkAula2Aluno3 = new javax.swing.JCheckBox();
        cbkAula3Aluno3 = new javax.swing.JCheckBox();
        cbkAula4Aluno3 = new javax.swing.JCheckBox();
        cbkAula1Aluno4 = new javax.swing.JCheckBox();
        cbkAula2Aluno4 = new javax.swing.JCheckBox();
        cbkAula3Aluno4 = new javax.swing.JCheckBox();
        cbkAula4Aluno4 = new javax.swing.JCheckBox();
        cbkAula1Aluno5 = new javax.swing.JCheckBox();
        cbkAula2Aluno5 = new javax.swing.JCheckBox();
        cbkAula3Aluno5 = new javax.swing.JCheckBox();
        cbkAula4Aluno5 = new javax.swing.JCheckBox();
        lblTotalFalta = new javax.swing.JLabel();
        lblTotalFaltaAluno1 = new javax.swing.JLabel();
        lblTotalFaltaAluno2 = new javax.swing.JLabel();
        lblTotalFaltaAluno3 = new javax.swing.JLabel();
        lblTotalFaltaAluno4 = new javax.swing.JLabel();
        lblTotalFaltaAluno5 = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        lblDisciplina = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setAutoRequestFocus(false);
        getContentPane().setLayout(null);

        lblTurma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTurma.setText("Turma:");
        getContentPane().add(lblTurma);
        lblTurma.setBounds(25, 11, 180, 14);

        lblAlunoAluno5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAlunoAluno5.setText("Renato Cardozo ");
        getContentPane().add(lblAlunoAluno5);
        lblAlunoAluno5.setBounds(25, 240, 106, 14);

        lblAlunoAluno4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAlunoAluno4.setText("Maiara Mendes   ");
        getContentPane().add(lblAlunoAluno4);
        lblAlunoAluno4.setBounds(25, 201, 106, 14);

        lblAlunoAluno1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAlunoAluno1.setText("Bruno Gabriel      ");
        getContentPane().add(lblAlunoAluno1);
        lblAlunoAluno1.setBounds(25, 91, 106, 14);

        lblAlunoAluno2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAlunoAluno2.setText("Guilherme Basilio ");
        getContentPane().add(lblAlunoAluno2);
        lblAlunoAluno2.setBounds(25, 123, 106, 14);

        lblAlunoAluno3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAlunoAluno3.setText("Nicholas Batista   ");
        getContentPane().add(lblAlunoAluno3);
        lblAlunoAluno3.setBounds(25, 162, 106, 14);

        lblAula1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAula1.setText("AULA 1");
        getContentPane().add(lblAula1);
        lblAula1.setBounds(173, 41, 47, 14);

        lblAula2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAula2.setText("AULA 2");
        getContentPane().add(lblAula2);
        lblAula2.setBounds(250, 41, 45, 14);

        lblAula3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAula3.setText("AULA 3");
        getContentPane().add(lblAula3);
        lblAula3.setBounds(327, 41, 49, 14);

        lblAula4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAula4.setText("AULA 4");
        getContentPane().add(lblAula4);
        lblAula4.setBounds(403, 41, 63, 14);
        getContentPane().add(ckbAula1Aluno1);
        ckbAula1Aluno1.setBounds(173, 84, 35, 21);

        ckbAula2Aluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbAula2Aluno1ActionPerformed(evt);
            }
        });
        getContentPane().add(ckbAula2Aluno1);
        ckbAula2Aluno1.setBounds(250, 84, 35, 21);
        getContentPane().add(ckbAula3Aluno1);
        ckbAula3Aluno1.setBounds(327, 84, 37, 21);
        getContentPane().add(ckbAula4Aluno1);
        ckbAula4Aluno1.setBounds(403, 84, 39, 21);
        getContentPane().add(ckbAula1Aluno2);
        ckbAula1Aluno2.setBounds(173, 123, 21, 21);
        getContentPane().add(ckbAula2Aluno2);
        ckbAula2Aluno2.setBounds(250, 123, 21, 21);
        getContentPane().add(ckbAula3Aluno2);
        ckbAula3Aluno2.setBounds(327, 123, 21, 21);
        getContentPane().add(ckbAula4Aluno2);
        ckbAula4Aluno2.setBounds(403, 123, 21, 21);
        getContentPane().add(cbkAula1Aluno3);
        cbkAula1Aluno3.setBounds(173, 162, 21, 21);
        getContentPane().add(cbkAula2Aluno3);
        cbkAula2Aluno3.setBounds(250, 162, 21, 21);
        getContentPane().add(cbkAula3Aluno3);
        cbkAula3Aluno3.setBounds(327, 162, 21, 21);
        getContentPane().add(cbkAula4Aluno3);
        cbkAula4Aluno3.setBounds(403, 162, 21, 21);
        getContentPane().add(cbkAula1Aluno4);
        cbkAula1Aluno4.setBounds(173, 201, 21, 21);
        getContentPane().add(cbkAula2Aluno4);
        cbkAula2Aluno4.setBounds(250, 201, 21, 21);
        getContentPane().add(cbkAula3Aluno4);
        cbkAula3Aluno4.setBounds(327, 201, 21, 21);
        getContentPane().add(cbkAula4Aluno4);
        cbkAula4Aluno4.setBounds(403, 201, 21, 21);
        getContentPane().add(cbkAula1Aluno5);
        cbkAula1Aluno5.setBounds(173, 240, 21, 21);
        getContentPane().add(cbkAula2Aluno5);
        cbkAula2Aluno5.setBounds(250, 240, 21, 21);
        getContentPane().add(cbkAula3Aluno5);
        cbkAula3Aluno5.setBounds(327, 240, 21, 21);
        getContentPane().add(cbkAula4Aluno5);
        cbkAula4Aluno5.setBounds(403, 240, 21, 21);

        lblTotalFalta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTotalFalta.setText("TOTAL");
        getContentPane().add(lblTotalFalta);
        lblTotalFalta.setBounds(484, 41, 71, 14);

        lblTotalFaltaAluno1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTotalFaltaAluno1.setText("0");
        getContentPane().add(lblTotalFaltaAluno1);
        lblTotalFaltaAluno1.setBounds(484, 84, 39, 14);

        lblTotalFaltaAluno2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTotalFaltaAluno2.setText("0");
        getContentPane().add(lblTotalFaltaAluno2);
        lblTotalFaltaAluno2.setBounds(484, 130, 39, 14);

        lblTotalFaltaAluno3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTotalFaltaAluno3.setText("0");
        getContentPane().add(lblTotalFaltaAluno3);
        lblTotalFaltaAluno3.setBounds(484, 162, 39, 14);

        lblTotalFaltaAluno4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTotalFaltaAluno4.setText("0");
        getContentPane().add(lblTotalFaltaAluno4);
        lblTotalFaltaAluno4.setBounds(484, 201, 39, 14);

        lblTotalFaltaAluno5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTotalFaltaAluno5.setText("0");
        getContentPane().add(lblTotalFaltaAluno5);
        lblTotalFaltaAluno5.setBounds(484, 247, 39, 14);

        btnGravar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGravar);
        btnGravar.setBounds(420, 311, 135, 23);

        lblDisciplina.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDisciplina.setText("Disciplina:");
        getContentPane().add(lblDisciplina);
        lblDisciplina.setBounds(380, 11, 216, 14);

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(42, 311, 135, 23);

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(241, 311, 135, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Renato\\Desktop\\2.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(650, 377));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 650, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ckbAula2Aluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbAula2Aluno1ActionPerformed
      
    }//GEN-LAST:event_ckbAula2Aluno1ActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
       
        
     
     
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        FormInicio sair= new FormInicio();
        sair.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        FormHomeProfessor voltar= new FormHomeProfessor(_bd,_usuario);
        
                
        voltar.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(FormFaltas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFaltas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFaltas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFaltas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFaltas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox cbkAula1Aluno3;
    private javax.swing.JCheckBox cbkAula1Aluno4;
    private javax.swing.JCheckBox cbkAula1Aluno5;
    private javax.swing.JCheckBox cbkAula2Aluno3;
    private javax.swing.JCheckBox cbkAula2Aluno4;
    private javax.swing.JCheckBox cbkAula2Aluno5;
    private javax.swing.JCheckBox cbkAula3Aluno3;
    private javax.swing.JCheckBox cbkAula3Aluno4;
    private javax.swing.JCheckBox cbkAula3Aluno5;
    private javax.swing.JCheckBox cbkAula4Aluno3;
    private javax.swing.JCheckBox cbkAula4Aluno4;
    private javax.swing.JCheckBox cbkAula4Aluno5;
    private javax.swing.JCheckBox ckbAula1Aluno1;
    private javax.swing.JCheckBox ckbAula1Aluno2;
    private javax.swing.JCheckBox ckbAula2Aluno1;
    private javax.swing.JCheckBox ckbAula2Aluno2;
    private javax.swing.JCheckBox ckbAula3Aluno1;
    private javax.swing.JCheckBox ckbAula3Aluno2;
    private javax.swing.JCheckBox ckbAula4Aluno1;
    private javax.swing.JCheckBox ckbAula4Aluno2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAlunoAluno1;
    private javax.swing.JLabel lblAlunoAluno2;
    private javax.swing.JLabel lblAlunoAluno3;
    private javax.swing.JLabel lblAlunoAluno4;
    private javax.swing.JLabel lblAlunoAluno5;
    private javax.swing.JLabel lblAula1;
    private javax.swing.JLabel lblAula2;
    private javax.swing.JLabel lblAula3;
    private javax.swing.JLabel lblAula4;
    private javax.swing.JLabel lblDisciplina;
    private javax.swing.JLabel lblTotalFalta;
    private javax.swing.JLabel lblTotalFaltaAluno1;
    private javax.swing.JLabel lblTotalFaltaAluno2;
    private javax.swing.JLabel lblTotalFaltaAluno3;
    private javax.swing.JLabel lblTotalFaltaAluno4;
    private javax.swing.JLabel lblTotalFaltaAluno5;
    private javax.swing.JLabel lblTurma;
    // End of variables declaration//GEN-END:variables
}
