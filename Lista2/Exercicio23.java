package Lista2;
import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
	
			System.out.println("Dígite três idades de alunos: ");
			int t1 = entrada.nextInt();
			int t2 = entrada.nextInt();
			int t3 = entrada.nextInt();
			int med = (t1 + t2 + t3) / 3;
			
			if(med <= 25){
				System.out.println("Turma Jovem");
			}
			else if(med > 25 && med <= 40) {
				System.out.println("Turma Adulta");
			}
			else if(med > 40) {
				System.out.println("Turma Idosa");
			}
		    
		
			entrada.close();
	
}
} 