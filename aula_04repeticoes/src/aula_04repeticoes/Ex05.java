package aula_04repeticoes;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int numero = 1, somaPositivos = 0;
		
			do {
				System.out.print("Digite um número: ");
				numero = leia.nextInt();
				
			if(numero >=0)
				somaPositivos = (somaPositivos+numero);
	
				
			}while(numero ++ != 0);
		
		
		System.out.printf("\nA soma dos números positivos é: %d", somaPositivos);
		
		leia.close();
	}

}

	
