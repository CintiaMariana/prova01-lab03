package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.vo.Aluno;
import br.edu.univas.vo.Mestrado;
import br.edu.univas.vo.PosGraduacao;

public class StartApp {
	
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		int opcao = 0;
		ArrayList <Aluno> listaAluno = new ArrayList<>();
		
		
		do {
		menu ();
		opcao = readInteger(scanner);
		
		if (opcao == 1) {
			cadastroAluno(listaAluno);
		} else if (opcao == 2) {
			listarPosGraduacao(listaAluno);
		} else if (opcao == 3) {
			listarMestrado(listaAluno);
		} else if (opcao == 4) {
			System.out.println("Até mais!!");
		}
		
		else {
			System.out.println("Opção inválida, tente novamente!!");
		}
		
		} while (opcao != 4);
		
	}
	
	public static void menu () {
		System.out.println("Digite a opção desejada: ");
		System.out.println("1 - Cadastrar aluno");
		System.out.println("2 - Listar alunos Pós-Graduação");
		System.out.println("3 - Listar alunos Mestrado");
		System.out.println("4 - Sair");
	}
	
	public static int readInteger(Scanner scanner) {
		int result = scanner.nextInt();
		scanner.nextLine();
		return result;
	}
	
	public static void cadastroAluno (ArrayList <Aluno> alunos) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("--- Cadastro de Alunos ---");
		
		Aluno aluno = new Aluno ();
		System.out.println("Digite seu nome: ");
		aluno.setNome(scanner.nextLine());
		System.out.println("Digite seu email: ");
		aluno.setEmail(scanner.nextLine());
		System.out.println("Digite seu CPF: ");
		aluno.setCpf(scanner.nextInt());
		
		System.out.println("Digite a opção do seu curso: ");
		System.out.println("1 - Pós-Graduação");
		System.out.println("2 - Mestrado");
		int opcao = readInteger(scanner);
		
		Aluno curso = null;
		if (opcao == 1) {
			curso = new PosGraduacao();
		} else if (opcao == 2) {
			curso = new Mestrado();
		}
		
		alunos.add(aluno);
		
	}
	
	
	public static void listarPosGraduacao(ArrayList<Aluno> aluno) {

		
	}
	
	public static void listarMestrado(ArrayList<Aluno> aluno) {
		
	}

}
