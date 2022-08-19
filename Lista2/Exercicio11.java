package lista2;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o turno que você estuda(M, V, N): ");
		String s = entrada.nextLine();
		if(s.equals("M")) {
			System.out.println("Você estuda no periodo da manha");
		}else if(s.equals("V")) {
			System.out.println("Você estuda no periodo da tarde");
		}else if(s.equals("N")){
			System.out.println("Você estuda no periodo da noite");
		}else {
			System.out.println("Tente novamente");
		}
		
		
		entrada.close();
	}

}