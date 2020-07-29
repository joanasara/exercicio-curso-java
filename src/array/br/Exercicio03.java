package array.br;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		
		
		
		int[] vetorA = new  int[15];
		double[] vetorB = new  double[vetorA.length];
		
		for(int i= 0; i<vetorA.length;  i++) {
			System.out.println("Digite o valor na posição " + i);
			vetorA[i] = leia.nextInt();
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		System.out.println(".................");
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		System.out.println("vetorB ");
		for(int i =0; i<vetorB.length; i++) {
			System.out.println(df.format(vetorB[i]));
		}
		
		
		leia.close();
         
	}

}
