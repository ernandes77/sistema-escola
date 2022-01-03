package escolateste;

import escola.Aluno;
import escola.Diretor;
import escola.Secretario;

public class HerancaTeste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("ernandes");
		
		Diretor diretor = new Diretor();
		diretor.setTempoDirecao(8);
		
		Secretario secretario = new Secretario();
		secretario.setNivelCargo("Secretario");
		
		System.out.println("Aluno "+aluno);
		System.out.println("Diretor "+diretor);
		System.out.println("secretario "+secretario);
		

	}

}
