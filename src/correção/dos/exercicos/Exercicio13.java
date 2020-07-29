package correção.dos.exercicos;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valos do numA ");
		int numA = leia.nextInt();

		System.out.println("Digite o valos do numB ");
		int numB = leia.nextInt();

		if (numA != numB && numA > numB) {
			System.out.println("SÃO DIFERENTES");
			System.out.println("numA e maior " + numA);
			System.out.println("numB e menor " + numB);
		} else if (numA != numB && numB > numA) {
			System.out.println("SÃO DIFERENTES");
			System.out.println("numB e maior " + numB);
			System.out.println("numA e menor " + numA);

		} else if (numA == numB) {
			System.out.println("SÃO IGUAIS");
			System.out.println("numA = " + numA);
			System.out.println("numB = " + numB);
		
		}
     
		
		leia.close();
	}
}
