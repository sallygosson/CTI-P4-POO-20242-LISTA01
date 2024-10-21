package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double alturaDegrau; double alturaTotal;
	System.out.print("Digite a altura do degrau: ");
	alturaDegrau = scanner.nextDouble();
	System.out.print("Digite a altura total: ");
	alturaTotal = scanner.nextDouble();
	double qtdDegrau = alturaTotal / alturaDegrau;
	System.out.println("Serão necessários " + qtdDegrau + " para alcançar a altura " + alturaTotal + "m");
	
	
	

	}

}