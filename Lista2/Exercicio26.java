package Lista2;
import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {

			Scanner entrada = new Scanner (System.in);
	
			System.out.println("D�gite um n�mero: ");
			float n = entrada.nextFloat();
			float n1 = Math.round(n);
			
			if(n1 == n) {
				System.out.println("� um n�mero inteiro!");
			
			}else {
				System.out.println("� um n�mero decimal!");
			}
			
		entrada.close();	
	}
	}