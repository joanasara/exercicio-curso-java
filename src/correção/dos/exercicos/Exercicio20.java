package correção.dos.exercicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor do salario fixo");
		int salario = leia.nextInt();
		
		System.out.println("Digite a quantidade de carro vendidos");
		int qtdCarro = leia.nextInt();	
		
		double valorTotalVendas;
		valorTotalVendas = qtdCarro * 5;
		
		double carroVendido = (valorTotalVendas * qtdCarro)/100;
		double  salarioFinal = (carroVendido * qtdCarro) + salario; 
		
		System.out.println("O salario fixo = "+ salario);
		System.out.println("Quantidade de carros vendidos = " + qtdCarro);
		System.out.println("O valor total das vendas = " + valorTotalVendas);
		System.out.println("O valor recebido por cada carro vendido = " + carroVendido);
		System.out.println("O salario final do vendedor = " + salarioFinal);
		
		
		
		
		
		
		leia.close();
	}

}
