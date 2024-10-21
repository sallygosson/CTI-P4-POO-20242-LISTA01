package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o salário do funcionário: ");
		double salario = scanner.nextDouble();
		double novoSalario = salario * 1.25;
		System.out.println("O salário com aumento é " + novoSalario);
	}
}
