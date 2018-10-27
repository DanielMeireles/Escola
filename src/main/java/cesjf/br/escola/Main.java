/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesjf.br.escola;

import cesjf.br.dao.AlunoDAO;
import cesjf.br.dao.TurmaDAO;
import cesjf.br.enums.EnsinoEnum;
import cesjf.br.model.Aluno;
import cesjf.br.model.Turma;

/**
 *
 * @author Daniel Meireles
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TurmaDAO daoTurma = new TurmaDAO();
        AlunoDAO daoAluno = new AlunoDAO();
        
        Turma turma = new Turma();
        turma.setNome("Teste");
        turma.setEnsino(EnsinoEnum.Medio);
        turma.setAno(2018);
        
        daoTurma.salvarAtualizar(turma);
        
        Aluno aluno = new Aluno();
        aluno.setNome("Teste");
        aluno.setAnoNasc(1987);
        aluno.setPcd(0);
        
        daoAluno.salvarAtualizar(aluno);
        
        turma.getAlunos().add(aluno);
        
        daoTurma.salvarAtualizar(turma);
    }
    
}
