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
        
        if(turma.getId()!=null){
            sql.append("and t.id_turma = :id");
        }
        if(turma.getNome()!=null && !turma.getNome().equals("")){
            sql.append("and t.nome_turma = :nome");
        }
        if(turma.getAno()>0){
            sql.append("and t.ano_turma = :ano");
        }
        Query query = em.createQuery(sql.toString());
        
        if(turma.getId()!=null){
            query.setParameter("id", "%" + turma.getId());
        }
        if(turma.getNome()!=null && !turma.getNome().equals("")){
            query.setParameter("nome", "%" + turma.getNome());
        }
        if(turma.getAno()>0){
            query.setParameter("ano", "%" + turma.getAno());
        }
        return query.getResultList();
    }
}
