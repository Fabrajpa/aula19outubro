package Boundary;

import java.util.Scanner;

import Control.ControlAvaliacao;

public class FormularioAvaliacao {
	ControlAvaliacao controlAvaliacao;
	Scanner in;

	public FormularioAvaliacao() {
		controlAvaliacao = new ControlAvaliacao();
		in = new Scanner(System.in);
	}

	public void formularioAvaliacao() {
		int op, opAluno, opAluno2;
		System.out.println("== Lista de oferta de disciplinas == ");
		System.out.println("Oferta 1: ");
		controlAvaliacao.ofertaDisciplina1.VerOfertaDisciplina();
		System.out.println("== Lista de oferta de disciplinas == ");
		System.out.println("Oferta 2: ");
		controlAvaliacao.ofertaDisciplina2.VerOfertaDisciplina();
		System.out.println("== Lista de oferta de disciplinas == ");
		System.out.println("Oferta 3: ");
		controlAvaliacao.ofertaDisciplina3.VerOfertaDisciplina();
		System.out.println("== Lista de oferta de disciplinas == ");
		System.out.println("Oferta 4: ");
		controlAvaliacao.ofertaDisciplina4.VerOfertaDisciplina();

		System.out.println("Escolha a oferta para cadastradas alunos: ");
		op = in.nextInt();
		if (op==1){
			controlAvaliacao.verAlunosCadastrados();
			opAluno = in.nextInt();
			opAluno2 = in.nextInt();
		if (opAluno==1){
			
			controlAvaliacao.ofertaDisciplina1.setAluno1(controlAvaliacao.aluno1);
		}else if{ (opAluno==1)
			

		}

	}

	public void CadastroProfessor() {
		System.out.println("Professor 1 Digite CPF: ");
		controlAvaliacao.professor1.setCpf(in.next());
		System.out.println("Professor 1 Digite o Nome: ");
		controlAvaliacao.professor1.setNome(in.next());
		System.out.println("Professor 2 Digite CPF: ");
		controlAvaliacao.professor2.setCpf(in.next());
		System.out.println("Professor 2 Digite o Nome: ");
		controlAvaliacao.professor2.setNome(in.next());

	}

	public void cadastroTurma() {
		System.out.println("Digite Código turma1");
		controlAvaliacao.turma1.setCodigo_turma(in.next());
		System.out.println("Digite Nome turma1");
		controlAvaliacao.turma1.setNome_turma(in.next());
		System.out.println("Digite Código turma2");
		controlAvaliacao.turma2.setCodigo_turma(in.next());
		System.out.println("Digite Nome turma2");
		controlAvaliacao.turma2.setNome_turma(in.next());

	}

	public void cadastroAluno() {
		System.out.println("Aluno 1 - Digite Matrícula: ");
		controlAvaliacao.aluno1.setMatricula(in.next());
		System.out.println("Aluno 1 - Digite Nome");
		controlAvaliacao.aluno1.setNome(in.next());

		System.out.println("Aluno 2 - Digite Matrícula: ");
		controlAvaliacao.aluno2.setMatricula(in.next());
		System.out.println("Aluno 2 - Digite Nome");
		controlAvaliacao.aluno2.setNome(in.next());

		System.out.println("Aluno 3 - Digite Matrícula: ");
		controlAvaliacao.aluno3.setMatricula(in.next());
		System.out.println("Aluno 3 - Digite Nome");
		controlAvaliacao.aluno3.setNome(in.next());

		System.out.println("Aluno 4 - Digite Matrícula: ");
		controlAvaliacao.aluno4.setMatricula(in.next());
		System.out.println("Aluno 4 - Digite Nome");
		controlAvaliacao.aluno4.setNome(in.next());

	}

	public void cadastroDisciplina() {
		System.out.println("Disciplina 1 - Digite Código");
		controlAvaliacao.disciplina1.setCodigo(in.next());
		System.out.println("Disciplina 1 - Digite Disciplina");
		controlAvaliacao.disciplina1.setNome(in.next());
		System.out.println("Disciplina 2 - Digite Código");
		controlAvaliacao.disciplina2.setCodigo(in.next());
		System.out.println("Disciplina 2 - Digite Disciplina");
		controlAvaliacao.disciplina2.setNome(in.next());

	}

	public void cadastroOfertaDisciplina() {
		int op;
		// Parte de escolha dos professores
		System.out.println("===1ª oferta de disciplina===");
		System.out.println("Escolha o professor");
		System.out.println("1)- Professor 1");
		System.out.println("2)- Professor 2");
		op = in.nextInt();

		if (op == 1) {
			controlAvaliacao.ofertaDisciplina1.setProfessor(controlAvaliacao.professor1);
		} else if (op == 2) {
			controlAvaliacao.ofertaDisciplina1.setProfessor(controlAvaliacao.professor2);
		}
		// Parte de escolha das disciplinas
		System.out.println("Escolha a disciplina");
		System.out.println("1)- Disciplina 1");
		System.out.println("2)- Disciplina 2");
		op = in.nextInt();

		if (op == 1) {
			controlAvaliacao.ofertaDisciplina1.setDisciplina(controlAvaliacao.disciplina1);
		} else if (op == 2) {
			controlAvaliacao.ofertaDisciplina1.setDisciplina(controlAvaliacao.disciplina2);
		}
		// Parte de escolha das turmas
		System.out.println("Escolha a turma");
		System.out.println("1)- Turma 1");
		System.out.println("2)- Turma 2");
		op = in.nextInt();

		if (op == 1) {
			controlAvaliacao.ofertaDisciplina1.setTurma(controlAvaliacao.turma1);
		} else if (op == 2) {
			controlAvaliacao.ofertaDisciplina1.setTurma(controlAvaliacao.turma2);
		}
		// Parte de escolha das turmas
		System.out.println("Escolha a Disciplina");
		System.out.println("1)- Disciplina 1");
		System.out.println("2)- Disciplina 2");
		op = in.nextInt();

		if (op == 1) {
			controlAvaliacao.ofertaDisciplina2.setTurma(controlAvaliacao.turma1);
		} else if (op == 2) {
			controlAvaliacao.ofertaDisciplina2.setTurma(controlAvaliacao.turma2);
		}

		// --------------------------------------------------------------------------------------------------
		// --------------------------------------------------------------------------------------------------

		// Parte de escolha dos professores
		System.out.println("===3ª oferta de disciplina===");
		System.out.println("Escolha o professor");
		System.out.println("1)- Professor 1");
		System.out.println("2)- Professor 2");
		op = in.nextInt();

		if (op == 1) {
			controlAvaliacao.ofertaDisciplina3.setProfessor(controlAvaliacao.professor1);
		} else if (op == 2) {
			controlAvaliacao.ofertaDisciplina3.setProfessor(controlAvaliacao.professor2);
		}

		// Parte de escolha das disciplinas
		System.out.println("Escolha a disciplina");
		System.out.println("1)- Disciplina 1");
		System.out.println("2)- Disciplina 2");
		op = in.nextInt();

		if (op == 1) {
			controlAvaliacao.ofertaDisciplina3.setDisciplina(controlAvaliacao.disciplina1);
		} else if (op == 2) {
			controlAvaliacao.ofertaDisciplina3.setDisciplina(controlAvaliacao.disciplina2);

			// Parte de escolha das turmas
			System.out.println("Escolha a Disciplina");
			System.out.println("1)- Turma 1");
			System.out.println("2)- Turma 2");
			op = in.nextInt();

			if (op == 1) {
				controlAvaliacao.ofertaDisciplina3.setTurma(controlAvaliacao.turma1);
			} else if (op == 2) {
				controlAvaliacao.ofertaDisciplina3.setTurma(controlAvaliacao.turma2);

			}

			// --------------------------------------------------------------------------------------------------
			// --------------------------------------------------------------------------------------------------

			// Parte de escolha dos professores
			System.out.println("===4ª oferta de disciplina===");
			System.out.println("Escolha o professor");
			System.out.println("1)- Professor 1");
			System.out.println("2)- Professor 2");
			op = in.nextInt();

			if (op == 1) {
				controlAvaliacao.ofertaDisciplina4.setProfessor(controlAvaliacao.professor1);
			} else if (op == 2) {
				controlAvaliacao.ofertaDisciplina4.setProfessor(controlAvaliacao.professor2);
			}

			// Parte de escolha das disciplinas
			System.out.println("Escolha a disciplina");
			System.out.println("1)- Disciplina 1");
			System.out.println("2)- Disciplina 2");
			op = in.nextInt();

			if (op == 1) {
				controlAvaliacao.ofertaDisciplina4.setDisciplina(controlAvaliacao.disciplina1);
			} else if (op == 2) {
				controlAvaliacao.ofertaDisciplina4.setDisciplina(controlAvaliacao.disciplina2);

				// Parte de escolha das turmas
				System.out.println("Escolha a disciplina: ");
				System.out.println("1)- Turma 1");
				System.out.println("2)- Turma 2");
				op = in.nextInt();

				if (op == 1) {
					controlAvaliacao.ofertaDisciplina4.setTurma(controlAvaliacao.turma1);
				} else if (op == 2) {
					controlAvaliacao.ofertaDisciplina4.setTurma(controlAvaliacao.turma2);
				}
			}
		}
	}
}