import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 *
 * Exerc�cio 4 - Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero 
 * de horas trabalhadas, o valor que recebe por hora e calcula o sal�rio desse funci-
 * on�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
 * decimais
 *
 */

public class SalarioFuncionario {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int numero;
		double salariohora,horas;
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Digite seu n�mero: ");
		numero = sc.nextInt();
		
		System.out.println("Digite sua sal�rio/hora: ");
		salariohora = sc.nextDouble();
		
		System.out.println("Digite a quantidade de hotas trabalhadas: ");
		horas = sc.nextDouble();
		
		salariohora = salariohora * horas;
		
		System.out.println("Number = " + numero);
		System.out.printf("Salary = U$ " + "%.2f",salariohora);
		
		
		sc.close();
		
	}
}
