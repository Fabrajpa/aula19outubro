package Control;

import Model.Aluno;
import Model.Disciplina;
import Model.OfertaDisciplina;
import Model.Professor;
import Model.Turma;

public class ControlAvaliacao {

	public Aluno aluno1;
	public Aluno aluno2;
	public Aluno aluno3;
	public Aluno aluno4;
	public Professor professor1;
	public Professor professor2;
	public Turma turma1;
	public Turma turma2;
	public OfertaDisciplina ofertaDisciplina1;
	public OfertaDisciplina ofertaDisciplina2;
	public OfertaDisciplina ofertaDisciplina3;
	public OfertaDisciplina ofertaDisciplina4;
	public Disciplina disciplina1;
	public Disciplina disciplina2;

	public ControlAvaliacao() {
		aluno1 = new Aluno();
		aluno2 = new Aluno();
		aluno3 = new Aluno();
		aluno4 = new Aluno();
		professor1 = new Professor();
		professor2 = new Professor();
		turma1 = new Turma();
		turma2 = new Turma();
		ofertaDisciplina1 = new OfertaDisciplina();
		ofertaDisciplina2 = new OfertaDisciplina();
		ofertaDisciplina3 = new OfertaDisciplina();
		ofertaDisciplina4 = new OfertaDisciplina();
		disciplina1 = new Disciplina();
		disciplina2 = new Disciplina();
	}

	public void verAlunosCadastrados() {
		System.out.print("1)");
		aluno1.verDadosAluno();
		System.out.print("2)");
		aluno2.verDadosAluno();
		System.out.print("3)");
		aluno3.verDadosAluno();
		System.out.print("4)");
		aluno4.verDadosAluno();
	}

}