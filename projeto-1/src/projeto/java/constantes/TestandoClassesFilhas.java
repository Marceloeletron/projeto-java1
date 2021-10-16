package projeto.java.constantes;

import executavel.java.Aluno;
import executavel.java.Diretor;
import executavel.java.Pessoa;
import executavel.java.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Julia ");
		aluno.setNomeEscola("Algoz");
		aluno.setIdade(18);

		Diretor diretor = new Diretor();
		diretor.setNome("Bala�o");
		diretor.setRegistroEduca��o("555.555.555");
		diretor.setNumeroCpf("555.555.222");
		diretor.setIdade(45);

		Secretario secretario = new Secretario();
		secretario.setNome("Justino");
		secretario.setExperiencia("Administra��o");
		secretario.setNivelCargo("|Secret�rio chefe");
		secretario.setIdade(40);

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msnMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());

		System.out.println("S�lario Aluno � = " + aluno.Salario());
		System.out.println("S�lario Diretor � = " + diretor.Salario());
		System.out.println("S�lario Secret�rio � = " + secretario.Salario());

		/*
		 * Polimorfismo faz com que eu possa trabalhar de diversas formas, tratar,
		 * igualar, diversos tipos.
		 */
		teste(aluno);
		teste(diretor);
		teste(secretario);
	
	}
     //M�todo generico devido ao polimorfismo
	public static void teste(Pessoa pessoa) {
		System.out.println("Est� pessoa � muito boa = " 
	+ pessoa.getNome() + " O S�lario � de = " + pessoa.Salario());

	}

}
