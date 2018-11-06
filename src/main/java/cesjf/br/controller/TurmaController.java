/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesjf.br.controller;

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

public class TurmaController {
    
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);  
    private Turma turmaDigitada;
    private Turma turmaSelecionada;
    private List<Turma> turmasTabelas;
    private final TurmaDAO turmaDAO;
    private List<Aluno> alunosTurmaSelecionada;

    public TurmaController() {
        turmaDAO = new TurmaDAO();
        turmasTabelas = ObservableCollections.observableList(new ArrayList<Turma>());
        alunosTurmaSelecionada = ObservableCollections.observableList(new ArrayList<Aluno>());
        novo();
        pesquisar();
    }

    public Turma getTurmaDigitada() {
        return turmaDigitada;
    }

    public void setTurmaDigitada(Turma turmaDigitada) {
        Turma oldTurmaDigitada = this.turmaDigitada;
        this.turmaDigitada = turmaDigitada;
        propertyChangeSupport.firePropertyChange("turmaDigitada", oldTurmaDigitada, turmaDigitada);
    }

    public Turma getTurmaSelecionada() {
        return turmaSelecionada;
    }

    public void setTurmaSelecionada(Turma turmaSelecionada) {
        if(this.turmaSelecionada != null){
            setTurmaDigitada(turmaSelecionada);
        }
        this.turmaSelecionada = turmaSelecionada;
    }

    public List<Turma> getTurmasTabelas() {
        return turmasTabelas;
    }
    
    public List<Turma> getTurmasTabelasPCD() {
        List<Turma> turmas = new ArrayList<>();
        for(Turma t: turmasTabelas){
            int i = 0;
            for(Aluno a: t.getAlunos()){
                if(a.getPcd()=="Sim"){
                    i++;
                }
            }
            if(i>0){
                turmas.add(t);
            }
        }
        return turmas;
    }

    public void setTurmasTabelas(List<Turma> turmasTabelas) {
        this.turmasTabelas = turmasTabelas;
    }
    
    public void salvar() throws ValidacaoException, RemoteException{
        turmaDigitada.validar();
        turmaDAO.salvarAtualizar(turmaDigitada);
        novo();
        pesquisar();
    }
    
    public void excluir(){
        turmaDAO.excluir(turmaDigitada);
        novo();
        pesquisar();        
    }
    
    public final void novo(){
        setTurmaDigitada(new Turma());
    }
    
    public final void pesquisar(){
        turmasTabelas.clear();
        turmasTabelas.addAll(turmaDAO.pesquisar(turmaDigitada));
    }
    
    public final void pesquisarAlunos(){
        turmasTabelas.clear();
        turmasTabelas.addAll(turmaDAO.pesquisar(turmaDigitada));
        turmaSelecionada = turmasTabelas.get(0);
        alunosTurmaSelecionada.clear();
        alunosTurmaSelecionada.addAll(turmaSelecionada.getAlunos());
    }
    
    public List<Aluno> getAlunosTurmaSelecionada() {
        return alunosTurmaSelecionada;
    }
    
    public void addPropertyChangeListener(PropertyChangeListener e){
        propertyChangeSupport.addPropertyChangeListener(e);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener e){
        propertyChangeSupport.removePropertyChangeListener(e);
    }
    
}