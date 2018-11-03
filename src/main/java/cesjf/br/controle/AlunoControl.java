/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesjf.br.controle;

import cesjf.br.dao.AlunoDAO;
import cesjf.br.model.Aluno;
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
public class AlunoControl {
    
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);  
    private Aluno alunoDigitado;
    private Aluno alunoSelecionado;
    private List<Aluno> alunosTabela;
    private AlunoDAO alunoDao;

    public AlunoControl() {
        alunoDao = new AlunoDAO();
        alunosTabela = ObservableCollections.observableList(new ArrayList<Aluno>());
        novo();
        //pesquisar();
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
        alunoDao.salvarAtualizar(alunoDigitado);
        novo();
        //pesquisar();
    }
    
    public void excluir(){
        alunoDao.excluir(alunoDigitado);
        novo();
        //pesquisar();
    }
    
    public final void novo(){
        setAlunoDigitado(new Aluno());
    }
    
    public final void pesquisar(){
        alunosTabela.clear();
        alunosTabela.addAll(alunoDao.pesquisar(alunoSelecionado));
    }
    
    public void addPropertyChangeListener(PropertyChangeListener e){
        propertyChangeSupport.addPropertyChangeListener(e);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener e){
        propertyChangeSupport.removePropertyChangeListener(e);
    }
    
}
