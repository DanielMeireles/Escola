/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesjf.br.view;

import cesjf.br.controller.TurmaController;
import cesjf.br.enums.EnsinoEnum;
import cesjf.br.util.ValidacaoException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javassist.tools.rmi.RemoteException;
import javax.swing.JOptionPane;

public class CadastrarTurma extends javax.swing.JInternalFrame {
    
    private final TurmaController turmaController;  
    
    //Criação de uma nova data apenas para capturar o ano atual
    
    /**
     * Creates new form CadastrarTurma
     */
    public CadastrarTurma() {
        turmaController = new TurmaController();        
        initComponents();        
        cbEnsino.setModel(new javax.swing.DefaultComboBoxModel(EnsinoEnum.enumsToStringArray()));
        cbEnsino.setSelectedIndex(-1);
        tfAno.setText(Integer.toString(Calendar.getInstance().get(Calendar.YEAR)));
    } 

    public TurmaController getTurmaController() {
        return turmaController;
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

        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbensino = new javax.swing.JLabel();
        cbEnsino = new javax.swing.JComboBox<>();
        tfAno = new javax.swing.JTextField();
        lbAno = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btcadastrar = new javax.swing.JButton();
        btlimpar = new javax.swing.JButton();
        btsair = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Turma");

        lbNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNome.setText("Nome:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${turmaController.turmaDigitada.nome}"), tfNome, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lbensino.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbensino.setText("Ensino:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${turmaController.turmaDigitada.ensino}"), cbEnsino, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${turmaController.turmaDigitada.ano}"), tfAno, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lbAno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbAno.setText("Ano:");

        btcadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btcadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesjf/br/img/Science-Classroom-icon.png"))); // NOI18N
        btcadastrar.setText("Cadastrar");
        btcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btcadastrar);

        btlimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btlimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesjf/br/img/Refresh-icon.png"))); // NOI18N
        btlimpar.setText("Limpar");
        btlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimparActionPerformed(evt);
            }
        });
        jPanel1.add(btlimpar);

        btsair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesjf/br/img/symbol-delete-icon.png"))); // NOI18N
        btsair.setText("Sair");
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });
        jPanel1.add(btsair);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tfNome)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAno)
                            .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbensino)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbEnsino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbAno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbensino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEnsino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcadastrarActionPerformed
        try {
            turmaController.salvar();            
            JOptionPane.showMessageDialog(this, 
                "Turma salva com sucesso",
                "Salvar cliente",
                JOptionPane.INFORMATION_MESSAGE);
            btlimparActionPerformed(evt);
        } catch(ValidacaoException ex) {
            JOptionPane.showMessageDialog(this, 
                ex.getMessage(),
                "Falha de Validação",
                JOptionPane.WARNING_MESSAGE);              
        } catch(RemoteException e ){
            JOptionPane.showMessageDialog(this,
                    "Erro "+e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } catch (java.rmi.RemoteException ex) {
            Logger.getLogger(CadastrarTurma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btcadastrarActionPerformed

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
        turmaController.novo();
        tfNome.setText("");
        tfAno.setText(Integer.toString(Calendar.getInstance().get(Calendar.YEAR)));
        cbEnsino.setSelectedIndex(-1);
        tfNome.requestFocus();
    }//GEN-LAST:event_btlimparActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(opcao == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_btsairActionPerformed

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcadastrar;
    private javax.swing.JButton btlimpar;
    private javax.swing.JButton btsair;
    private javax.swing.JComboBox<String> cbEnsino;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAno;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbensino;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfNome;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
