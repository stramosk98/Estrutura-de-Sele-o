package lista2;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite os tr�s lados de um tri�ngulo: ");
		float n1 = entrada.nextFloat();
		float n2 = entrada.nextFloat();
		float n3 = entrada.nextFloat();
		
		if (n1 == n2 && n1 == n3 && n2 == n3) {
			System.out.println("� um Tri�ngulo Equil�tero");
		}else if (n1 == n2 || n1 == n3 || n2 == n3) {
			System.out.println("� um Tri�ngulo Is�sceles");
		}else if (n1 != n2 && n1 != n3 && n2 != n3) {
			System.out.println("� um Tri�ngulo Escaleno");
		}else {
			System.out.println("Valor inv�lido");
		}
		entrada.close();
	}

}