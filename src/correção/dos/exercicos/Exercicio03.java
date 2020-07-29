package correção.dos.exercicos;


import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
	      Scanner leia =  new Scanner (System.in);
		
		
		System.out.println("Digite o primeiro numero");
		int primeiroNum = leia.nextInt();
		
		System.out.println("Digite o segundo numero");
		int segundoNum = leia.nextInt();
		
		int  soma = primeiroNum + segundoNum;
		System.out.println("A soma entre os dois numero: " + soma);
		
		
      leia.close();
	}

}
