package escolateste;

import javax.swing.JOptionPane;

import escola.Aluno;
import escola.Disciplina;

public class EscolaTeste {

	public static void main(String[] args) {
	
String nome = JOptionPane.showInputDialog("QUAL E O SEU NOME : ");
String idade = JOptionPane.showInputDialog("QUAL E A SUA IDADE : ");
String dataNascimento = JOptionPane.showInputDialog("QUAL A DATA DE NASCIMENTO : ");
String registroGeral = JOptionPane.showInputDialog("QUAL NUMERO DO RG : ");
String numeroCPF = JOptionPane.showInputDialog("QUAL SEU NUMERO DO CPF : ");
String nomePai = JOptionPane.showInputDialog("NOME PAI : ");
String nomeMae = JOptionPane.showInputDialog("NOME MAE : ");
String dataMatricula = JOptionPane.showInputDialog("DATA DA MATRICULA : ");
String serieMatriculada = JOptionPane.showInputDialog("Serie matriculado : ");
String nomeEscola = JOptionPane.showInputDialog("NOME DA ESCOLA :");
		
		Aluno aluno1 = new Aluno();/*CONSTRUTO E SUA REFERENCIA E ESTANCIA DO OBJETO*/
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCPF(numeroCPF);
		aluno1.setNomePai(nomePai);
		aluno1.setNomeMae(nomeMae);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculada);
		aluno1.setNomeEscola(nomeEscola);
		
		for(int qtd =1; qtd <=4;qtd++) {
		
		String nomeDisciplina = JOptionPane.showInputDialog("nomeDisciplina : ");
		String nota = JOptionPane.showInputDialog("Nota : ");
			
			Disciplina disciplina = new Disciplina();/*criando contrutor e referencia e estancia de disciplina*/
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.parseDouble(nota));
			
			aluno1.disciplinas.add(disciplina);/*adicionando disciplina*/
			
		}
		
		int remover = JOptionPane.showConfirmDialog(null, "DESEJA REMOVER ALGUMA DISCIPLINA");
		
		if(remover ==0) {
			String removerDisciplina = JOptionPane.showInputDialog("QUAL DISCIPLINA 1,2,3 OU 4");
			aluno1.disciplinas.remove(Integer.valueOf(removerDisciplina).intValue()-1);
			
		}

		System.out.println("Aluno : "+aluno1);/*endereco do objeto */
		System.out.println("A media do aluno: "+aluno1.getMedia());/*metodo que rotorna media do aluno*/
		System.out.println("A situacao do aluno  e: "+aluno1.getAlunoAprovado());/*metodo que rotorna resultado do aluno*/
	}
	 

}
