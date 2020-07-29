package array.br;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
       int[] vetorA = new int[10];
       int[] vetorB = new int[10];
       int[] vetorC = new int[10];
       
       
       for(int i =0; i<vetorA.length; i++) {
    	   System.out.println("Digite o valor da posição "+  i);
    	   vetorA[i] = leia.nextInt();
    	   vetorB[i] = leia.nextInt();
    	   vetorC[i] = vetorA[i] + vetorB[i];
       }
       System.out.println(".................................");
       
       
       System.out.println("VetorB");
       for(int i= 0; i<vetorB.length; i++) {
    	   System.out.println(vetorB[i]);
       }
       
       System.out.println("VetorC");
       for(int i= 0; i<vetorC.length; i++) {
    	   System.out.println(vetorC[i]);
       }
       
       
       leia.close();
	}

}
