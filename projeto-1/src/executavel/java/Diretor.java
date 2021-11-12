package executavel.java;

import interfaces.PermitirAcesso;

/*Classe filha que extende de pessoa*/
public class Diretor extends Pessoa implements PermitirAcesso {
	
	private String registroEducação;
	private int tempoDirecao;
	private String titulacao;
	
	private String login;
	private String senha;
	
	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Diretor() {
	}
	
	public String getRegistroEducação() {
		return registroEducação;
	}
	public void setRegistroEducação(String registroEducação) {
		this.registroEducação = registroEducação;
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
		return "Diretor [registroEducação=" + registroEducação + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	@Override
	public double Salario() {
		
		return 4756.33;
	}
	
	@Override
	public boolean autenticar(String login, String senha) {//Exemplo duas formas de interface
		this.login = login;
		this.senha = senha;
		return autenticar();
	}
	@Override
	public boolean autenticar() {
		
		return login.equals("admin") && senha.equals("admin");
	}

}
