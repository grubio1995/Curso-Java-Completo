package application;

import java.util.ArrayList;
import java.util.List;

/**
 ** @author Gabriel Rubio
 *
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
 * N funcionários. Não deve haver repetição de id.
 * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
 * Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
 * mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
 * conforme exemplos.
 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
 * ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
 * aumento por porcentagem dada.
 * 
 */

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();

		List<Employee> employees = new ArrayList<>();

		for (int i = 1; i <= n; i++) {

			System.out.println("\nEmployee #" + i);
			sc.nextLine();
			System.out.println("Id: ");
			int id = sc.nextInt();
			sc.nextLine();

			while (hasId(employees, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
				sc.nextLine();
			}

			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();

			employees.add(new Employee(id, name, salary));
		}

		System.out.println("\nEnter the employee id that will have salary increase:");
		int id = sc.nextInt();

		Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp != null) {
			System.out.println("Enter the percentage: ");
			emp.increaseSalary(sc.nextDouble());
		}

		else
			System.out.println("This id does not exist!");

		System.out.println("\nList of employees: ");
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		sc.close();
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
