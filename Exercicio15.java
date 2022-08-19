package lista2;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		String or = "";
		System.out.println("Digite o preço de custo e o código de origem ");
		float pc = entrada.nextFloat();
		int cod = entrada.nextInt();
		if(cod == 1) {
			or = "Sul";
		}else if(cod == 2) {
			or = "Norte";
		}else if(cod == 3) {
			or = "Leste";
		}else if(cod == 4) {
			or = "Oeste";
		}else if(cod == 5 || cod == 6) {
			or = "Nordeste";
		}else if(cod == 7 || cod == 8) {
			or = "Centro-oeste";
		}else {
			or = "Importado";
		}
		System.out.println("Preço do produto: R$" + pc + ", Origem: " + or);
		
		entrada.close();
	}

}