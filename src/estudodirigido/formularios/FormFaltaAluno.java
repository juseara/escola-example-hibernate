/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.formularios;

import estudodirigido.Controle.RepositorioBase;
import estudodirigido.modelo.Usuario;
import java.time.Period;
import javax.swing.JOptionPane;

/**
 *
 * @author Renato
 */
public class FormFaltaAluno extends javax.swing.JFrame {

    
    public static RepositorioBase _bd;
    public static Usuario _usuario;
    
    
    public FormFaltaAluno(RepositorioBase bd,Usuario usuario) {
        
        initComponents();
        this.setSize(673, 414);
        _bd=bd;
        _usuario = usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCurso = new javax.swing.JLabel();
        lblRa = new javax.swing.JLabel();
        lblPeriodo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisciplina = new javax.swing.JTable();
        lblNome = new javax.swing.JLabel();
        lblFaltas = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        lblCurso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCurso.setText("Curso:");
        getContentPane().add(lblCurso);
        lblCurso.setBounds(47, 91, 300, 14);

        lblRa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRa.setText("RA:");
        getContentPane().add(lblRa);
        lblRa.setBounds(308, 64, 61, 14);

        lblPeriodo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPeriodo.setText("Periodo:");
        getContentPane().add(lblPeriodo);
        lblPeriodo.setBounds(460, 64, 203, 14);

        tblDisciplina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ECNTII", "101", "DES. TÉC", "CURS", "0"},
                {"ECNTII", "107", "CALCULO I", "CURS", "0"},
                {"ECNTVII", "200", "POO", "CURS", "0"},
                {"ECNTVII", "295", "BD", "CURS", "0"}
            },
            new String [] {
                "TURMA", "DISCIPLINA ", "NOME", "SITUAÇÃO", "FALTAS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDisciplina);
        if (tblDisciplina.getColumnModel().getColumnCount() > 0) {
            tblDisciplina.getColumnModel().getColumn(0).setResizable(false);
            tblDisciplina.getColumnModel().getColumn(1).setResizable(false);
            tblDisciplina.getColumnModel().getColumn(2).setResizable(false);
            tblDisciplina.getColumnModel().getColumn(3).setResizable(false);
            tblDisciplina.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(47, 116, 547, 124);

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNome.setText("Nome:");
        getContentPane().add(lblNome);
        lblNome.setBounds(47, 64, 218, 14);

        lblFaltas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFaltas.setText("FALTAS");
        getContentPane().add(lblFaltas);
        lblFaltas.setBounds(294, 11, 46, 15);

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(511, 346, 135, 32);

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(34, 346, 135, 32);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Renato\\Desktop\\2.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 680, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        FormInicio sair= new FormInicio();
        sair.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        FormHomeAluno voltar =new FormHomeAluno(_bd,_usuario);
            
        
        
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
            java.util.logging.Logger.getLogger(FormFaltaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFaltaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFaltaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFaltaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFaltaAluno(_bd,_usuario).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblFaltas;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblRa;
    private javax.swing.JTable tblDisciplina;
    // End of variables declaration//GEN-END:variables
}
