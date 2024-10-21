package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		double raio; double area;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor do raio: ");
		raio = scanner.nextDouble();
		area = 3.1415 * raio * raio;
		System.out.println("A área total do círculo é " + area + "m²");
	}
}
