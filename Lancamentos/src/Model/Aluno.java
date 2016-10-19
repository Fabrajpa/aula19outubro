package Model;

public class Aluno {

	private String matricula;
	private String nome;

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
	
	public void verDadosAluno(){
		System.out.println("Matrícula : " + this.getMatricula().toString());
		System.out.println("Nome : " + this.getNome().toString());
	}

}
