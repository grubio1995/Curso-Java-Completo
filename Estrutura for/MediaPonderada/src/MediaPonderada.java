import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 *
 *         Leia 1 valor inteiro N, que representa o número de casos de teste que
 *         vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um
 *         deles com uma casa decimal. Apresente a média ponderada para cada um
 *         destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2,
 *         o segundo valor tem peso 3 e o terceiro valor tem peso 5.
 *
 */

public class MediaPonderada {

	public static void main(String args[]) {

		int loop = 0;
		double nota1, nota2, nota3 = 0.0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		loop = sc.nextInt();

		for (int i = 0; i < loop; i++) {
			
			nota1 = sc.nextDouble() * 0.2;
			nota2 = sc.nextDouble() * 0.3;
			nota3 = sc.nextDouble() * 0.5;
			
			System.out.printf("%.1f%n", nota1 + nota2 + nota3);
		}

		sc.close();
	}

}
