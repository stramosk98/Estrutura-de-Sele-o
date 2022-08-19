package Lista2;
import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um ano(apenas 4 dígitos): ");
		int a = entrada.nextInt();
		
		if (a < 999 || a > 9999){
			System.out.println("O ano não pode conter menos ou mais que 4 dígitos");
		}
		else if(a % 4 == 0) {
			System.out.println("O ano " + a + " é bissexto");
		}
		else if(a % 4 != 0) {
			System.out.println("O ano " + a + " não é bissexto");
		}
		entrada.close();
}
}