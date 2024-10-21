package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double ang; double alt; double escada; double radiano;
		System.out.print("Digite o valor do ângulo: ");
		ang = scanner.nextDouble();
		System.out.print("Digite o valor da altura da escada: ");
		alt = scanner.nextDouble();
		radiano = ang * 3.14/180;
		escada = alt / Math.sin(radiano);
		System.out.println("O tamanho da escada é " + escada + "m");
	}

}