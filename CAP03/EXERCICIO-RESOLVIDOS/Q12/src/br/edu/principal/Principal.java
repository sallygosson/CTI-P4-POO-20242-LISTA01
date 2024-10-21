package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1; double num2; double r1; double r2;
		System.out.print("Digite o primeiro número: ");
		num1 = scanner.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = scanner.nextDouble();
		r1 = Math.pow(num1, num2);
		r2 = Math.pow(num2, num1);
		System.out.println("O resultado da primeira operação é " + r1);
		System.out.println("O resultado da segunda operação é " + r2);
	}
}
