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
public class FormCadastro extends javax.swing.JFrame {

    /**
     * Creates new form FormCadastro
     * 
     */
    
    public Usuario  user;
    
    public static RepositorioBase _bd;
    
    public FormCadastro(RepositorioBase bd) {
        initComponents();
        this.setSize(435, 183);
        this._bd=bd;
        
    }
    
    
    public FormCadastro(Usuario user) {
        initComponents();
        this.setSize(435, 183);
        this.user=user;
        
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
        jList1 = new javax.swing.JList<>();
        btnCadastrarProfessor = new javax.swing.JButton();
        btnCadastrarCurso = new javax.swing.JButton();
        btnCadastrarAluno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(558, 356));
        getContentPane().setLayout(null);

        btnCadastrarProfessor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCadastrarProfessor.setText("Cadastrar Professor ");
        btnCadastrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarProfessor);
        btnCadastrarProfessor.setBounds(124, 73, 181, 23);

        btnCadastrarCurso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCadastrarCurso.setText("Cadastrar Curso");
        btnCadastrarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarCursoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarCurso);
        btnCadastrarCurso.setBounds(124, 114, 181, 23);

        btnCadastrarAluno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCadastrarAluno.setText("Cadastrar Aluno");
        btnCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarAluno);
        btnCadastrarAluno.setBounds(124, 32, 181, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Renato\\Desktop\\2.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 440, 190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProfessorActionPerformed
       
        FormCadastroProfessor cadastroProf =new FormCadastroProfessor(_bd);
        cadastroProf.setVisible(true);
        cadastroProf.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btnCadastrarProfessorActionPerformed

    private void btnCadastrarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarCursoActionPerformed
        FormCadastroCurso cadastrarCurso= new FormCadastroCurso(_bd);
        cadastrarCurso.setVisible(true);
        cadastrarCurso.setLocationRelativeTo(null);
        this.dispose();
        
      
    }//GEN-LAST:event_btnCadastrarCursoActionPerformed

    private void btnCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAlunoActionPerformed
        
        FormCadastroAluno cadastrarAluno=new FormCadastroAluno(_bd);
        cadastrarAluno.setVisible(true);
        cadastrarAluno.setLocationRelativeTo(null);
        
        this.dispose();
       
    }//GEN-LAST:event_btnCadastrarAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastro(_bd).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarAluno;
    private javax.swing.JButton btnCadastrarCurso;
    private javax.swing.JButton btnCadastrarProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
