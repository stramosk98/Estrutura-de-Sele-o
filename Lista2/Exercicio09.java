package Lista2;
import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {

	Scanner entrada = new Scanner (System.in);

		System.out.println("Dígite sua altura: ");
		float h = entrada.nextFloat();
		double pe1 = (72.7 * h) -58; 
        double pe2 = (62.1 * h) -44.7; 
        String sexo;
        
		   System.out.println("Informe seu sexo F ou M:");
		   sexo = entrada.next();
	        
		   System.out.println("Informe seu peso:");
		   float p = entrada.nextFloat();
			
			System.out.println("Sua altura: " + h);
			System.out.println("Seu peso: " + p);
			
			 if (sexo.equals("M")) { 
					System.out.println("Sexo: Masculino");
			}
			 else if(sexo.equals("F")) {
				 System.out.println("Sexo: Feminino");
				}
			 
		        if (sexo.equals("M")) { 
					System.out.println("Seu peso ideial é: " + pe1);
					}
		        else if(sexo.equals("F")) {
					 System.out.println("Seu peso ideial é: " + pe2);
					}
		        
		        if (pe1 > p) { 
		        	 System.out.println("A baixo do peso");
					}
		        else if(pe1 < p) {
		        		 System.out.println("A cima do peso");
		        	}
		        
		       
		entrada.close();
	}
	}