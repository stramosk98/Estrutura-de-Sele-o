package lista2;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite duas notas: ");
		float n1 = entrada.nextFloat();
		float n2 = entrada.nextFloat();
		float media = (n1 + n2) / 2;
		
		if (media <= 3 && media > 0) {
			System.out.println("REPROVADO!");
		}else if(media > 3 && media < 7) {
			System.out.println("EM EXAME!");
		}else if(media >= 7 && media <= 10) {
			System.out.println("APROVADO!");
		}else {
			System.out.println("Valor inválido");
		}
		
		
		entrada.close();
	}

}