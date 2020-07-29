package correção.dos.exercicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o valor do Raio");
		double raio = leia.nextDouble();
		
		double pi = 3.14;
		
		double area = pi * raio * raio;
		
		
		System.out.printf("O valor da Area = %.2f ", area);
		
		
		
		
	leia.close();	
	}

}
