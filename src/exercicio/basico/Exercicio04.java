package exercicio.basico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Em que turno voc~e estuda");
		String turno = leia.next();
		
		
		switch(turno) {
		case "m":
		case "M": System.out.println("Bom dia");break;
		case "v":
		case "V": System.out.println("Boa tarde");break;
		case "n": 
		case "N": System.out.println("Boa noite");break;
		
		default: System.out.println("valor invalido");
		}
		
		
		leia.close();
		
	}

}
