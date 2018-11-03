/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesjf.br.dao;

import cesjf.br.model.Aluno;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class AlunoDAO {
    public void salvarAtualizar(Aluno aluno){
        EntityManager em = Connection.getEntityManager();
        em.getTransaction().begin();
        if(aluno.getMatricula()!= null){
            aluno = em.merge(aluno);
        }
        em.persist(aluno);
        em.getTransaction().commit();
        em.close();
    }
    
    public void excluir(Aluno aluno){
        EntityManager em = Connection.getEntityManager();
        em.getTransaction().begin();
        aluno = em.merge(aluno);
        em.remove(aluno);
        em.getTransaction().commit();
        em.close();
    }
    
    public List<Aluno> pesquisar(Aluno aluno){
        EntityManager em = Connection.getEntityManager();
        StringBuilder sql = new StringBuilder("from Aluno a where 1=1");
                
        if(aluno.getMatricula()!=null && !aluno.getMatricula().equals("")){
            sql.append("and a.matricula = :matricula");
        }
        
        Query query = em.createQuery(sql.toString());
        
        if(aluno.getMatricula()!=null){
            query.setParameter("matricula", aluno.getMatricula());
        }
        
        return query.getResultList();
    }
}
