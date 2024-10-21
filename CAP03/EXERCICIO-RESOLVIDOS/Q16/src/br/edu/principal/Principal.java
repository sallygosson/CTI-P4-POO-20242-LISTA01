package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double salarioMinimo; int horasTrabalhadas; double valorHora;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		horasTrabalhadas = scanner.nextInt();
		System.out.print("Digite o valor do salário mínimo: ");
		salarioMinimo = scanner.nextDouble();
		valorHora = salarioMinimo / 2;
		double salarioBruto = valorHora * horasTrabalhadas;
		double imposto = salarioBruto * 3/100;
		double salarioLiquido = salarioBruto - imposto;
		System.out.println("O valor do salário líquido é " + salarioLiquido);
	
	}

}
