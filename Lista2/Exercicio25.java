package Lista2;
import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Dígite um número inteiro: ");
		int num = entrada.nextInt();
			
		if(num % 2 == 1){
				System.out.println("ímpar");
		}else{
				System.out.println("Par");	
		}
		
	entrada.close();
}
}