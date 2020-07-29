package array.br;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i =0; i<vetorA.length; i++) {
			System.out.println("Digite o valor da  posição " +  i);
			vetorA[i] = leia.nextInt();
			vetorB[i] = vetorA[i] * i;
		}
		System.out.println("vetorB");
		DecimalFormat ft = new DecimalFormat("###,###.##");
		
		for(int i =0; i<vetorB.length; i++) {
			System.out.println(ft.format(vetorB[i]) + " ");
		}
		
		
		
		
		
		leia.close();

	}

}
