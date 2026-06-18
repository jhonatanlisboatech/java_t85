
public class trocoPadaria {

	public static void main(String[] args) {
		 // 1. Defina os valores aqui:
        double precoPao = 4.50;
        int quantidade = 3;
        double valorPago = 20.00;

        // 2. O Java faz as contas aqui:
        double valorTotal = precoPao * quantidade; // O asterisco (*) multiplica
        double troco = valorPago - valorTotal;     // O hífen (-) subtrai

        // 3. EXIBA O RESULTADO:
        System.out.println("Valor total da compra: R$ " + valorTotal);
        // Agora complete a linha abaixo para mostrar o troco:
        System.out.println("Seu troco é: R$ " + troco );

	}

}
