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
		diretor.setNome("Balaão");
		diretor.setRegistroEducação("555.555.555");
		diretor.setNumeroCpf("555.555.222");
		diretor.setIdade(45);

		Secretario secretario = new Secretario();
		secretario.setNome("Justino");
		secretario.setExperiencia("Administração");
		secretario.setNivelCargo("|Secretário chefe");
		secretario.setIdade(40);

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msnMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());

		System.out.println("Sálario Aluno é = " + aluno.Salario());
		System.out.println("Sálario Diretor é = " + diretor.Salario());
		System.out.println("Sálario Secretário é = " + secretario.Salario());

		/*
		 * Polimorfismo faz com que eu possa trabalhar de diversas formas, tratar,
		 * igualar, diversos tipos.
		 */
		teste(aluno);
		teste(diretor);
		teste(secretario);
	
	}
     //Método generico devido ao polimorfismo
	public static void teste(Pessoa pessoa) {
		System.out.println("Está pessoa é muito boa = " 
	+ pessoa.getNome() + " O Sálario é de = " + pessoa.Salario());

	}

}
