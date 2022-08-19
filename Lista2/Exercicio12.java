package Lista2;
import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
  
	        System.out.println("Informe seu salario: ");
	        float sal = entrada.nextFloat();
	 
	        if (sal <= 280) {
	             System.out.println("Seu salario de " + sal + " recebeu um aumento de 20%, e passou para: " + (sal + (0.2 * sal))); 
	        }
	        else if (sal > 280 && sal <= 700) {
	            System.out.println("Seu salario de " + sal + " recebeu um aumento de 15%, e passou para: " + (sal + (0.15 * sal)));
	        }
	        else if (sal > 700 && sal <= 1500) {
	 	        System.out.println("Seu salario de " + sal + " recebeu um aumento de 10%, e passou para: " + (sal + (0.10 * sal)));
	        }
	        else if (sal > 1500) {
	 	 	    System.out.println("Seu salario de " + sal + " recebeu um aumento de 5%, e passou para: " + (sal + (0.05 * sal)));
	        }	     
	        
	        entrada.close();
}
}