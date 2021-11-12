package interfaces;

//Essa interface será o contratado de autenticação
public interface PermitirAcesso {
	

	public boolean autenticar(String login, String senha );
	
	public boolean autenticar();

}
