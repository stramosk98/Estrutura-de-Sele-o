package Lista2;
import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite dois n�meros: ");
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		
		if(n1 > n2) {
			System.out.println("O maior n�mero �: " + n1);
		}
		else if(n2 > n1) {
			System.out.println("O maior n�mero �: " + n2);
		}else {
			System.out.println("S�o iguais");
		}
		
		entrada.close();
}
}