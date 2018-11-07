/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesjf.br.view;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.HyperlinkEvent;

public class Ajuda extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ajuda
     */
    public Ajuda() {
        initComponents();
        inicio();
    }

    private void inicio(){
        tpVisualizar.setContentType("text/html");        
        File arq = new File("src\\main\\resources\\cesjf\\br\\HTML\\Ajuda.html");       
        if(arq != null){            
            try {
                tpVisualizar.setPage(arq.toURI().toURL());
            } catch (IOException ex) {
                Logger.getLogger(Ajuda.class.getName()).log(Level.SEVERE, null, ex);
            }      
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        treeAjuda = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpVisualizar = new javax.swing.JTextPane();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ajuda");

        treeAjuda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Ajuda");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Usuário");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cadastrar Usuário");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Alterar Senha");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Cadastro");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cadastrar Turma");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Matricular Aluno");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Busca");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Buscar Turmas");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Buscar Alunos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Buscar Aluno");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Sobre");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Sobre");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeAjuda.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        treeAjuda.setRootVisible(false);
        treeAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treeAjudaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(treeAjuda);

        tpVisualizar.setEditable(false);
        tpVisualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tpVisualizar.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
                tpVisualizarHyperlinkUpdate(evt);
            }
        });
        jScrollPane2.setViewportView(tpVisualizar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void treeAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treeAjudaMouseClicked
        String menu = null;
        try{
            menu = treeAjuda.getLastSelectedPathComponent().toString();
            tpVisualizar.setContentType("text/html");
        }catch (java.lang.NullPointerException exception){

        }
        File arq;
        if(menu != null){
            arq = new File("src\\main\\resources\\cesjf\\br\\HTML\\"+ menu +".html");
                try {
                    tpVisualizar.setPage(arq.toURI().toURL());
                } catch (IOException ex) {
                    Logger.getLogger(Ajuda.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_treeAjudaMouseClicked

    private void tpVisualizarHyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {//GEN-FIRST:event_tpVisualizarHyperlinkUpdate
        if (evt.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
            try {
                tpVisualizar.setPage(evt.getURL());
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }//GEN-LAST:event_tpVisualizarHyperlinkUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane tpVisualizar;
    private javax.swing.JTree treeAjuda;
    // End of variables declaration//GEN-END:variables
}
