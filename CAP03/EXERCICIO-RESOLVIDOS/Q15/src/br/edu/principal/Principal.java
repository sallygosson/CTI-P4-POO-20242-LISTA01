package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double pFab; double percD; double percI; double vlrD; double vlrI; double pFinal;
		System.out.print("Digite o preço de fábrica: ");
		pFab = scanner.nextDouble();
		System.out.print("Digite o percentual de lucro do distribuidor: ");
		percD = scanner.nextDouble();
		System.out.print("Digite o percentual de imposto: ");
		percI = scanner.nextDouble();
		vlrD = pFab * percD / 100;
		vlrI = pFab * percI/100;
		pFinal = pFab + vlrD + vlrI;
		System.out.println("O valor do distribuidor é " + vlrD);
		System.out.println("O valor dos impostos é " + vlrI);
		System.out.println("O valor do final do carro é " + pFinal);
	}
}
