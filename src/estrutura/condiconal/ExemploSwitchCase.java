package estrutura.condiconal;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um dia da semana valido (1-7)");

		int diaSemana = leia.nextInt();
		
		
		switch(diaSemana) {
		case 1: System.out.println("DOMIGO"); break;
		case 2: System.out.println("SEGUNDA FEIRA"); break;
		case 3: System.out.println("TERÇA FEIRA"); break;
		case 4: System.out.println("QUARTA FEIRA"); break;
		case 5: System.out.println("QUINTA FEIRA"); break;
		case 6: System.out.println("SEXTA FEIRA"); break;
		case 7: System.out.println("SABADO"); break;
		default: System.out.println("não e uma dia da semana valido"); //SERVE CASO NENHUMA CASE FOR VERDADEIRO
		}
		
		
		
		
		
		
     leia.close();
	}

}
