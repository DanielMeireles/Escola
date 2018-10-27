/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesjf.br.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {
    public static EntityManagerFactory emf;
    private static Connection conexao;
    
    private Connection(){
        emf = Persistence.createEntityManagerFactory("EscolaPU");
    }
    
    public synchronized static EntityManager getEntityManager(){
        if(conexao == null){
            conexao = new Connection();
        }
        return emf.createEntityManager();
    }
}
