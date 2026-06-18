import java.util.Scanner;

public class ApErick {

	public static void main(String[] args) {
	
    Scanner scanner = new Scanner (System.in);
 
	System.out.println("Você tem dezoito anos? (true) ou (false)");
    boolean leia = scanner.nextBoolean();

    if (leia) {
    	
    	System.out.println("Status: Não pagarei a pensão.");
    }
    else { System.out.println("Status: Pagarei a pensão normalmente.");
    
    }
    double pensaoErick = 400.00;
    double vendaCasa = 2000.00;
    double apartamento = 1500.00;
    String pensao ="Direito até os 18 anos";
    
    


	double valorTotal = apartamento + pensaoErick;
	double sobra = vendaCasa - valorTotal;
	
	
	

	System.out.println("Após pagar a pensão e o apartameto, o que me sobra é : R$ " + sobra);
	System.out.println("O valor ofertado ao Erick é " + pensao);

    scanner.close();
	}

}
