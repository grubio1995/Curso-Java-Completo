import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 *
 *         Leia um valor inteiro N. Este valor será a quantidade de valores
 *         inteiros X que serão lidos em seguida. Mostre quantos destes valores
 *         X estão dentro do intervalo [10,20] e quantos estão fora do
 *         intervalo, mostrando essas informações conforme exemplo (use a
 *         palavra "in" para dentro do intervalo, e "out" para fora do
 *         intervalo).
 */

public class Intervalo {

	public static void main(String[] args) {

		int loop, contIn, contOut;

		loop = contIn = contOut = 0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		loop = sc.nextInt();

		for (int i = 0; i < loop; i++) {

			int num = sc.nextInt();

			if (num >= 10 && num <= 20)
				contIn++;
			else
				contOut++;
		}

		System.out.println(contIn + " in");
		System.out.println(contOut + " out");

		sc.close();
	}
}
