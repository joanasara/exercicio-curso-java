package matrizes;

public class Exercicio01 {

	public static void main(String[] args) {

		double[][] notasAlunos = new double[3][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 8;
		notasAlunos[0][2] = 7;
		notasAlunos[0][3] = 4;

		notasAlunos[1][0] = 10;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 4;

		notasAlunos[2][0] = 10;
		notasAlunos[2][1] = 8;
		notasAlunos[2][2] = 7;
		notasAlunos[2][3] = 4;

		for (int i = 0; i < notasAlunos.length; i++) {

			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j]);
			}

			System.out.println(" ");
		}

		System.out.println("somando a media aritmatica do aluno");

		double soma;
		for (int i = 0; i < notasAlunos.length; i++) {

			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {

				soma += notasAlunos[i][j];

			}
			System.out.println("Media do aluno  "+ i + " é = " + (soma/4));

		}

	}

}
