package matrizes;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] vet = new int[10];

		for (int i = 0; i < vet.length; i++) {
			System.out.println("posição " + i);
			vet[i] = leia.nextInt();
		}

		for(int j=10; j>vet.length; j--) {
			System.out.println("posição " + j);
			vet[j] = leia.nextInt();
		}

		for (int i = 0; i < vet.length; i++) {
			System.out.println("posição " + i + "= " + vet[i] );
		}
				
				
				
		leia.close();
	}

}
