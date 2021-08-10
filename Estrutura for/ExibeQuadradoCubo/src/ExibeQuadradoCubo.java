import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 *
 *         Fazer um programa para ler um número inteiro positivo N. O programa
 *         deve então mostrar na tela N linhas, começando de 1 até N. Para cada
 *         linha, mostrar o número da linha, depois o quadrado e o cubo do
 *         valor, conforme exemplo.
 *
 */

public class ExibeQuadradoCubo {

	public static void main(String[] args) {

		int loop;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		loop = sc.nextInt();

		for (int i = 1; i <= loop; i++) {
			System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));
		}

		sc.close();
	}
}
