package cesjf.br.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Aluno.class)
public abstract class Aluno_ {

	public static volatile SingularAttribute<Aluno, Integer> pcd;
	public static volatile SingularAttribute<Aluno, Integer> anoNasc;
	public static volatile SingularAttribute<Aluno, Long> matricula;
	public static volatile SingularAttribute<Aluno, String> nome;
	public static volatile SingularAttribute<Aluno, Turma> turma;

	public static final String PCD = "pcd";
	public static final String ANO_NASC = "anoNasc";
	public static final String MATRICULA = "matricula";
	public static final String NOME = "nome";
	public static final String TURMA = "turma";

}

