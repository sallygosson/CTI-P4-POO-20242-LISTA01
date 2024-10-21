package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double salario; double cheque1; double cheque2; double cpmf1; double cpmf2; double saldo;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor do salário: ");
		salario = scanner.nextDouble();
		System.out.print("Digite o valor do primeiro cheque: ");
		cheque1 = scanner.nextDouble();
		System.out.print("Digite o valor do segundo cheque: ");
		cheque2 = scanner.nextDouble();
		cpmf1 = cheque1 * 0.38/100;
		cpmf2 = cheque2 * 0.38/100;
		saldo = salario - cheque1 - cheque2 - cpmf1 - cpmf2;
		System.out.println("O valor do saldo é: "+ saldo);
		
	}

}