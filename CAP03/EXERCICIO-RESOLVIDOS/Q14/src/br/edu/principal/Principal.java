package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int anoAtual; int anoNascimento; int idadeAtual; int idade2050;
		System.out.print("Ano de atual: ");
		anoAtual = scanner.nextInt();
		System.out.print("Ano de nascimento: ");
		anoNascimento = scanner.nextInt();
		idadeAtual = anoAtual - anoNascimento;
		idade2050 = 2050 - anoNascimento;
		System.out.println("idade atual: " + idadeAtual);
		System.out.println("idade em 2050: " + idade2050);
	}
}
