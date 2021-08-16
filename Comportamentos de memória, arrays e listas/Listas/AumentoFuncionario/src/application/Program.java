package application;

import java.util.ArrayList;
import java.util.List;

/**
 ** @author Gabriel Rubio
 *
 * Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e salario) de
 * N funcion�rios. N�o deve haver repeti��o de id.
 * Em seguida, efetuar o aumento de X por cento no sal�rio de um determinado funcion�rio.
 * Para isso, o programa deve ler um id e o valor X. Se o id informado n�o existir, mostrar uma
 * mensagem e abortar a opera��o. Ao final, mostrar a listagem atualizada dos funcion�rios,
 * conforme exemplos.
 * Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitir que o sal�rio possa
 * ser mudado livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o de
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
