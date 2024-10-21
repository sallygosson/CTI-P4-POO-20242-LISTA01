package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x; double y; double z;
		System.out.print("Digite a altura em que deseja pregar o quadro: ");
		x = scanner.nextDouble();
		System.out.print("Digite a distância em que a escada deverá ficar da parede: ");
		z = scanner.nextDouble();
		
		y = Math.sqrt(Math.pow(x, 2) + Math.pow(z, 2));
		System.out.println("A distância que o quadro ficará da parede é " + y);


	}

}
