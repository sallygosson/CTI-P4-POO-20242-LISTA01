package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double num; int inteiro; double fracional; double a;
	System.out.print("Digite um número real: ");
	num = scanner.nextDouble();
	inteiro = (int) num;
	fracional = num - inteiro;
	a = Math.round(num);
	System.out.println("O valor inteiro é " + inteiro);
	System.out.println("O valor fracional é " + fracional);
	System.out.println("O valor arrendondado é " + a);

	}

}