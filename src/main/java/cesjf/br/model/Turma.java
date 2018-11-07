/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesjf.br.model;

import cesjf.br.util.ValidacaoException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Turma")
@Table(name = "turma")
public class Turma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_TURMA")
    private Long id;
    @Column(name="NOME_TURMA", length = 100, nullable = false)
    private String nome;    
    @Column(name="ENSINO_TURMA", length = 13, nullable = false)
    private String ensino;
    @Column(name="ANO_TURMA", nullable = false)
    private int ano;
    @OneToMany(
        mappedBy = "turma", 
        cascade = CascadeType.ALL, 
        orphanRemoval = true
    )
    private List<Aluno> alunos;
    @Column(name="QTDE_TURMA", nullable = false)
    private int quantidadeAlunos;

    public Turma() {
        alunos = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnsino() {
        return ensino;
    }

    public void setEnsino(String ensino) {
        this.ensino = ensino;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos() {
        this.quantidadeAlunos = alunos.size();
    }    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turma)) {
            return false;
        }
        Turma other = (Turma) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome + ", " + ano + ", " + quantidadeAlunos + " alunos";
    }
    
    public void validar() throws ValidacaoException{
        Calendar hoje = Calendar.getInstance();		
	int ano = hoje.get(Calendar.YEAR);
        if (this.nome == null || this.nome.equals("")){
            throw new ValidacaoException(": campo nome precisa ser preenchido");   
        }else if(getAno() < ano - 110 || getAno() > ano){
            throw new ValidacaoException(": informe corretamente o ano");
        }else if(getEnsino() == null || getEnsino().equals("")){
            throw new ValidacaoException(": selecione o tipo de Ensino");
        }
    }
}
