package matrizes;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int[] vet = new int[6];
		
		
		for(int i=0; i<vet.length; i++) {
			System.out.println("Digite um valor na posi��o " + i);
			vet[i] = leia.nextInt();
		}
		
		System.out.println(" ");
		
		for(int i=0; i<vet.length; i++) {
			System.out.println("A posi��o " + i + " = " + vet[i]);
		}
		
		
		
		
		
		leia.close();

	}

}
