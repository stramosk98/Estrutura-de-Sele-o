package Lista2;
import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite uma letra(apenas minúsculas): ");
		String l = entrada.nextLine();
		
		if (l.equals("a") || l.equals("e") || l.equals("i") || l.equals("o") || l.equals("u")){
			System.out.println("A letra digitada é uma vogal");
		}
		else {
			System.out.println("A letra digitada não é uma vogal");
		}
		
		entrada.close();
}
}