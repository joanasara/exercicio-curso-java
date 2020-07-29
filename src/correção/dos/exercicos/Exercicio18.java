package correção.dos.exercicos;


import java.util.Locale;
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o valor do seu salario ");
		double salario = leia.nextDouble();
		
		System.out.println("digite o percentual do reajuste");
		double percenTual = leia.nextDouble();
		double calc;
		double salarioAtual;
		
		calc = (percenTual * salario)/100;
		System.out.printf(" o percentual de reajuste = %.2f ", calc);
		
		System.out.println(" ");
		
		salarioAtual = calc + salario;
		
		System.out.printf("o salario atual e = %.2f ", salarioAtual);
		
		
		
		
		
		
		leia.close();
		

	}

}
