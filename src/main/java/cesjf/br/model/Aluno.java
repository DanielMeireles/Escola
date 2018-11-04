/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesjf.br.model;

import cesjf.br.util.ValidacaoException;
import java.io.Serializable;
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
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_ALUNO")
    private Long id;
    @Column(name="MATRICULA_ALUNO", length = 30, nullable = false)
    private String matricula;
    @Column(name="NOME_ALUNO", length = 255, nullable = false)
    private String nome;
    @Column(name="ANO_NASC_ALUNO", nullable = false)
    private int anoNasc;
    @Column(name="PCD_ALUNO", nullable = false)
    private int pcd;    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "turma_id")
    private Turma turma;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
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
        int hash = 0;
        hash += (matricula != null ? matricula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the matricula fields are not set
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if ((this.matricula == null && other.matricula != null) || (this.matricula != null && !this.matricula.equals(other.matricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return matricula + ", " + nome + ", " + anoNasc + ", Turma: " + getTurma().getNome();
    } 
    
    public void validar() throws ValidacaoException{
    if (this.nome == null || this.nome.equals(""))
        throw new ValidacaoException("Campo nome precisa ser preenchido");
    }
}
