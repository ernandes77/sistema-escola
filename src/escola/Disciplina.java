package escola;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

	private String disciplina;
	private double nota;
	
	private List<Disciplina> disciplinas= new ArrayList<Disciplina>();
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	
	
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
}
