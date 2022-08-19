package Lista2;
import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Dígite três notas : ");
		float t1 = entrada.nextFloat();
		float t2 = entrada.nextFloat();
		float t3 = entrada.nextFloat();
		float med = (t1 + t2 + t3) / 3;
				
		if(med >= 7 && med < 10){
					System.out.println("Aprovado");
		}
		else if(med < 7) {
					System.out.println("Reprovado");
		}
		else if(med == 10) {
					System.out.println("Aprovado com distinção");
		}
	
		entrada.close();
		
	}
	}  