package Lista2;
import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite 'F' para feminino, 'M' para masculino: ");
		String s = entrada.nextLine();
	
		if(s.equals("F")) {
			System.out.println("O sexo informado é Feminino");
		}
		else if(s.equals("M")) {
			System.out.println("O sexo informado é Masculino");
			
		}else {
			System.out.println("Character não reconhecido");
		}
		
		entrada.close();
}
}