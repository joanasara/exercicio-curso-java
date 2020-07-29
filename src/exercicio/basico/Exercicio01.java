package exercicio.basico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int num1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero");
		int num2 = leia.nextInt();
		
		System.out.println("Digite o terceiro numero");
		int num3 = leia.nextInt();
		
		
		
		
		
		
		if(num1 > num2 && num1 > num3) {
			 System.out.println("Primeiro numero e maior");
			
		}
		else if(num2 > num1 && num2 > num3 ) {
			 System.out.println("Segundo numero e maior");
			 
		}
		else if(num3 > num1 && num3 > num2) {
			 System.out.println("Terceiro numero e maior");
		}
		
		
		
		
       leia.close();
	}

}
