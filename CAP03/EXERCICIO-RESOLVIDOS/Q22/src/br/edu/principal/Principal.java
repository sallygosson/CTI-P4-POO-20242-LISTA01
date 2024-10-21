package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double salarioMinimo; double valorqW; double qtdqW; double totalqW; double totalqWDesconto;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor do salário: ");
		salarioMinimo = scanner.nextDouble();
		System.out.print("Digite a quantidade de Quilowatts: ");
		qtdqW = scanner.nextDouble();
		valorqW = salarioMinimo / 5;
		totalqW = qtdqW * valorqW;
		totalqWDesconto = totalqW - (totalqW * 15/100);
		
		System.out.println("O valor do Quilowatt é R$ " + valorqW);
		System.out.println("O valor a ser pago por essa residência é R$ " + totalqW);
		System.out.println("O valor a ser pago pela residência com o desconto é R$ " + totalqWDesconto);
		
		

	}	


}