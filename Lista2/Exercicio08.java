package Lista2;
import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		
		System.out.println("Digite dois números: ");
		float n1 = entrada.nextFloat();
		float n2 = entrada.nextFloat();
		float med = 0;
		med = (n1 + n2) / 2;
		
		if (med >= 7){
			System.out.println("Aprovado! Media: " + med);
		}
		else if (med < 7){
			System.out.println("Reprovado! Media: " + med);
		}
		entrada.close();
	}
}
