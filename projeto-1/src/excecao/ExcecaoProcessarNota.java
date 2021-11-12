package excecao;

public class ExcecaoProcessarNota extends Exception{

	public ExcecaoProcessarNota(String erro) {
		super("Opá! Erro ao processar arquivo do aluno " + erro);
 	}
}
