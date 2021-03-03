import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 *
 * Exercício 2 - FFaça um programa para ler o valor do raio de um círculo, e depois 
 * mostrar o valor da área deste círculo com quatro casas decimais 
 *
 */

public class CalculaRaio {


	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		double raio;
		
		System.out.printf("Digite o raio do círculo: ");
		raio = sc.nextDouble();
		raio = (Math.pow(raio,2)) * 3.14159;

		System.out.printf("O Raio do círculo é: " + "%.4f",raio);
		
		sc.close();
	}	
}
