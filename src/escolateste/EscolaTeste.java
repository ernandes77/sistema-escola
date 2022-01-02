package escolateste;

import javax.swing.JOptionPane;

import escola.Aluno;

public class EscolaTeste {

	public static void main(String[] args) {
	
String nome = JOptionPane.showInputDialog("QUALE E O SEUI NOME : ");
String nota = JOptionPane.showInputDialog("QUAL E A SUA NOTA : ");
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
		aluno1.setIdade(Integer.valueOf(nota));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCPF(numeroCPF);
		aluno1.setNomePai(nomePai);
		aluno1.setNomeMae(nomeMae);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculada);
		aluno1.setNomeEscola(nomeEscola);

		System.out.println("Aluno : "+aluno1);/*endereco do objeto */
	}
	 

}
