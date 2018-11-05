package cesjf.br.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Turma.class)
public abstract class Turma_ {

	public static volatile SingularAttribute<Turma, Integer> ano;
	public static volatile ListAttribute<Turma, Aluno> alunos;
	public static volatile SingularAttribute<Turma, String> nome;
	public static volatile SingularAttribute<Turma, Long> id;
	public static volatile SingularAttribute<Turma, String> ensino;

	public static final String ANO = "ano";
	public static final String ALUNOS = "alunos";
	public static final String NOME = "nome";
	public static final String ID = "id";
	public static final String ENSINO = "ensino";

}

