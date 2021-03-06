package estudodirigido.formularios;

import estudodirigido.Controle.AlunoControle;
import estudodirigido.Controle.AlunoDisciplinaControle;
import estudodirigido.Controle.RepositorioBase;
import estudodirigido.modelo.Aluno;
import estudodirigido.modelo.AlunoDisciplina;
import estudodirigido.modelo.Usuario;
import estudodirigido.service.AlunoService;
import estudodirigido.service.IAlunoService;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Renato
 */
public class FormHomeAluno extends javax.swing.JFrame {

    public static RepositorioBase _bd;
    public static Usuario _usuario;
    public Usuario _user;
    public Aluno _aluno;
    
    IAlunoService alunoService ;
    
 

    public FormHomeAluno(RepositorioBase bd, Usuario usuario) {

        initComponents();
        setSize(676, 494);
        setLocationRelativeTo(null);
        this._bd = bd;
        this._usuario = usuario; 
        
        AtualizarTabela();
    }

    public FormHomeAluno(Usuario user) {

        initComponents();
        setSize(676, 494);
        setLocationRelativeTo(null);
        
        this._user = user; 
        this.alunoService = new AlunoService();
        this._aluno = alunoService.get(user.getId());
        AtualizarTabela();
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
        tblHorario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        btnFaltas = new javax.swing.JButton();
        btnNotas = new javax.swing.JButton();
        lblQuadroHorario = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        lblCurso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCurso.setText("Curso:");
        getContentPane().add(lblCurso);
        lblCurso.setBounds(20, 92, 270, 14);

        lblRa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRa.setText("RA:");
        getContentPane().add(lblRa);
        lblRa.setBounds(254, 72, 160, 14);

        lblPeriodo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPeriodo.setText("Periodo:");
        getContentPane().add(lblPeriodo);
        lblPeriodo.setBounds(428, 72, 230, 14);

        tblHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"19:00 - 19:50", "DES. TÉC", "CALCULO I"},
                {"19:50 - 20:40", "DES. TÉC", "CALCULO I"},
                {"20:50 - 21:40", "DES. TÉC", "CALCULO I"},
                {"21:40 - 22:30", "DES. TÉC", "CALCULO I"}
            },
            new String [] {
                "Periodo", "Disciplina", "Faltas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHorario);
        if (tblHorario.getColumnModel().getColumnCount() > 0) {
            tblHorario.getColumnModel().getColumn(0).setResizable(false);
            tblHorario.getColumnModel().getColumn(1).setResizable(false);
            tblHorario.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(24, 124, 600, 140);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 179, 0, 0);

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNome.setText("Nome:");
        lblNome.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                lblNomeInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        getContentPane().add(lblNome);
        lblNome.setBounds(20, 72, 220, 10);

        btnFaltas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFaltas.setText("Faltas");
        btnFaltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFaltasActionPerformed(evt);
            }
        });
        getContentPane().add(btnFaltas);
        btnFaltas.setBounds(112, 290, 125, 40);

        btnNotas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNotas.setText("Notas");
        btnNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotasActionPerformed(evt);
            }
        });
        getContentPane().add(btnNotas);
        btnNotas.setBounds(390, 290, 125, 40);

        lblQuadroHorario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblQuadroHorario.setText("QUADRO DE HORÁRIO");
        getContentPane().add(lblQuadroHorario);
        lblQuadroHorario.setBounds(290, 21, 136, 15);

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(110, 370, 120, 40);

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(400, 370, 120, 40);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 680, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFaltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFaltasActionPerformed

        FormFaltaAluno formFaltaAluno = new FormFaltaAluno(_bd,_usuario);

        
        formFaltaAluno.setVisible(true);
        formFaltaAluno.setLocationRelativeTo(null);
        this.setVisible(false);


    }//GEN-LAST:event_btnFaltasActionPerformed

    void CreateTable()
    {
        DefaultTableModel model = (DefaultTableModel) tblHorario.getModel();
         model.getDataVector().removeAllElements();
         revalidate();
    }
    
    void AtualizarTabela()
    {
        
        CreateTable();
        
        lblNome.setText(this._aluno.getNome());
        
        DefaultTableModel model = (DefaultTableModel) tblHorario.getModel();
        AlunoDisciplinaControle alunoDisciplinaControle = new AlunoDisciplinaControle(_bd);
        
//        for (AlunoDisciplina ad: alunoDisciplinaControle.GetByAluno(00001)) {
//            model.addRow(new Object[]{ad.getAluno().getCurso().getPeriodo(),ad.getDisciplina().getNome(),ad.getFaltas()});
//        }
    }
    
    private void btnNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotasActionPerformed

        FormNotaAluno formNotaAluno= new FormNotaAluno(_bd,_usuario);
        formNotaAluno.setVisible(true);
        formNotaAluno.setLocationRelativeTo(null);
        this.dispose();

        
    }//GEN-LAST:event_btnNotasActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        FormInicio sair = new FormInicio();
        sair.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        FormInicio voltar = new FormInicio();      
        voltar.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void lblNomeInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_lblNomeInputMethodTextChanged
       AlunoControle alunoControle = new AlunoControle(_bd);
       
       // for (Aluno  aluno : ad) {
            
       // }
        
    }//GEN-LAST:event_lblNomeInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(FormHomeAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHomeAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHomeAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHomeAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHomeAluno(_bd,_usuario).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFaltas;
    private javax.swing.JButton btnNotas;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblQuadroHorario;
    private javax.swing.JLabel lblRa;
    private javax.swing.JTable tblHorario;
    // End of variables declaration//GEN-END:variables
}
