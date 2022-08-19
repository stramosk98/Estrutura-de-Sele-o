package lista2;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		String conceito = "";
		System.out.println("Digite duas notas: ");
		float n1 = entrada.nextFloat();
		float n2 = entrada.nextFloat();
		float media = (n1 + n2) / 2;
		
		if (media >= 9 && media >= 10) {
			conceito = "A";
		}else if(media >= 7.5 && media < 9) {
			conceito = "B";
		}else if(media >= 6 && media < 7.5) {
			conceito = "C";
		}else if(media >= 4 && media < 6) {
			conceito = "D";
		}else if(media >= 0 && media < 4) {
			conceito = "E";
		}else {
			System.out.println("Valor inválido");
		}
		
		System.out.println("Notas do usúario: " + n1 +" e "+ n2 + " média: " + media + " conceito: " + conceito);
		if(conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
			System.out.println("APROVADO!");
			
		}else if(conceito.equals("D") || conceito.equals("E")) {
				System.out.println("REPROVADO!");
		}
		
		
		entrada.close();
	}

}