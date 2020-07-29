package matrizes;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[][] valores = new int[3][3];
		

		for (int i = 0; i < valores.length; i++) {

			for (int j = 0; j < valores[i].length; j++) {
				System.out.println("Digite o valor da posição " + i + ", " + j);
				valores[i][j] = leia.nextInt();

			}

		}
		int impar = 0;
		int pares = 0;
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				if (valores[i][j] % 2 == 0) {
					pares ++;

				} else {
					impar ++;
				}

			}

		}

		for(int i=0; i<valores.length; i++) {
			
			for(int j=0; j<valores[i].length; j++) {
				System.out.print(valores[i][j] + " ");
				System.out.print("");
			}
			
			System.out.println("");
		}
		
		System.out.println("Pares = " + pares);
		System.out.println("Impar = " + impar);
		
		
		leia.close();
	}

}
