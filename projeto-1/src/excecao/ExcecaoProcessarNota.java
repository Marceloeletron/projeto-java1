package excecao;

public class ExcecaoProcessarNota extends Exception{

	public ExcecaoProcessarNota(String erro) {
		super("Op�! Erro ao processar arquivo do aluno " + erro);
 	}
}
