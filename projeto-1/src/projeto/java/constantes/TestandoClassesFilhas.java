package projeto.java.constantes;

import executavel.java.Aluno;
import executavel.java.Diretor;
import executavel.java.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Julia ");
		aluno.setNomeEscola("Algoz");
		aluno.setIdade(18);
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroEducação("555.555.555");
		diretor.setNumeroCpf("555.555.222");
		diretor.setIdade(45);
		
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNivelCargo("|Secretário chefe");
		secretario.setIdade(40);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);


		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msnMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
	}

}
