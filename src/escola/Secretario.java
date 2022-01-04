package escola;

import escolainterfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

	public String registro;
	public String nivelCargo;
	public int experiencia;
	
	private String loing;
	private String senha;
	
	
	
	public String getLoing() {
		return loing;
	}
	public void setLoing(String loing) {
		this.loing = loing;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia + "]";
	}
	@Override
	public boolean pessoaMaiorIdade() {
		
		return super.pessoaMaiorIdade();
	}
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Opa!!! voce e maior de idade" : "ix!!!voce e menor de idade";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1200;
	}
	@Override
	public boolean autenticar() {
		
		return loing.equals("admin")&& senha.equals("admin");
	}



}
