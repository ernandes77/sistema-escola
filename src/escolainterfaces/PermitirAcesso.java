package escolainterfaces;
/*essa interface sera nosso contrato de autenticação*/
public interface PermitirAcesso {
	
	
	public boolean autenticar(String loing, String senha);
	
	public boolean autenticar();

}
