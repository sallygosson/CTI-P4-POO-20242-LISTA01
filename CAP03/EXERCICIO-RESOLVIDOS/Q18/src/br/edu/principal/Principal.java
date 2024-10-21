package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double pesoSaco; double racaoGato1; double racaoGato2; double totalFinal;
		System.out.print("Digite o peso do saco de ração em kg: ");
		pesoSaco = scanner.nextDouble();
		System.out.print("Digite a quantidade de ração que será dada para o gato1 (g): ");
		racaoGato1 = scanner.nextDouble();
		System.out.print("Digite a quantidade de ração que será dada para o gato2 (g): ");
		racaoGato2 = scanner.nextDouble();
		racaoGato1 = racaoGato1 / 1000;
		racaoGato2 = racaoGato2 / 1000;
		totalFinal = pesoSaco - 5 * (racaoGato1 + racaoGato2);
		System.out.println("O peso do saco depois de 5 dias é " + totalFinal + "kg");
		
		
		}

}