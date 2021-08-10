import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 * 
 *         Exercício 6 - Você deve fazer um programa que leia um valor qualquer
 *         e apresente uma mensagem dizendo em qual dos seguintes intervalos
 *         ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.
 *         Obviamente se o valor não estiver em nenhum destes intervalos, deverá
 *         ser impressa a mensagem “Fora de intervalo”.
 */

public class VerificaIntervalo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valor = sc.nextDouble();

		if (valor >= 0 && valor <= 100) {

			if (valor <= 25)
				System.out.println("[0,25]");

			else if (valor <= 50)
				System.out.println("(25,50]");

			else if (valor <= 70)
				System.out.println("(50,75]");

			else
				System.out.println("(75,100]");

		}

		else
			System.out.println("Fora de intervalo");

		sc.close();

	}
}
