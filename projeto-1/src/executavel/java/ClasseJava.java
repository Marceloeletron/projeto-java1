package executavel.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import excecao.ExcecaoProcessarNota;
import executavel.classesauxiliares.FuncaoAutenticacao;
import projeto.java.constantes.StatusAluno;

public class ClasseJava {

	public static void main(String[] args) {
		/* new Aluno é uma isntância ou criação de um objeto. */
		/* aluno1 é uma referência (variavél)para o objeto Aluno */

		try {
			
			lerArquivo();
			
			
			
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		
		
		
		
		if(new FuncaoAutenticacao(new Diretor(login,senha)).autenticar()) {//Só poderá ter acesso ao contrato quem for 100% legitimo


			List<Aluno> alunos = new ArrayList<Aluno>();

			/*
			 * HashMap, é uma lista que dentro dela temos uma chave que identifica uma
			 * sequência de valores
			 */
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int qtd = 1; qtd <= 1; qtd++) {

				/* Entrada de dados */
				String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
				
				  String idade = JOptionPane.showInputDialog("Qual a idade?"); 
				  /*
				 * dataNascimento = JOptionPane.showInputDialog("Data de nascimento?"); String
				 * RG = JOptionPane.showInputDialog("RG do aluno?"); String CPF =
				 * JOptionPane.showInputDialog("CPF do aluno?"); String Mae =
				 * JOptionPane.showInputDialog("Qual o nome da mãe?"); String pai =
				 * JOptionPane.showInputDialog("Qual o nome do Pai?"); String endereço =
				 * JOptionPane.showInputDialog("Qual o endereço?"); String escola =
				 * JOptionPane.showInputDialog("Qual o nome da escola?"); String matricula =
				 * JOptionPane.showInputDialog("Qual a matricula?");
				 */

				Aluno aluno1 = new Aluno();
				aluno1.setNome(nome);
				aluno1.setIdade(Integer.valueOf(idade));
				  
				/*
				 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(RG);
				 * aluno1.setNumeroCpf(CPF); aluno1.setNomeMae(Mae); aluno1.setNomePai(pai);
				 * aluno1.setEndereço(endereço); aluno1.setNomeEscola(escola);
				 * aluno1.setSerieMatriculado(matricula);
				 */

				for (int pos = 1; pos <= 1; pos++) {

					String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
					String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));

					aluno1.getDisciplinas().add(disciplina);

				}

				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

				if (escolha == 0) {/* Opção SIM é ZERO */

					int continuarRemover = 0;
					int posicao = 1;
					while (continuarRemover == 0) {

						String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3,ou 4 ?");
						aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
						posicao++;
						continuarRemover = JOptionPane.showConfirmDialog(null, "Continua remover ?");

					}

				}

				alunos.add(aluno1);
			}

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {

				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);

				} else {
					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
				}

			}

			System.out.println("------------------Lista dos Aprovados-------------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Nome = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
						+ " com média de = " + aluno.getMediaNota());
			}

			System.out.println("------------------Lista dos Recuperação-------------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Nome = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
						+ " com média de = " + aluno.getMediaNota());
			}

			System.out.println("------------------Lista dos Reprovados-------------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Nome = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
						+ " com média de = " + aluno.getMediaNota());
			}

		}else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}
		/**/
		} catch (Exception e) {
			StringBuilder saida = new StringBuilder();
			
			e.printStackTrace(); /*Imprime erro no console*/
			
			/*Mensagem de erro ou causa*/
			System.out.println("Mensagem " + e.getMessage());
			
			for (int pos = 0; pos < e.getStackTrace().length; pos++) {
				
				saida.append("\n Classe de erro " + e.getStackTrace()[pos].getClassName());
				saida.append("\n Método de erro " + e.getStackTrace()[pos].getMethodName());
				saida.append("\n Linha de erro " + e.getClass().getName());


			}
			
			JOptionPane.showMessageDialog(null, "Erro de conversão de número " + saida.toString());
		}
		finally {/*sempre é executado ocorrendo erros ou não. 
			Finally é usado sempre quando se precisa executar um processo no sistema dando erro ou não*/
			JOptionPane.showInternalMessageDialog(null, "Vc ainda está aprendendo java.");
		}

	}

	public static void lerArquivo () throws  FileNotFoundException {
		
		
		
		File fil = new File("c://lines.txt");
		java.util.Scanner scanner = new java.util.Scanner(fil);
		
		
	}


}
