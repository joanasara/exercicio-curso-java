package correção.dos.exercicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o custo de fábrica de um carro ");
		double custoFabrica = leia.nextDouble();
		int imposto = 45;
		int distribuidor = 28;
		double somaImposto;
		double somaDitri;
        double carroNovo;
		
		System.out.printf("O custo do carro na fabrica = %.3f", custoFabrica);
		System.out.println(" ");
		System.out.println("O percentual do imposto = " + imposto + "% ");
		System.out.println("O percentual do distribuidor = " + distribuidor + "% ");
		
		somaImposto = (imposto * custoFabrica)/100;
		somaDitri = (distribuidor * custoFabrica)/100;
		
		System.out.printf("O valor do imposto = %.3f ", somaImposto);
		System.out.println(" ");
		System.out.printf("O valor do distribuidor = %.3f ", somaDitri);
		System.out.println(" ");
		carroNovo = custoFabrica + somaDitri + somaImposto;
		
		System.out.printf("O custo final do carro para o cosumidor =%.3f ", carroNovo);
		
		
		
		
		
		
		leia.close();
	}

}
