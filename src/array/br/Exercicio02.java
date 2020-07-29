package array.br;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor da posição " + i);
			vetorA[i] = leia.nextInt();
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		System.out.println("VetorB");

		for (int i = 0; i < vetorB.length; i++) {
			System.out.println(vetorB[i] + " ");

		}

		leia.close();

	}

}
