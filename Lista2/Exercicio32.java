package Lista2;
import java.util.Scanner;

public class Exercicio32 {
	public static void main(String[] args) {

			Scanner entrada = new Scanner (System.in);
			int p = 0;
			String r = "";
			System.out.print("Responda as questões da prova apenas com (a, b, c, d, e) \nQ1: ");
			r = entrada.nextLine();
			if(r.equals("a")) {
				System.out.println("Correto");
				p++;
			}else {
				System.out.println("Errada, resposta correta (a)");
			}
			System.out.print("Q2: ");
			r = entrada.nextLine();
			if(r.equals("a")) {
				System.out.println("Correto");
				p++;
			}else {
				System.out.println("Errada, resposta correta (a)");
			}
			System.out.print("Q3: ");
			r = entrada.nextLine();
			if(r.equals("b")) {
				System.out.println("Correto");
				p++;
			}else {
				System.out.println("Errada, resposta correta (b)");
			}
			System.out.print("Q4: ");
			r = entrada.nextLine();
			if(r.equals("b")) {
				System.out.println("Correto");
				p++;
			}else {
				System.out.println("Errada, resposta correta (b)");
			}
			System.out.print("Q5: ");
			r = entrada.nextLine();
			if(r.equals("c")) {
				System.out.println("Correto");
				p++;
			}else {
				System.out.println("Errada, resposta correta (c)");
			}
			System.out.print("Q6: ");
			r = entrada.nextLine();
			if(r.equals("c")) {
				System.out.println("Correto");
				p++;
			}else {
				System.out.println("Errada, resposta correta (c)");
			}
			System.out.print("Q7: ");
			r = entrada.nextLine();
			if(r.equals("d")) {
				System.out.println("Correto");
				p++;
			}else {
				System.out.println("Errada, resposta correta (d)");
			}
			System.out.print("Q8: ");
			r = entrada.nextLine();
			if(r.equals("d")) {
				System.out.println("Correto");
				p++;
			}else {
				System.out.println("Errada, resposta correta (d)");
			}
			System.out.print("Q9: ");
			r = entrada.nextLine();
			if(r.equals("e")) {
				System.out.println("Correto");
				p++;
			}else {
				System.out.println("Errada, resposta correta (e)");
			}
			System.out.print("Q10: ");
			r = entrada.nextLine();
			if(r.equals("e")) {
				System.out.println("Correto");
				p++;
			}else {
				System.out.println("Errada, resposta correta (e)");
			}
			System.out.println("Pontuação final: " + p);
		entrada.close();
	}
	}