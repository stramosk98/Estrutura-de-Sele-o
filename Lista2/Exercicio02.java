package Lista2;
import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite dois n�meros: ");
		int n1 = entrada.nextInt();
		
		if(n1 > 0) {
			System.out.println("O n�mero: " + n1 + " � positivo");
		}
		else if(n1 < 0) {
			System.out.println("O n�mero: " + n1 + " � negativo");
		}else {
			System.out.println("N�mero zero");
		}
		
		entrada.close();
}
}