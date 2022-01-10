package escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{

	
	private String dataMatricula;
	private String serieMatriculado;
	private String nomeEscola;
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
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCPF() {
		return numeroCPF;
	}
	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public double getMedia() {
		double somaNota = 0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNota += disciplina.getNota();
		}
		return somaNota/disciplinas.size();
	}
	
	public String getAlunoAprovado() {/*ADICIONANDO METODO RECUPERACAO*/
		double media = this.getMedia();
		if(media >=5) {
			if(media >=7) {
			return "Aluno aprovado";
			}
		
			return "Aluno recuperacao";
		}
		return "Aluno reprovado";
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCPF=" + numeroCPF + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae
				+ ", dataMatricula=" + dataMatricula + ", serieMatriculado=" + serieMatriculado + ", nomeEscola="
				+ nomeEscola + ", disciplinas=" + disciplinas + "]";
	}
	@Override/*indentifica metodo sobre escrito*/
	public boolean pessoaMaiorIdade() {
		
		return super.pessoaMaiorIdade();
	}/*usamos THIS para chamarmos o metodo de   referencia */
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "opa!! voce e maior de idade" : "ix !!! voce e menor de idade";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 800;
	}
}
