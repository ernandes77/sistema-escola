package escolateste;

import escola.Aluno;
import escola.Diretor;
import escola.Secretario;

public class HerancaTeste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("ernandes");
		aluno.setIdade(15);
		
		Diretor diretor = new Diretor();
		diretor.setTempoDirecao(8);
		diretor.setIdade(27);
		
		Secretario secretario = new Secretario();
		secretario.setNivelCargo("Secretario");
		secretario.setIdade(15);
		
		System.out.println("Aluno "+aluno);
		System.out.println("Diretor "+diretor);
		System.out.println("secretario "+secretario);
		
		/*chamando metodo  override sobre escrito*/
		System.out.println("Aluno :" +aluno.pessoaMaiorIdade() +"-"+aluno.msgMaiorIdade());
		System.out.println("Secretario : " +secretario.pessoaMaiorIdade() +"-"+secretario.msgMaiorIdade());
		System.out.println("Diretor : " +diretor.pessoaMaiorIdade()+ "-"+diretor.msgMaiorIdade());

		/*chamando metodo abstract */
		System.out.println("aluno : "+aluno.salario()+" reias");
		System.out.println("Secretario : "+secretario.salario()+" Reais");
		System.out.println("Diretor : "+diretor.salario()+" Reais");
	
	}

}
