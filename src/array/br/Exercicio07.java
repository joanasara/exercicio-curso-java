package array.br;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] vet = new int[10];
		
		for(int i = 0; i<vet.length; i++) {
			System.out.println("digite o valor na posição " + i);
			vet[i] = leia.nextInt();
			
		}
		 int quantidade =  0;
		for(int i = 0; i<vet.length; i++) {
			if(vet[i]% 2 ==0) {
				quantidade ++;
				
			}
			
		}
		
		System.out.println("A quantidade de numeros pares "+ quantidade);
		
		
        leia.close();
	}

}
