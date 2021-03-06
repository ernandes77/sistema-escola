package escola;

public class Diretor extends Pessoa {

	public String registroEducacao;
	public int tempoDirecao;
	public String titulacao;
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + "]";
	}
	
	@Override
	public boolean pessoaMaiorIdade() {
	
		return super.pessoaMaiorIdade();
	}
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Opa !!!voce e maior de idade " : "ix!!!voce e menor de idade ";
	}
	@Override
	public double salario() {
		
		return 2000;
	}
}
