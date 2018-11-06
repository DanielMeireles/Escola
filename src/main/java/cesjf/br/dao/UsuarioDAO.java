/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesjf.br.dao;

import cesjf.br.dao.Connection;
import cesjf.br.model.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Luis
 */
public class UsuarioDAO {
    public void salvarAtualizar(Usuario usuario){
        EntityManager em = Connection.getEntityManager();
        em.getTransaction().begin();
        if(usuario.getId()!= null){
            usuario = em.merge(usuario);
        }
        em.persist(usuario);
        em.getTransaction().commit();
        em.close();
    }
    
    public void excluir(Usuario usuario){
        EntityManager em = Connection.getEntityManager();
        em.getTransaction().begin();
        usuario = em.merge(usuario);
        em.remove(usuario);
        em.getTransaction().commit();
        em.close();
    }
    
    public List<Usuario> pesquisar(Usuario usuario){
        EntityManager em = Connection.getEntityManager();
        StringBuilder sql = new StringBuilder("from Usuario u where 1=1");
                
        if(usuario.getId()!=null){
            sql.append("and u.id like :id");
        }
        if(usuario.getNome()!=null && !usuario.getNome().equals("")){
            sql.append("and u.nome = :nome");
        }
        if(usuario.getSenha()!=null && !usuario.getSenha().equals("")){
            sql.append("and u.senha = :senha");
        }
        
        Query query = em.createQuery(sql.toString());
        
        if(usuario.getId()!=null){
            query.setParameter("id", "%" + usuario.getId());
        }
        if(usuario.getNome()!=null && !usuario.getNome().equals("")){
            query.setParameter("nome", "%" + usuario.getNome());
        }
        if(usuario.getSenha()!=null && !usuario.getSenha().equals("")){
            query.setParameter("senha", "%" + usuario.getSenha());
        }
        
        return query.getResultList();
    }
    
    public Usuario pesquisarUsuario(Usuario usuario){
        EntityManager em = Connection.getEntityManager();
        StringBuilder sql = new StringBuilder("from Usuario u where 1=1");
                
        if(usuario.getNome()!=null && !usuario.getNome().equals("")){
            sql.append("and u.nome like :nome");
        }
        if(usuario.getSenha()!=null && !usuario.getSenha().equals("")){
            sql.append("and u.senha like :senha");
        }
        
        Query query = em.createQuery(sql.toString());
        
        if(usuario.getNome()!=null){
            query.setParameter("nome", "%" + usuario.getNome());
        }
        if(usuario.getSenha()!=null){
            query.setParameter("senha", "%" + usuario.getSenha());
        }
        
        return (Usuario) query.getSingleResult();
    }
}
