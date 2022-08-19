package Lista2;
import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {

			Scanner entrada = new Scanner (System.in);
	
			System.out.println("Dígite um número: ");
			float n = entrada.nextFloat();
			float n1 = Math.round(n);
			
			if(n1 == n) {
				System.out.println("É um número inteiro!");
			
			}else {
				System.out.println("É um número decimal!");
			}
			
		entrada.close();	
	}
	}