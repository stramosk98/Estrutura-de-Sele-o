package Lista2;
import java.util.Scanner;

public class Exercicio27 {
	public static void main(String[] args) {

			Scanner entrada = new Scanner (System.in);
	
			System.out.println("Dígite dois números: ");
			float n1 = entrada.nextFloat();
			float n2 = entrada.nextFloat();
			float num;
			
			System.out.println("Qual operação deseja? -, +, / ou * ");
			String ope = entrada.next();
			
			   if(ope.equals("-")){
				 System.out.println(num = (n1 - n2));
			   }else if(ope.equals("+")){
					 System.out.println(num = (n1 + n2));
			   }else if(ope.equals("/")){
						 System.out.println(num = (n1 / n2));
			   }else if(ope.equals("*")){
							 System.out.println(num = (n1 * n2));
							 
				 if (num % 2 == 1) {
						System.out.println("ímpar");
				 }else{
						System.out.println("Par");
				 }
						if (num < 0 ) {
						System.out.println("Negativo");
						}else{
						
						System.out.println("Positivo");	
				}
				}
		entrada.close();
		
	}
	}