package Lista2;
import java.util.Scanner;

public class Exercicio30 {
	public static void main(String[] args) {

			Scanner entrada = new Scanner (System.in);
			double tot1 = 0, tot2 = 0, tot3;
			System.out.println("Escreva a quantidade em Kgs de morangos e maças adquiridas: ");
			float m1 =  entrada.nextFloat();
			float m2 = entrada.nextFloat();
			
			if (m1 <= 5) {
				tot1 = m1 * 2.50;
			}
			else if(m1 > 5) {
				tot1 = m1 * 2.20;
			}
			if (m2 <= 5) {
				tot2 = m2 * 1.80;
			}
			else if(m2 > 5) {
				tot2 = m2 * 1.50;
			}
			tot3 = tot1 + tot2;
			
			if((m1 + m2) > 8 || tot3 > 25) {
				double desc = (tot3 * 0.10);
				tot3 -= desc;
			}
			System.out.println("Total a pagar: " + tot3);
			
		entrada.close();
	}
	}