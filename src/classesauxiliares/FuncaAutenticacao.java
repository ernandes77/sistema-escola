package classesauxiliares;

import escolainterfaces.PermitirAcesso;

/*realmente e somente receber alguem que tem o contrato de interface permitir acesso e chama autenticacao*/
public class FuncaAutenticacao {

	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
	return permitirAcesso.autenticar();
	}
	public FuncaAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	}
