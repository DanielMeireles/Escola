/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesjf.br.controller;

import cesjf.br.dao.AlunoDAO;
import cesjf.br.dao.TurmaDAO;
import cesjf.br.model.Aluno;
import cesjf.br.model.Turma;
import cesjf.br.util.ValidacaoException;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;

public class AlunoController {
    
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);  
    private Aluno alunoDigitado;
    private Aluno alunoSelecionado;
    private List<Aluno> alunosTabela;
    private final AlunoDAO alunoDAO;
    private final TurmaDAO turmaDAO;

    public AlunoController() {
        alunoDAO = new AlunoDAO();
        turmaDAO = new TurmaDAO();
        alunosTabela = ObservableCollections.observableList(new ArrayList<>());
        novo();
        pesquisar();
    }

    public Aluno getAlunoDigitado() {
        return alunoDigitado;
    }

    public void setAlunoDigitado(Aluno alunoDigitado) {
        Aluno oldAlunoDigitado = this.alunoDigitado;
        this.alunoDigitado = alunoDigitado;
        propertyChangeSupport.firePropertyChange("alunoDigitado", oldAlunoDigitado, alunoDigitado);
    }

    public Aluno getAlunoSelecionado() {
        return alunoSelecionado;
    }

    public void setAlunoSelecionado(Aluno alunoSelecionado) {
        if(this.alunoSelecionado != null){
            setAlunoDigitado(alunoSelecionado);
        }
        this.alunoSelecionado = alunoSelecionado;
    }

    public List<Aluno> getAlunosTabelas() {
        return alunosTabela;
    }

    public void setAlunosTabelas(List<Aluno> alunosTabelas) {
        this.alunosTabela = alunosTabelas;
    }    
    
    public void salvar() throws ValidacaoException, RemoteException{
        alunoDigitado.validar();
        alunoDAO.salvarAtualizar(alunoDigitado);
        alunoDigitado.getTurma().setQuantidadeAlunos();
        turmaDAO.salvarAtualizar(alunoDigitado.getTurma());
        //novo();
        pesquisar();
    }
    
    public void atualizar(Turma turmaOld) throws ValidacaoException, RemoteException{
        alunoDigitado.validar();
        
        if(getAlunoDigitado().getTurma() != turmaOld){            
            turmaOld.getAlunos().remove(alunoDigitado);
            turmaOld.setQuantidadeAlunos();
            turmaDAO.salvarAtualizar(turmaOld);            
        } 
        salvar();
    }
    
    public void excluir(){
        Turma turma = alunoDigitado.getTurma();
        alunoDAO.excluir(alunoDigitado);
        turma.setQuantidadeAlunos();
        turmaDAO.salvarAtualizar(turma);
        novo();
        pesquisar();
    }
    
    public final void novo(){
        setAlunoDigitado(new Aluno());
    }
    
    public final void pesquisar(){
        alunosTabela.clear();
        alunosTabela.addAll(alunoDAO.pesquisar(alunoDigitado));
    }
    
    public void pesquisarAluno(){
        setAlunoDigitado(alunoDAO.pesquisarAluno(alunoDigitado));
    }
    
    public void addPropertyChangeListener(PropertyChangeListener e){
        propertyChangeSupport.addPropertyChangeListener(e);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener e){
        propertyChangeSupport.removePropertyChangeListener(e);
    }
}
