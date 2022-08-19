package Lista2;
import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[] args) {

			Scanner entrada = new Scanner (System.in);
			
			int clas = 0;
			String r = "";
			System.out.println("Responda apenas 'SIM' ou 'NÃO' para as perguntas");
			
			System.out.println("Telefonou para a vítima?");
			 r = entrada.nextLine();
			if (r.equals("SIM")) {
				clas++;}
			
			System.out.println("Esteve no local do crime?");
			 r = entrada.nextLine();
			if (r.equals("SIM")) {
				clas++;}
			
			System.out.println("Mora perto da vítima?");
			 r = entrada.nextLine();
			if (r.equals("SIM")) {
				clas++;}	
			
			System.out.println("Devia para a vítima?");
				 r = entrada.nextLine();
			if (r.equals("SIM")) {
					clas++;}
	
			System.out.println("Já trabalhou com a vítima?");
			if (r.equals("SIM")) {
				clas++;}
			
			entrada.nextLine();
			
			if(clas == 2) {
				r = "Suspeita!";
			}else if(clas >= 3 && clas <= 4) {
				r = "Cúmplice!";
			}else if(clas == 5) {
				r = "Assassino!";
			}else {
				r = "Inocente!";
			}
			
			System.out.println("Classificação: " + r);
			
		entrada.close();
	}
	}