package aula_04repeticoes;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int numero = 1, somaMultiplos = 0, mediaNumeros = 0, quantidadeMultiplos = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
		
			if(numero % 3 == 0 && numero != 0) {
				somaMultiplos = somaMultiplos + numero;
				quantidadeMultiplos++;
			}
			
		}while(numero != 0);
	
		mediaNumeros = somaMultiplos/quantidadeMultiplos;
		
		System.out.printf("\nA média de todos os números múltiplos de 3 é: %d", mediaNumeros);
	

		leia.close();
	}
}

	
