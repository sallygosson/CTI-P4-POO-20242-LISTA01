package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		double base; double altura; double area;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor da base: ");
		base = scanner.nextDouble();
		System.out.print("Digite o valor da altura: ");
		altura = scanner.nextDouble();
		area = (base * altura) / 2;
		System.out.println("A área total do triângulo é " + area + "m²");
	}
}
