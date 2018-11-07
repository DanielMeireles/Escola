/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesjf.br.dao;

import cesjf.br.model.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

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
        sql.append(" and u.nome like :nome");
        sql.append(" and u.senha like :senha");
        
        Query query = em.createQuery(sql.toString());
        
        query.setParameter("nome", "%" + usuario.getNome());
        query.setParameter("senha", "%" + usuario.getSenha());
        
        return query.getResultList();
    }
    
    public List<Usuario> pesquisarUsuarios(Usuario usuario){
        EntityManager em = Connection.getEntityManager();
        StringBuilder sql = new StringBuilder("from Usuario u where 1=1");
        
        if(usuario != null && usuario.getNome()!=null && !usuario.getNome().equals("")){
            sql.append(" and u.nome like :nome");
        }
        
        Query query = em.createQuery(sql.toString());
        
        if(usuario != null && usuario.getNome()!=null && !usuario.getNome().equals("")){
            query.setParameter("nome", "%" + usuario.getNome());
        }
        
        return query.getResultList();
    }
    
    public Usuario pesquisarUsuario(Usuario usuario){
        EntityManager em = Connection.getEntityManager();
        StringBuilder sql = new StringBuilder("from Usuario u where 1=1");
                
        if(usuario.getNome()!=null && !usuario.getNome().equals("")){
            sql.append(" and u.nome like :nome");
        }
        if(usuario.getSenha()!=null && !usuario.getSenha().equals("")){
            sql.append(" and u.senha like :senha");
        }
        
        Query query = em.createQuery(sql.toString());
        
        if(usuario.getNome()!=null && !usuario.getNome().equals("")){
            query.setParameter("nome", "%" + usuario.getNome());
        }
        if(usuario.getSenha()!=null && !usuario.getSenha().equals("")){
            query.setParameter("senha", "%" + usuario.getSenha());
        }
        
        return (Usuario) query.getSingleResult();
    }
    
    public Usuario verificaUsuario(Usuario usuario){
        EntityManager em = Connection.getEntityManager();
        StringBuilder sql = new StringBuilder("from Usuario u where 1=1");
                
        if(usuario.getNome()!=null && !usuario.getNome().equals("")){
            sql.append(" and u.nome like :nome");
        }
        
        Query query = em.createQuery(sql.toString());
        
        if(usuario.getNome()!=null && !usuario.getNome().equals("")){
            query.setParameter("nome", "%" + usuario.getNome());
        }
        
        return (Usuario) query.getSingleResult();
    }
}
