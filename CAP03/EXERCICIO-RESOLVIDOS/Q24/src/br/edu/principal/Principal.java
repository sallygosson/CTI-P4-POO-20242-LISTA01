package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double hora; int h; double m;
	System.out.print("Digite a hora em horas e minutos: ");
	hora = scanner.nextDouble();
	h = (int) hora;
	m = hora - h;
	double conversao = (h * 60) + (m * 100);
	System.out.println("O resultado da conversão é " + conversao + " minutos.");

	}

}
