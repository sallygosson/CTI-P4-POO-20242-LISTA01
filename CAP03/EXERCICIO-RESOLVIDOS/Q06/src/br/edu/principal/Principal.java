package br.edu.principal;
import java.util.Scanner;
class Principal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double sal; double salReceber; double grat; double imposto;
		System.out.print("Digite seu salário base: ");
		sal = scanner.nextDouble();
		grat = sal * 5/100;
		imposto = sal * 7/100;
		salReceber = sal + grat - imposto;
		System.out.println("O seu salário com a gratificação e descontando os impostos é " + salReceber);
	}

}
