package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

/**
 ** @author Gabriel Rubio
 * 
 *         Exercício 2 -Fazer um programa para ler od dados de um funcionário
 *         (nome, salário bruto e imposto). Em seguida, mostrar os dados do
 *         funcionário (nome e salário líquido). Em seguida aumentar o salário
 *         do funcionário com base em uma porcentagem dada (somente o salário
 *         bruto é afetado pela porcentagem) e mostrar novamente os dados do
 *         funcionário.
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
