/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesjf.br.dao;

import cesjf.br.model.Turma;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class TurmaDAO {
    public void salvarAtualizar(Turma turma){
        EntityManager em = Connection.getEntityManager();
        em.getTransaction().begin();
        if(turma.getId()!= null){
            turma = em.merge(turma);
        }
        em.persist(turma);
        em.getTransaction().commit();
        em.close();
    }
    
    public void excluir(Turma turma){
        EntityManager em = Connection.getEntityManager();
        em.getTransaction().begin();
        turma = em.merge(turma);
        em.remove(turma);
        em.getTransaction().commit();
        em.close();
    }
    
    public List<Turma> pesquisar(Turma turma){
        EntityManager em = Connection.getEntityManager();
        StringBuilder sql = new StringBuilder("from Turma t where 1=1");
        
        if(turma.getNome()!=null && !turma.getNome().equals("")){
            sql.append("and t.nome like :nome");
        }
        Query query = em.createQuery(sql.toString());
        
        if(turma.getNome()!=null && !turma.getNome().equals("")){
            query.setParameter("nome", "%" + turma.getNome());
        }
        
        return query.getResultList();
    }
}
