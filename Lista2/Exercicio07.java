package Lista2;
import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		int z = 0, y = 0, x = 0;
		
	       System.out.println("Informe três números inteiros:");
	        z = entrada.nextInt();
	        y = entrada.nextInt();
	        x = entrada.nextInt();
		if( ( x > y && x > z ) && ( y > z ) ) { 
		    System.out.println(x);
		    System.out.println(y);
		    System.out.println(z);
		}
		else if( ( x > y && x > z ) && ( z > y ) ) { 
		    System.out.println(x);
		    System.out.println(z);
		    System.out.println(y);
		}
		else if( ( y > x && y > z ) && ( x > z ) ) { 
		    System.out.println(y);
		    System.out.println(x);
		    System.out.println(z);
		}
		else if( ( y > x && y > z ) && ( z > x ) ) {
		    System.out.println(y);
		    System.out.println(z);
		    System.out.println(x);
		}
		else if( ( z > x && z > y ) && ( x > y ) ) { 
		    System.out.println(z);
		    System.out.println(x);
		    System.out.println(y);
		}
		else if( ( z > x && z > y ) && ( y > x ) ) {
			System.out.println(z);
			System.out.println(y);
		    System.out.println(x);
		}
		entrada.close();
	}
}
