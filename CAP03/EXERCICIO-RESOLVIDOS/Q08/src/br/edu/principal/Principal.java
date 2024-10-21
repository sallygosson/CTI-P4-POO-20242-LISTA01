package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		double aumento;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor do depósito: ");
		double deposito = scanner.nextDouble();
		System.out.print("Digite a taxa de juros: ");
		double taxa = scanner.nextDouble() / 100;
		aumento = deposito * taxa;
		System.out.println("O seu rendimento foi de R$ " + aumento + ".");
		double novoSalario =  deposito + aumento;
		System.out.println("O seu novo salário com o aumento é " + novoSalario + ".");
	}
}
