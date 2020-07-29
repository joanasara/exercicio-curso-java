package correção.dos.exercicos;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de votos brancos");
		int votosBranco = leia.nextInt();
		
		System.out.println("Digite a quantidade de votos nulos");
		int votosNulo = leia.nextInt();
		
		System.out.println("Digite a quantidade de votos validos");
		int votosValidos = leia.nextInt();
		int calc;
		double percentual;
		
		calc = votosBranco + votosNulo +  votosValidos;
		System.out.println(" O total de eleitores no municipio = " + calc);
		
		percentual = (votosBranco * calc) /100;
		
		System.out.printf("O percetual de eleitores que votaram em branco = %.2f ", percentual);
		
		System.out.println(" ");
		percentual = (votosNulo * calc)/100;
		
		System.out.printf("O percetual de eleitores que votaram nulo = %.2f ", percentual);
		
		System.out.println(" ");
		percentual = (votosValidos * calc)/100;
		System.out.printf("O percetual de eleitores que votaram valido = %.2f ", percentual);
		
		
      leia.close();
	}

}
