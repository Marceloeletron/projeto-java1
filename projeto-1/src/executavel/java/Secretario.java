package executavel.java;

import interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	//criando login e senha secretário
	private String login;
	private String senha;
	
	
	
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
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	@Override
	public double Salario() {
		
		return 1980 * 0.9;
	}
	//Esse é o método de contrato de autenticação
	@Override
	public boolean autenticar() {
		
		return login.equals("admin") && senha.equals("admin");//Retorna sim , caso login e senha sejam admin. se não false.
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
