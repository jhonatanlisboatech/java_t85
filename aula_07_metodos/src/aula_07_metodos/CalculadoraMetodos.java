package aula_07_metodos;

import java.util.Scanner;

public class CalculadoraMetodos {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);
				
				double numero1, numero2;
		
		System.out.println(" ***CALCULADORA BÁSICA ***");
		
		
		System.out.println("Digite o primeiro número :");
		numero2 = leia.nextDouble();
		
		
		System.out.println("Digite o segundo número :");
		numero2 = leia.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f%n",numero1, numero2, somar(numero1, numero2));
		
		leia.close();
		
		

	}
	
	public static double somar(double numero1, double numero2) {
		return numero1 + numero2;
		
	}

}
