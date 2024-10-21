package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		double aumento;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o seu salário atual: ");
		double salarioAtual = scanner.nextDouble();
		System.out.print("Digite o percentual de aumento: ");
		double percentual = scanner.nextDouble() / 100;
		aumento = salarioAtual * percentual;
		System.out.println("O seu aumento foi de R$ " + aumento + ".");
		double novoSalario =  salarioAtual + aumento;
		System.out.println("O seu novo salário com o aumento é " + novoSalario + ".");
	}
}
