package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double custo; double convite; double qtd;
	System.out.print("Digite o custo do espetáculo: ");
	custo = scanner.nextDouble();
	System.out.print("Digite o preço do convite: ");
	convite = scanner.nextDouble();
	qtd = custo / convite;
	System.out.println("A quantidade de convites que devem ser vendidos é de " + qtd);

	}

}