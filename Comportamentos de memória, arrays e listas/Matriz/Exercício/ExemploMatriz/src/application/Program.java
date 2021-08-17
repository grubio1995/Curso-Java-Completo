package application;

import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 * 
 *         Fazer um programa para ler dois números inteiros M e N, e depois ler
 *         uma matrizriz de M linhas por N colunas contendo números inteiros,
 *         podendo haver repetições. Em seguida, ler um número inteiro X que
 *         pertence à matrizriz. Para cada ocorrência de X, mostrar os valores à
 *         esquerda, acima, à direita e abaixo de X, quando houver, conforme
 *         exemplo.
 *
 */

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] matriz = new int[n][m];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		int position = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == position) {
					System.out.println("Position " + i + "," + j + ":");

					if (j > 0)
						System.out.println("Left: " + matriz[i][j - 1]);

					if (i > 0)
						System.out.println("Up: " + matriz[i - 1][j]);

					if (j < matriz[i].length - 1)
						System.out.println("Right: " + matriz[i][j + 1]);

					if (i < matriz.length - 1)
						System.out.println("Down: " + matriz[i + 1][j]);

				}
			}
		}

		sc.close();
	}
}
