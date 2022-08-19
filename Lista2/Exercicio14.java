package lista2;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número correspondente a um dia da semana: ");
		int s = entrada.nextInt();
		if(s == 1) {
			System.out.println("Domingo");
		}else if(s == 2) {
			System.out.println("Segunda-Feira");
		}else if(s == 3) {
			System.out.println("Terça-Feira");
		}else if(s == 4) {
			System.out.println("Quarta-Feira");
		}else if(s == 5) {
			System.out.println("Quinta-Feira");
		}else if(s == 6) {
			System.out.println("Sexta-Feira");
		}else if(s == 7) {
			System.out.println("Sabádo");
		}else {
			System.out.println("Valor Inválido");
		}
		
		
		entrada.close();
	}

}