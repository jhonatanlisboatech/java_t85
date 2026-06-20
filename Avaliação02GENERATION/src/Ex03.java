import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);
		
		String matrizProdutos [][] = new String [100][3];
		
		int qtdCadastrados = 0; 
		
		
		int op = 0;
		
		do {
			
			
			System.out.println("");
			System.out.println("*** Controle de Estoque ***");
			System.out.println("");
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Listar produtos");
			System.out.println("3 - Atualizar quantidade de um produto");
			System.out.println("0 - Sair do sistema");
			System.out.println("");
			System.out.print("\nDigite a opção desejada: ");
			op = leia.nextInt();
			
			switch (op) {
			case 1: {
				
				leia.nextLine(); 
				
				matrizProdutos[qtdCadastrados][0] = String.valueOf(qtdCadastrados);

		        System.out.print("\nDigite o nome do produto: ");
		        matrizProdutos[qtdCadastrados][1] = leia.nextLine();

		        System.out.print("\nDigite a quantidade do produto: ");
		        matrizProdutos[qtdCadastrados][2] = leia.nextLine();

		        qtdCadastrados++; 

		        System.out.println("\nProduto cadastrado com sucesso!");
				
				break;
			}
			case 2: {
				
				System.out.println("\nPRODUTOS CADASTRADOS:");
				for (int i = 0; i < qtdCadastrados ; i++) {
					System.out.printf("\nCÓDIGO: %-10s | NOME: %-15s | QUANTIDADE: %-10s", matrizProdutos[i][0], matrizProdutos[i][1], matrizProdutos[i][2]);
				}
				
				System.out.println("");
				
				
				break;
			}
			case 3: {

				System.out.println("\nALTERAR QUANTIDADE DE UM PRODUTO:");
				
				
				for (int i = 0; i < qtdCadastrados ; i++) {
					System.out.printf("\nCÓDIGO: %-10s | NOME: %-15s | QUANTIDADE: %-10s", matrizProdutos[i][0], matrizProdutos[i][1], matrizProdutos[i][2]);
				}
				
				
				System.out.printf("");
				System.out.println("\nDigite o código do produto que deseja atualizar a quantidade: ");
				int codProduto = leia.nextInt();
				
				
				
				System.out.printf("");
				System.out.printf("\nDigite a quantidade atualizada do produto - %s: ", matrizProdutos[codProduto][1]);
				matrizProdutos[codProduto][2] = leia.nextLine();
				System.out.printf("\nQuantidade atualizada!");
				
				break;
			}
			case 0: {
				
				break;
			}
			
			default:
				System.out.println("Opção inválida.");
				break;
			}
			
			
			
		}while (op != 0);
		
		System.out.println("Sistema finalizado.");
		
		leia.close();
	}
	
	

}

	
