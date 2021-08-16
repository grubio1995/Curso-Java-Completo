package application;

/**
 ** @author Gabriel Rubio
 *
 * A dona de um pensionato possui dez quartos para alugar para estudantes,
 * sendo esses quartos identificados pelos números 0 a 9.
 * Fazer um programa que inicie com todos os dez quartos vazios, e depois
 * leia uma quantidade N representando o número de estudantes que vão
 * alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
 * N estudantes. Para cada registro de aluguel, informar o nome e email do
 * estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
 * que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
 * um relatório de todas ocupações do pensionato, por ordem de quarto,
 * conforme exemplo.
 * 
 */

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many rooms will be rented?");
		int roomsQuantity = sc.nextInt();

		Rent[] rent = new Rent[10];

		for (int i = 1; i <= roomsQuantity; i++) {

			System.out.println("Rent #" + i);
			sc.nextLine();

			System.out.println("Name: ");
			String name = sc.nextLine();

			System.out.println("Email: ");
			String email = sc.nextLine();

			System.out.println("Room: ");
			int roomPosition = sc.nextInt();

			rent[roomPosition] = new Rent(name, email);
		}

		System.out.println();
		System.out.println("Busy rooms:");

		for (int i = 0; i < rent.length; i++) {

			if (rent[i] != null)
				System.out.println(i + ": " + rent[i]);
		}

		sc.close();
	}
}
