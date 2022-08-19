package lista2;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite três números: ");
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		int n3 = entrada.nextInt();
		int maior = 0, menor = 0;
		if(n1 > n2 && n2 > n3) {
			 maior = n1;
		}else{
			 menor = n1;
		}
		if(n2 > n1 && n1 > n3) {
			 maior = n2;
		}else{
			 menor = n2;
		}
		if(n3 > n1 && n1 > n2) {
			 maior = n3;
		}else{
			 menor = n3;
		}
		System.out.println("Maior: " + maior + " Menor: " + menor);
		
		entrada.close();
	}

}