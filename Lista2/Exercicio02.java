package Lista2;
import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite dois números: ");
		int n1 = entrada.nextInt();
		
		if(n1 > 0) {
			System.out.println("O número: " + n1 + " é positivo");
		}
		else if(n1 < 0) {
			System.out.println("O número: " + n1 + " é negativo");
		}else {
			System.out.println("Número zero");
		}
		
		entrada.close();
}
}