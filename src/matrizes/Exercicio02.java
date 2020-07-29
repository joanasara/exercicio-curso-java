package matrizes;

import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		
		
		int[][] vets = new int [4][4];
		
		Random numeroRando = new Random();
		
		for(int i=0; i<vets.length; i++) {
			
			 for(int j=0; j<vets[i].length; j++) {
				vets[i] [j] = numeroRando.nextInt(100);
			}
		}
		
		int maior = Integer.MIN_VALUE;
		int linha = 0;
		int coluna = 0;
		
		for(int i=0; i<vets.length; i++) {
			
			 for(int j=0; j<vets[i].length; j++) {
				if(vets[i][j] > maior){
				maior = vets[i][j];
				linha = i;	
				coluna = j;	
				}
			}
		}
		System.out.println("O maior valor = " + maior);
		System.out.println("A linha e = " + linha);
		System.out.println("A coluna e = " + coluna);
		
		
		leia.close();

	}

}
