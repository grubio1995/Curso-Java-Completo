import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 *
 *         Ler um número inteiro N e calcular todos os seus divisores.
 *
 */

public class Divisores {

	public static void main(String[] args) {

		int num;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			if(num % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}
}
