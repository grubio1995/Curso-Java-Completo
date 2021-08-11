import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 *
 *         Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
 *         indeterminada de pontos no sistema cartesiano. Para cada ponto
 *         escrever o quadrante a que ele pertence. O algoritmo será encerrado
 *         quando pelo menos uma de duas coordenadas for NULA (nesta situação
 *         sem escrever mensagem alguma)
 *
 */

public class PlanoCartesiano {
	public static void main(String[] args) {

		int x,y;
		
		x = y = 0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		while (true) {

			x = sc.nextInt();
			y = sc.nextInt();
			
			if(x == 0 || y == 0)
				break;
			
			else if(x > 0 && y > 0)
				System.out.println("Primeiro");
			
			else if(x < 0 && y > 0)
				System.out.println("Segundo");

			else if(x < 0 && y < 0)
				System.out.println("Terceiro");

			else
				System.out.println("Quarto");

		}

		sc.close();
	}
}
