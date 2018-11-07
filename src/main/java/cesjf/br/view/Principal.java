/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesjf.br.view;

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal2
     */
    public Principal() {
        initComponents();
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        mniSair = new javax.swing.JMenu();
        mniCadastrarTurma = new javax.swing.JMenuItem();
        mniMatricularAluno = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();
        mnBusca = new javax.swing.JMenu();
        mniTurmasPcd = new javax.swing.JMenuItem();
        mmiBuscarAlunos = new javax.swing.JMenuItem();
        mniBuscarAluno = new javax.swing.JMenuItem();
        mnSobre = new javax.swing.JMenu();
        mniAjuda = new javax.swing.JMenuItem();
        mniSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gerenciamento Escolar");
        setName("Principal"); // NOI18N

        mniSair.setMnemonic('C');
        mniSair.setText("Cadastro");
        mniSair.setToolTipText("");

        mniCadastrarTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesjf/br/img/Science-Classroom-icon.png"))); // NOI18N
        mniCadastrarTurma.setMnemonic('C');
        mniCadastrarTurma.setText("Cadastrar Turma");
        mniCadastrarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadastrarTurmaActionPerformed(evt);
            }
        });
        mniSair.add(mniCadastrarTurma);

        mniMatricularAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesjf/br/img/user-add-icon.png"))); // NOI18N
        mniMatricularAluno.setMnemonic('M');
        mniMatricularAluno.setText("Matricular Aluno");
        mniMatricularAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniMatricularAlunoActionPerformed(evt);
            }
        });
        mniSair.add(mniMatricularAluno);

        jMenuItem1.setText("Cadastrar Usuário");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mniSair.add(jMenuItem1);
        mniSair.add(jSeparator1);

        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesjf/br/img/symbol-delete-icon.png"))); // NOI18N
        exitMenuItem.setMnemonic('S');
        exitMenuItem.setText("Sair");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        mniSair.add(exitMenuItem);

        menuBar.add(mniSair);

        mnBusca.setMnemonic('B');
        mnBusca.setText("Busca");

        mniTurmasPcd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesjf/br/img/Science-Classroom2-icon.png"))); // NOI18N
        mniTurmasPcd.setMnemonic('T');
        mniTurmasPcd.setText("Buscar Turmas");
        mniTurmasPcd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTurmasPcdActionPerformed(evt);
            }
        });
        mnBusca.add(mniTurmasPcd);

        mmiBuscarAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesjf/br/img/Students-icon.png"))); // NOI18N
        mmiBuscarAlunos.setText("Buscar Alunos");
        mmiBuscarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmiBuscarAlunosActionPerformed(evt);
            }
        });
        mnBusca.add(mmiBuscarAlunos);

        mniBuscarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesjf/br/img/Student-Male-icon.png"))); // NOI18N
        mniBuscarAluno.setMnemonic('A');
        mniBuscarAluno.setText("Buscar Aluno");
        mniBuscarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBuscarAlunoActionPerformed(evt);
            }
        });
        mnBusca.add(mniBuscarAluno);

        menuBar.add(mnBusca);

        mnSobre.setMnemonic('S');
        mnSobre.setText("Sobre");

        mniAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesjf/br/img/sign-question-icon.png"))); // NOI18N
        mniAjuda.setMnemonic('u');
        mniAjuda.setText("Ajuda");
        mniAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAjudaActionPerformed(evt);
            }
        });
        mnSobre.add(mniAjuda);

        mniSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesjf/br/img/sign-info-icon.png"))); // NOI18N
        mniSobre.setMnemonic('o');
        mniSobre.setText("Sobre");
        mniSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSobreActionPerformed(evt);
            }
        });
        mnSobre.add(mniSobre);

        menuBar.add(mnSobre);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(opcao == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void mniCadastrarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadastrarTurmaActionPerformed
        CadastrarTurma cadastrarTurma = new CadastrarTurma();
        this.desktopPane.add(cadastrarTurma);
        cadastrarTurma.setVisible(true);
    }//GEN-LAST:event_mniCadastrarTurmaActionPerformed

    private void mniMatricularAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniMatricularAlunoActionPerformed
        MatricularAluno matricularAluno = new MatricularAluno();
        this.desktopPane.add(matricularAluno);
        matricularAluno.setVisible(true);
    }//GEN-LAST:event_mniMatricularAlunoActionPerformed

    private void mniBuscarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBuscarAlunoActionPerformed
        BuscarAluno buscarAluno = new BuscarAluno();
        this.desktopPane.add(buscarAluno);
        buscarAluno.setVisible(true);
    }//GEN-LAST:event_mniBuscarAlunoActionPerformed

    private void mniTurmasPcdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTurmasPcdActionPerformed
        BuscarTurmas buscarTurmas = new BuscarTurmas();
        this.desktopPane.add(buscarTurmas);
        buscarTurmas.setVisible(true);
    }//GEN-LAST:event_mniTurmasPcdActionPerformed

    private void mmiBuscarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmiBuscarAlunosActionPerformed
        BuscarAlunos buscarAlunos = new BuscarAlunos();
        this.desktopPane.add(buscarAlunos);
        buscarAlunos.setVisible(true);
    }//GEN-LAST:event_mmiBuscarAlunosActionPerformed

    private void mniAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAjudaActionPerformed
        Ajuda ajuda = new Ajuda();
        this.desktopPane.add(ajuda);
        ajuda.setVisible(true);
    }//GEN-LAST:event_mniAjudaActionPerformed

    private void mniSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSobreActionPerformed
        Sobre sobre = new Sobre();
        this.desktopPane.add(sobre);
        sobre.setVisible(true);
    }//GEN-LAST:event_mniSobreActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadastrarUsuario cadastrarUsuario = new CadastrarUsuario();
        this.desktopPane.add(cadastrarUsuario);
        cadastrarUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mmiBuscarAlunos;
    private javax.swing.JMenu mnBusca;
    private javax.swing.JMenu mnSobre;
    private javax.swing.JMenuItem mniAjuda;
    private javax.swing.JMenuItem mniBuscarAluno;
    private javax.swing.JMenuItem mniCadastrarTurma;
    private javax.swing.JMenuItem mniMatricularAluno;
    private javax.swing.JMenu mniSair;
    private javax.swing.JMenuItem mniSobre;
    private javax.swing.JMenuItem mniTurmasPcd;
    // End of variables declaration//GEN-END:variables

}
