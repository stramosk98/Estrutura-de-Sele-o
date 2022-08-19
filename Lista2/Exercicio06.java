package Lista2;
import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int n = entrada.nextInt();
		
		if (n % 2 == 0){
			n++; 
			System.out.println("Gerando número ímpar: " + n);
		}
		else {
			n++; 
			System.out.println("Gerando número par: " + n);
		}
		
		entrada.close();
}
}