package exercicio.basico;

import java.util.Locale;
import java.util.Scanner;

public class ReajusteDeSalario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o valor do salario");
		double salario = leia.nextDouble();
		double percentual;

		System.out.println("O salario informado = " + salario);

		double aumento;
		double salarioAjustado;

		if (salario <= 280) {
			percentual = 20;
			aumento = (salario / 100) * percentual;
			salarioAjustado = salario + aumento;
			System.out.println("O valor do aumento foi =  " + percentual);
			System.out.println("O valor do aumento foi =  " + aumento);
			System.out.println("Salario reajustado " + salarioAjustado);

		} else if (salario > 280 && salario <= 700) {
			percentual = 15;
			aumento = (salario / 100) * percentual;
			salarioAjustado = salario + aumento;
			System.out.println("O percentual de aumento aplicado foi de 15% ");
			System.out.println("O valor do aumento foi =  " + aumento);
			System.out.println("Salario reajustado " + salarioAjustado);

		} else if (salario > 700 && salario <= 1500) {
			percentual = 10;
			aumento = (salario / 100) * percentual;
			salarioAjustado = salario + aumento;
			System.out.println("O percentual de aumento aplicado foi de 10% ");
			System.out.println("O valor do aumento foi =  " + aumento);
			System.out.println("Salario reajustado " + salarioAjustado);

		} else if (salario > 1500) {
			percentual = 5;
			aumento = (salario / 100) * percentual;
			salarioAjustado = salario + aumento;
			System.out.println("O percentual de aumento aplicado foi de 5% ");
			System.out.println("O valor do aumento foi =  " + aumento);
			System.out.println("Salario reajustado " + salarioAjustado);

		}

		leia.close();
	}

}
