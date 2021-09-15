package executavel.java;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ClasseJava {

	public static void main(String[] args) {
		/* new Aluno é uma isntância ou criação de um objeto. */
		/* aluno1 é uma referência (variavél)para o objeto Aluno */
		/**/
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for (int qtd = 0; qtd <=1; qtd++) {

		/* Entrada de dados */
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+"?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String RG = JOptionPane.showInputDialog("RG do aluno?");
		String CPF = JOptionPane.showInputDialog("CPF do aluno?");
		String Mae = JOptionPane.showInputDialog("Qual o nome da mãe?");
		String pai = JOptionPane.showInputDialog("Qual o nome do Pai?");
		String endereço = JOptionPane.showInputDialog("Qual o endereço?");
		String escola = JOptionPane.showInputDialog("Qual o nome da escola?");
		String matricula = JOptionPane.showInputDialog("Qual a matricula?");*/
		

		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(22));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(RG);
		aluno1.setNumeroCpf(CPF);
		aluno1.setNomeMae(Mae);
		aluno1.setNomePai(pai);
		aluno1.setEndereço(endereço);
		aluno1.setNomeEscola(escola);
		aluno1.setSerieMatriculado(matricula);*/

	
		for (int pos = 1; pos <= 4; pos++) {
			
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
			
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if (escolha == 0) {/*Opção SIM é ZERO*/
			
			int continuarRemover = 0;
			int posicao = 1;
			while(continuarRemover == 0) {
				
			
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3,ou 4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
			posicao++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continua remover ?");
			
			}
			
		}
		
		alunos.add(aluno1);
		}
		
		for (Aluno aluno : alunos) {
			
			if (aluno.getNome().equalsIgnoreCase("Joao")) {
				alunos.remove(aluno);
			break;
			}else {
				System.out.println(aluno.toString());/* Descrição do objeto na memória */
				System.out.println("Media do aluno " + aluno.getMediaNota());
				System.out.println("Resultado = " + aluno.getAlunoAprovado2());
				System.out.println("--------------------------------------------");
			}
		}
		
		
		

	}

}
