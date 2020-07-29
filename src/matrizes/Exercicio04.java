package matrizes;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] vet = new int[6];
		
		vet[0] =  1;
		vet[1] =  0;
		vet[2] =  5;
		vet[3] =  -2;
		vet[4] =  -5;
		vet[5] =  7;
		
		
		for(int i=0; i<vet.length; i++) {
			System.out.println("A posição " + i + " = " + vet[i]);
			
		}
		
		int soma = 0;
		for(int i=0; i<vet.length; i++) {
			soma=  vet[0] + vet[1]  + vet[5];
		}
		System.out.println(" ");
		
		vet[3] = 100;
		for(int i=0; i<vet.length; i++) {
			System.out.println("A posição " + i + " = " + vet[i]);
			
		}
		System.out.println(" ");
		System.out.println("A soma dos vetores selecionados = " + soma);
		
		
		
		
		
		
		
		
		leia.close();

	}

}
