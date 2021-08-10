import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 *
 *         Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial
 *         de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por
 *         definição, fatorial de 0 é 1.
 *
 */

public class Fatorial {

	public static void main(String[] args) {

		int loop;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		loop = sc.nextInt();
		int fat = 1;

		for (int i = 1; i <= loop; i++) {
			fat = fat * i;
		}

		System.out.println(fat);

		sc.close();
	}
}
