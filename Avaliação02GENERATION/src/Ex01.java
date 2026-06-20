import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		
	ArrayList<Integer> listaNum = new ArrayList<Integer>();
		
		System.out.println("*** Coleção de Números e Análise ***");
		
		
		listaNum.add(2);
		listaNum.add(5);
		listaNum.add(8);
		listaNum.add(3);
		listaNum.add(10);

		percorre(listaNum); 

	}

	
	public static void percorre(ArrayList<Integer> listaNum) {

		
		int soma = 0, maiorValor, contador = 0;
		double media;

		
		maiorValor = listaNum.get(0);
		
		
		for (int i : listaNum) {
			
			if (i >= maiorValor) {
				maiorValor = i;
				 }


			contador++; 
			soma += i; 

			}

		media = (float) soma / contador; 

		System.out.printf("\nSoma: %d; | Média: %.1f | Maior valor: %d", soma, media, maiorValor); 

	}

}

	
