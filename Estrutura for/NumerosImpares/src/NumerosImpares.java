import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 *
 *         Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os
 *         ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
 *
 */

public class NumerosImpares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int loop;

		loop = sc.nextInt();

		for (int i = 0; i <= loop; i++) {
			
			if(i % 2 != 0)
				System.out.println(i);
		}

		sc.close();
	}

}
