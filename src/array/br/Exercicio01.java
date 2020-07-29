package array.br;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia =new Scanner(System.in);

		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um valor na posição " + i);
			vetorA[i] = leia.nextInt();
			vetorB[i] = vetorA[i] * 2;

		}
		System.out.println("VetorA");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");

		}
		System.out.println("........................");

		System.out.println("VetorB");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");

		}

		leia.close();

	}
}
