package Lista2;
import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um ano(apenas 4 d�gitos): ");
		int a = entrada.nextInt();
		
		if (a < 999 || a > 9999){
			System.out.println("O ano n�o pode conter menos ou mais que 4 d�gitos");
		}
		else if(a % 4 == 0) {
			System.out.println("O ano " + a + " � bissexto");
		}
		else if(a % 4 != 0) {
			System.out.println("O ano " + a + " n�o � bissexto");
		}
		entrada.close();
}
}