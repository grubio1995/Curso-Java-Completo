package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

/**
 ** @author Gabriel Rubio
 * 
 *         Exerc�cio 2 -Fazer um programa para ler od dados de um funcion�rio
 *         (nome, sal�rio bruto e imposto). Em seguida, mostrar os dados do
 *         funcion�rio (nome e sal�rio l�quido). Em seguida aumentar o sal�rio
 *         do funcion�rio com base em uma porcentagem dada (somente o sal�rio
 *         bruto � afetado pela porcentagem) e mostrar novamente os dados do
 *         funcion�rio.
 * 
 */

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();

		System.out.println("\nEmployee: " + employee);

		System.out.println("\nWhich percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());

		System.out.println("\nUpdated data: " + employee);

		sc.close();
	}
}
