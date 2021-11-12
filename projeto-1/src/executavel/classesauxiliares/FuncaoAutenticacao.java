package executavel.classesauxiliares;

import interfaces.PermitirAcesso;

//Somente receber alguem que tenha o contrato da interface PermitirAcesso e chamar o autenticar 
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
}

}