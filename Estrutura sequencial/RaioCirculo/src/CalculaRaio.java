import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 *
 * Exerc�cio 2 - FFa�a um programa para ler o valor do raio de um c�rculo, e depois 
 * mostrar o valor da �rea deste c�rculo com quatro casas decimais 
 *
 */

public class CalculaRaio {


	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		double raio;
		
		System.out.printf("Digite o raio do c�rculo: ");
		raio = sc.nextDouble();
		raio = (Math.pow(raio,2)) * 3.14159;

		System.out.printf("O Raio do c�rculo �: " + "%.4f",raio);
		
		sc.close();
	}	
}
