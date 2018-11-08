/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesjf.br.model;

import cesjf.br.util.ValidacaoException;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "Aluno")
@Table(name = "aluno")
public class Aluno implements Serializable, Comparable<Aluno> {

    private static final int serialVersionUID = 1;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MATRICULA_ALUNO")
    private int matricula;
    @Column(name="NOME_ALUNO", length = 255, nullable = false)
    private String nome;
    @Column(name="ANO_NASC_ALUNO", nullable = false)
    private int anoNasc;
    @Column(name="PCD_ALUNO", nullable = false)
    private int pcd;    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "turma_id")
    private Turma turma;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    
    public String getPcd() {
        if(pcd==1){
            return "Sim";
        }else{
            return "Não";
        }      
    }

    public void setPcd(String pcd) {
        if(pcd.equals("Sim")){
            this.pcd = 1;
        }else{
            this.pcd = 0;
        }
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.matricula;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return matricula + ", " + nome + ", " + anoNasc + ", Turma: " + getTurma().getNome();
    } 
    
    public void validar() throws ValidacaoException{
        Calendar hoje = Calendar.getInstance();		
	int ano = hoje.get(Calendar.YEAR);
        if (this.turma == null){
            throw new ValidacaoException(": selecione uma turma");
        }else if(this.nome == null || this.nome.equals("")){
            throw new ValidacaoException(": preencha o campo de nome");
        }else if(this.anoNasc < ano - 110 || this.anoNasc> ano){
            throw new ValidacaoException(": informe corretamente o ano");
        }
    }
    
    @Override
    public int compareTo(Aluno outroAluno) {
        return this.nome.compareTo(outroAluno.getNome());
    }
}
