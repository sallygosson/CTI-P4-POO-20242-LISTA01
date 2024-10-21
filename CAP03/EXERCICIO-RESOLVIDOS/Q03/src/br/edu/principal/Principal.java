package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		double nota1 = scanner.nextDouble();
		System.out.print("Digite o primeiro peso: ");
		int peso1 = scanner.nextInt();
		System.out.print("Digite a segunda nota: ");
		double nota2 = scanner.nextDouble();
		System.out.print("Digite o segundo peso: ");
		int peso2 = scanner.nextInt();
		System.out.print("Digite a terceira nota: ");
		double nota3 = scanner.nextDouble();
		System.out.print("Digite o terceiro peso: ");
		int peso3 = scanner.nextInt();
		
		double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
		
		System.out.println("A média ponderada das notas é " + mediaPonderada);
		
		
	}
}
