package interfaces;

//Essa interface ser? o contratado de autentica??o
public interface PermitirAcesso {
	

	public boolean autenticar(String login, String senha );
	
	public boolean autenticar();

}
