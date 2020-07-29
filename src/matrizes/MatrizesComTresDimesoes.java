package matrizes;

public class MatrizesComTresDimesoes {

	public static void main(String[] args) {

		int[][][] matrizTridimesional = new int[3][3][3];

		for (int i = 0; i < matrizTridimesional.length; i++) {

			for (int j = 0; j < matrizTridimesional[i].length; j++) {

				for (int k = 0; k < matrizTridimesional[i][j].length; k++) {
					matrizTridimesional[i][j][k] = i + j + k;
				}
			}
		}

		int soma = 0;
		int somaPares = 0;
		int somaImpa = 0;
		for (int i = 0; i < matrizTridimesional.length; i++) {

			for (int j = 0; j < matrizTridimesional[i].length; j++) {

				for (int k = 0; k < matrizTridimesional[i][j].length; k++) {

					soma += matrizTridimesional[i][j][k];

					if (matrizTridimesional[i][j][k] % 2 == 0) {

						somaPares = matrizTridimesional[i][j][k];
					} else {
						somaImpa = matrizTridimesional[i][j][k];
					}
				}
			}
		}

		System.out.println("Soma total = " + soma);
		System.out.println("Soma pares = " + somaPares);
		System.out.println("Soma impares = " + somaImpa);

	}

}
