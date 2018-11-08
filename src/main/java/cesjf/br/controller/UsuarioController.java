/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesjf.br.controller;

import cesjf.br.dao.UsuarioDAO;
import cesjf.br.model.Usuario;
import cesjf.br.util.ValidacaoException;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;

public class UsuarioController {
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);  
    private Usuario usuarioDigitado;
    private Usuario usuarioSelecionado;
    private List<Usuario> usuariosTabelas;
    private final UsuarioDAO usuarioDAO;

    public UsuarioController() throws ValidacaoException, RemoteException {
        usuarioDAO = new UsuarioDAO();
        usuariosTabelas = ObservableCollections.observableList(new ArrayList<>());
        novo();
        pesquisar();
    }
    
    public Usuario getUsuarioDigitado() {
        return usuarioDigitado;
    }

    public void setUsuarioDigitado(Usuario usuarioDigitado) {
        Usuario oldUsuarioDigitado = this.usuarioDigitado;
        this.usuarioDigitado = usuarioDigitado;
        propertyChangeSupport.firePropertyChange("usuarioDigitado", oldUsuarioDigitado, usuarioDigitado);
    }

    public Usuario getUsuarioSelecionado() {
        return usuarioSelecionado;
    }

    public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
        if(this.usuarioSelecionado != null){
            setUsuarioDigitado(usuarioSelecionado);
        }
        this.usuarioSelecionado = usuarioSelecionado;
    }

    public List<Usuario> getUsuariosTabelas() {
        return usuariosTabelas;
    }

    public void setUsuariosTabelas(List<Usuario> usuariosTabelas) {
        this.usuariosTabelas = usuariosTabelas;
    }
    
    public void salvar() throws ValidacaoException, RemoteException{
        usuarioDigitado.validar();
        usuarioDAO.salvarAtualizar(usuarioDigitado);
        novo();
        pesquisar();
    }
    
    public void excluir(){
        usuarioDAO.excluir(usuarioDigitado);
        novo();
        pesquisar();
    }
    
    public final void novo(){
        setUsuarioDigitado(new Usuario());
    }
    
    public final void pesquisar(){
        usuariosTabelas.clear();
        usuariosTabelas.addAll(usuarioDAO.pesquisar(usuarioDigitado));
    }
    
    public boolean validaLogin(){
        setUsuarioSelecionado(usuarioDAO.validaLogin(usuarioDigitado));
        return usuarioSelecionado.validaLogin(usuarioDigitado);
    }

    public void verificacaoPrimeiroLogin() throws ValidacaoException, RemoteException {
        usuarioDigitado.setNome("admin");
        usuarioDigitado.setSenha("admin");
        usuarioDigitado.setPerfil("Administrador");
        if(usuarioDAO.pesquisar(usuarioDigitado).isEmpty()){
            salvar();
        }
        novo();
    }
    
    public void addPropertyChangeListener(PropertyChangeListener e){
        propertyChangeSupport.addPropertyChangeListener(e);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener e){
        propertyChangeSupport.removePropertyChangeListener(e);
    }
}