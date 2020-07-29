package exercicio.basico;

import java.util.Scanner;



public class Problema {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner ( System.in);
		
		System.out.println("DIGITE O DIA DA SEMANA, DO SEU TRABALHO OU FOLGA");
		String diaSemana = leia.next();
		
	
		switch (diaSemana) {
		case"1":System.out.println("Domingo");
		case"2":System.out.println("SEGUNDA");
		case"3":System.out.println("TERÇA");
		case"4":System.out.println("QUARTA");
		case"5":System.out.println("ENTREI DE FOLGA");break;
		case"6":System.out.println("folga");
		case"7":System.out.println("sabado");break;
		
	
		}
	
		
		
      leia.close();
	}

}
