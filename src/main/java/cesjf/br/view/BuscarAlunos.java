/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesjf.br.view;

import cesjf.br.controller.TurmaController;
import cesjf.br.model.Aluno;
import cesjf.br.model.Turma;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis
 */
public class BuscarAlunos extends javax.swing.JInternalFrame {

    private final TurmaController turmaController;
    
    public TurmaController getTurmaController() {
        return turmaController;
    }
    
    public BuscarAlunos() {
        turmaController = new TurmaController();
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        lbturma = new javax.swing.JLabel();
        tfturma = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbalunos = new javax.swing.JTable();
        btsair = new javax.swing.JButton();
        btbuscar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Buscar Alunos");

        lbturma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbturma.setText("Turma:");

        tbalunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbalunos.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${turmaController.alunosTurmaSelecionada}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, tbalunos);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${matricula}"));
        columnBinding.setColumnName("Matricula");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${anoNasc}"));
        columnBinding.setColumnName("Ano Nasc");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pcd}"));
        columnBinding.setColumnName("Pcd");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tbalunos);

        btsair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesjf/br/img/symbol-delete-icon.png"))); // NOI18N
        btsair.setText("Sair");
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });

        btbuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cesjf/br/img/Zoom-icon.png"))); // NOI18N
        btbuscar.setText("Buscar");
        btbuscar.setMaximumSize(new java.awt.Dimension(125, 41));
        btbuscar.setPreferredSize(new java.awt.Dimension(125, 41));
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbturma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfturma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btsair, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbturma)
                    .addComponent(tfturma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btsair)
                .addGap(19, 19, 19))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
        try{
            turmaController.pesquisarAlunos();
            DefaultTableModel tabela = (DefaultTableModel) tbalunos.getModel();
            tabela.setNumRows(0);
            turmaController.pesquisar();
            List<Turma> turmas = turmaController.getTurmasTabelas();
            for(Turma t : turmas){
                if(t.getNome().toLowerCase().equals(tfturma.getText().toLowerCase())){
                    ordenar(t);
                    for(Aluno a : t.getAlunos()){
                        tabela.addRow(new Object[]{
                            a.getNome()
                        });
                    } 
                }
            }
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Turma não encontrada!", "Informação de Turma", JOptionPane.INFORMATION_MESSAGE);
            turmaController.novo();
        }
    }//GEN-LAST:event_btbuscarActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(opcao == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_btsairActionPerformed

    private void ordenar(Turma t) {
        Collections.sort(t.getAlunos(), new Comparator<Aluno>(){
            @Override
            public int compare(Aluno a1, Aluno a2){
                return a1.getNome().compareTo(a2.getNome());
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton btsair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbturma;
    private javax.swing.JTable tbalunos;
    private javax.swing.JTextField tfturma;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
