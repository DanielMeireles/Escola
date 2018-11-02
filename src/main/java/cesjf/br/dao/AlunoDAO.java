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
        
        if(aluno.getTurma().getId() != null){
            sql.append("and a.getTurma().getId() = :getTurma().getId()");
        }
        
        if(aluno.getMatricula()!=null){
            sql.append("and a.matricula_aluno = :matricula");
        }
        if(aluno.getNome()!=null && !aluno.getNome().equals("")){
            sql.append("and a.nome_aluno = :nome");
        }
        if(aluno.getAnoNasc()>0){
            sql.append("and a.ano_nasc_aluno = :ano_nasc");
        }
        if(aluno.getPcd()==0||aluno.getPcd()==1){
            sql.append("and a.pcd_aluno = :pcd");
        }
        Query query = em.createQuery(sql.toString());
        
        if(aluno.getMatricula()!=null){
            query.setParameter("matricula", "%" + aluno.getMatricula());
        }
        if(aluno.getNome()!=null && !aluno.getNome().equals("")){
            query.setParameter("nome", "%" + aluno.getNome());
        }
        if(aluno.getAnoNasc()>0){
            query.setParameter("ano_nasc", "%" + aluno.getAnoNasc());
        }
        if(aluno.getPcd()==0||aluno.getPcd()==1){
            query.setParameter("pcd", "%" + aluno.getPcd());
        }
        return query.getResultList();
    }
}
