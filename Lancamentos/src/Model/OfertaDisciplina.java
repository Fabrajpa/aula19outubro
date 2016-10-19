package Model;

public class OfertaDisciplina {

	private Professor professor;
	private Disciplina disciplina;
	private Turma turma;

	private Aluno aluno1;
	private Aluno aluno2;

	public Aluno getAluno1() {
		return aluno1;
	}

	public void setAluno1(Aluno aluno1) {
		this.aluno1 = aluno1;
	}

	public Aluno getAluno2() {
		return aluno2;
	}

	public void setAluno2(Aluno aluno2) {
		this.aluno2 = aluno2;
	}

	private Aluno aluno3;
	private Aluno aluno4;

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public void ListarOfertaDisciplina() {
		System.out.println("Professor : " + this.professor.getNome().toString());
		System.out.println("Disciplina : " + this.disciplina.getNome().toString());
		System.out.println("Turma : " + this.turma.getNome_turma().toString());
		System.out.println("Aluno1 : " + this.aluno1.getNome().toString());
		System.out.println("Aluno2 : " + this.aluno2.getNome().toString());
	}

}
