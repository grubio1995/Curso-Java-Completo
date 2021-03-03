import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 *
 * Exercício 4 - Fazer um programa que leia o número de um funcionário, seu número 
 * de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funci-
 * onário. A seguir, mostre o número e o salário do funcionário, com duas casas
 * decimais
 *
 */

public class SalarioFuncionario {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int numero;
		double salariohora,horas;
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Digite seu número: ");
		numero = sc.nextInt();
		
		System.out.println("Digite sua salário/hora: ");
		salariohora = sc.nextDouble();
		
		System.out.println("Digite a quantidade de hotas trabalhadas: ");
		horas = sc.nextDouble();
		
		salariohora = salariohora * horas;
		
		System.out.println("Number = " + numero);
		System.out.printf("Salary = U$ " + "%.2f",salariohora);
		
		
		sc.close();
		
	}
}
