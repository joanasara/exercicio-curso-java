package laco.de.repeticao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero = 0;
		int impar = 0;
        int par = 0;
		for (int i = 1; i <= 10; i++) {
			numero = leia.nextInt();
			if (numero % 2 == 0) {
				par++;
			} else  {
				impar++;
			}
		}
		System.out.println("Os numero pares são  " + par);
		System.out.println("Os numero impa são " +  impar);
		
		
		
		leia.close();
	}

}
