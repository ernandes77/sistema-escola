package escolateste;

import javax.swing.JOptionPane;

import escola.Aluno;

public class EscolaTeste {

	public static void main(String[] args) {
	
String nome = JOptionPane.showInputDialog("QUALE E O SEUI NOME : ");
String nota = JOptionPane.showInputDialog("QUAL E A SUA NOTA : ");
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(nota));
		

	}


}
