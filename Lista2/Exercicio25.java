package Lista2;
import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("D�gite um n�mero inteiro: ");
		int num = entrada.nextInt();
			
		if(num % 2 == 1){
				System.out.println("�mpar");
		}else{
				System.out.println("Par");	
		}
		
	entrada.close();
}
}