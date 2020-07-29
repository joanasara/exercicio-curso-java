package array.br;

import java.util.Scanner;

public class Exercicio06 {

	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		   int[] vetorA = new int[10];
	       int[] vetorB = new int[vetorA.length];
	       int[] vetorC = new int[vetorA.length];
		
		
		for(int i = 0; i<vetorA.length; i++) {
			 System.out.print("Digite o valor da posição "+ i);
			 vetorA[i] = leia.nextInt();
		}
		
		for(int i = 0; i<vetorB.length; i++) {
			 System.out.print("Digite o valor da posição B "+ i);
			 vetorB[i] = leia.nextInt();
		}
		for(int i = 0; i<vetorC.length; i++) {
			  vetorC[i] = vetorA[i] - vetorB[i];
			  System.out.print(vetorC[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		leia.close();
		

	}

}
