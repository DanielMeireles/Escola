/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesjf.br.controle;

import cesjf.br.dao.TurmaDAO;
import cesjf.br.model.Turma;
import cesjf.br.util.ValidacaoException;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author JohnPeter
 */
public class TurmaControl {
    
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);  
    private Turma turmaDigitada;
    private Turma TurmaSelecionada;
    private List<Turma> turmasTabelas;
    private TurmaDAO turmadao;

    public TurmaControl() {
        turmadao = new TurmaDAO();
        turmasTabelas = ObservableCollections.observableList(new ArrayList<Turma>());
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
        return TurmaSelecionada;
    }

    public void setTurmaSelecionada(Turma TurmaSelecionada) {
        if(this.TurmaSelecionada != null){
            setTurmaDigitada(this.TurmaSelecionada);
        }
        this.TurmaSelecionada = this.TurmaSelecionada;
    }

    public List<Turma> getTurmasTabelas() {
        return turmasTabelas;
    }

    public void setTurmasTabelas(List<Turma> TurmasTabelas) {
        this.turmasTabelas = TurmasTabelas;
    }
    
    public void salvar() throws ValidacaoException, RemoteException{
        turmaDigitada.validar();
        turmadao.salvarAtualizar(turmaDigitada);
        novo();
        pesquisar();
    }
    
    public void excluir(){
        turmadao.excluir(turmaDigitada);
        novo();
        pesquisar();        
    }
    
    public final void novo(){
        setTurmaDigitada(new Turma());
    }
    
    public final void pesquisar(){
        turmasTabelas.clear();
        turmasTabelas.addAll(turmadao.pesquisar(turmaDigitada));
    }
    
    public void addPropertyChangeListener(PropertyChangeListener e){
        propertyChangeSupport.addPropertyChangeListener(e);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener e){
        propertyChangeSupport.removePropertyChangeListener(e);
    }  
    
}