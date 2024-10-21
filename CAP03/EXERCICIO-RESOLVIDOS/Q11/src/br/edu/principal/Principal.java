package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num; double quad; double cubo; double r2; double r3;
		System.out.print("Digite um número: ");
		num = scanner.nextDouble();
		quad = num * num;
		cubo = num * num * num;
		r2 = Math.sqrt(num);
		r3 = Math.cbrt(num);
		System.out.println("O quadrado do número é " + quad);
		System.out.println("O cubo do número é " + cubo);
		System.out.println("A raiz quadrada do número é " + r2);
		System.out.println("A raiz cúbica do número é " + r3);

	}

}
