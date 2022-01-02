package escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private String nome;
	private int idade;
	
	public List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getMedia() {
		double somaNota = 0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNota += disciplina.getNota();
		}
		return somaNota/disciplinas.size();
	}
	
}
