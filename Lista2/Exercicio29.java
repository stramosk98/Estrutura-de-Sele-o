package Lista2;
import java.util.Scanner;

public class Exercicio29 {
	public static void main(String[] args) {

			Scanner entrada = new Scanner (System.in);
			
			float l = 0; 
			double desc, tot = 0;
			System.out.println("Quantos litros foram vendidos?");
			l = entrada.nextFloat();
			System.out.println("Qual tipo? A-alcool ou G-gasolina");
			entrada.nextLine();
			String tip = entrada.nextLine();
			
			if(tip.equals("A")) {
				tot = (l * 1.90);
				if(l <= 20) {
					desc = tot * 0.03;
					tot -= desc;
				}else if(l > 20) {
					desc = tot * 0.05;
					tot -= desc;
				}
				System.out.println("Valor a ser pago pelo cliente: " + tot);
				
			}else if(tip.equals("G")) {
				if(l <= 20) {
					desc = tot * 0.04;
					tot -= desc;
				}else if(l > 20) {
					desc = tot * 0.06;
					tot -= desc;
				}
				System.out.println("Valor a ser pago pelo cliente: " + tot);
			}
			
		entrada.close();
	}
	}