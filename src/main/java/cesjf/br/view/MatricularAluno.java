/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesjf.br.view;

import cesjf.br.controller.AlunoController;
import cesjf.br.controller.TurmaController;
import cesjf.br.model.Turma;
import cesjf.br.util.ValidacaoException;
import java.awt.Dimension;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

public final class MatricularAluno extends javax.swing.JInternalFrame {

    private final TurmaController turmaController;
    private final AlunoController alunoController;
    
    /**
     * Creates new form CadastrarAluno
     */
    public MatricularAluno() {
        turmaController = new TurmaController();
        alunoController = new AlunoController();
        initComponents();
        limparTela();
    }

    public TurmaController getTurmaController() {
        return turmaController;
    }  

    public AlunoController getAlunoController() {
        return alunoController;
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        cbTurma = new javax.swing.JComboBox<>();
        lbMatricula = new javax.swing.JLabel();
        tfMatricula = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbAnoNascimento = new javax.swing.JLabel();
        tfAnoNascimento = new javax.swing.JFormattedTextField();
        lbPcd = new javax.swing.JLabel();
        cbPcd = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btcadastrar = new javax.swing.JButton();
        btlimpar = new javax.swing.JButton();
        btsair = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Matrícula de Aluno");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Turma", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${turmaController.turmasTabelas}");
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, cbTurma);
        bindingGroup.addBinding(jComboBoxBinding);
        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${alunoController.alunoDigitado.turma}"), cbTurma, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        cbTurma.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTurmaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbMatricula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbMatricula.setText("Matrícula:");

        tfMatricula.setEditable(false);
        tfMatricula.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${alunoController.alunoDigitado.matricula}"), tfMatricula, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lbNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNome.setText("Nome:");

        tfNome.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${alunoController.alunoDigitado.nome}"), tfNome, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lbAnoNascimento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbAnoNascimento.setText("Ano Nascimento:");

        tfAnoNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tfAnoNascimento.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${alunoController.alunoDigitado.anoNasc}"), tfAnoNascimento, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lbPcd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbPcd.setText("PCD:");

        cbPcd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        cbPcd.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${alunoController.alunoDigitado.pcd}"), cbPcd, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${alunoControl.alunoDigitado.pcd}"), cbPcd, org.jdesktop.beansbinding.BeanProperty.create("selectedIndex"));
        bindingGroup.addBinding(binding);

        btcadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btcadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesjf/br/img/user-add-icon.png"))); // NOI18N
        btcadastrar.setText("Cadastrar");
        btcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(btcadastrar);

        btlimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btlimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesjf/br/img/Refresh-icon.png"))); // NOI18N
        btlimpar.setText("Limpar");
        btlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimparActionPerformed(evt);
            }
        });
        jPanel2.add(btlimpar);

        btsair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesjf/br/img/symbol-delete-icon.png"))); // NOI18N
        btsair.setText("Sair");
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });
        jPanel2.add(btsair);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNome)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMatricula)
                            .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNome)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbAnoNascimento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbPcd)
                                    .addComponent(cbPcd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lbMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAnoNascimento)
                    .addComponent(lbPcd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTurmaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTurmaItemStateChanged
        if(cbTurma.getSelectedIndex()>=0){
            Turma turma = (Turma) cbTurma.getSelectedItem();
            if(turma.getQuantidadeAlunos() >= 40 && cbTurma.hasFocus()){
                JOptionPane.showMessageDialog(this,
                        "Turma cheia!",
                        "Turma cheia",
                        JOptionPane.WARNING_MESSAGE);
                tfNome.setEnabled(false);
                tfAnoNascimento.setEnabled(false);
                cbPcd.setEnabled(false);
            }else{
                tfNome.setEnabled(true);
                tfAnoNascimento.setEnabled(true);
                cbPcd.setEnabled(true);
                btcadastrar.setEnabled(true);
            }
        }else{
            tfNome.setEnabled(false);
            tfAnoNascimento.setEnabled(false);
            cbPcd.setEnabled(false);
        }
    }//GEN-LAST:event_cbTurmaItemStateChanged

    private void btcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcadastrarActionPerformed
        try {
            if(!tfAnoNascimento.getText().equals("")){
                alunoController.getAlunoDigitado().setAnoNasc(Integer.parseInt(tfAnoNascimento.getText()));
            }
            alunoController.getAlunoDigitado().validar();
            alunoController.salvar();            
            JOptionPane.showMessageDialog(this, 
                "Aluno salvo com sucesso",
                "Salvar aluno",
                JOptionPane.INFORMATION_MESSAGE);
            limparTela();
        } catch(ValidacaoException | RemoteException ex) {
            JOptionPane.showMessageDialog(this, 
                ex.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btcadastrarActionPerformed

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
        limparTela();
    }//GEN-LAST:event_btlimparActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btsairActionPerformed
    
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
    
    public void limparTela(){
        alunoController.novo();
        tfAnoNascimento.setText("");
        turmaController.novo();
        turmaController.pesquisar();
        cbTurma.setSelectedIndex(-1);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcadastrar;
    private javax.swing.JButton btlimpar;
    private javax.swing.JButton btsair;
    private javax.swing.JComboBox<String> cbPcd;
    private javax.swing.JComboBox<Turma> cbTurma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbAnoNascimento;
    private javax.swing.JLabel lbMatricula;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPcd;
    private javax.swing.JFormattedTextField tfAnoNascimento;
    private javax.swing.JTextField tfMatricula;
    private javax.swing.JTextField tfNome;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
