package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

/**
 ** @author Gabriel Rubio
 * 
 *         Exercicio 3 - Fazer um programa para ler o nome de um aluno e as três
 *         notas que ele obteve nos três trimestres do ano (primeiro trimestre
 *         vale 30, e o segundo e terceiro valem 35 cada). Ao final, mostrar
 *         qual a nota final do aluno no ano. Dizer também se o aluno está
 *         aprovadi (PASS) ou não (FAILED) e, em caso negativo, quantos pontos
 *         faltam para o aluno obter o mínimo para ser aprovado que é (60% da
 *         nota). Você deve criar uma classe Student para resolver este problema.
 * 
 */

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();

		double finalGrade = student.finalGrade();

		System.out.println("\nFinal grade: " + String.format("%.2f", finalGrade));

		if (finalGrade >= 60)
			System.out.println("PASS");
		else
			System.out.println("FAILED" + "\nMISSING "
					+ String.format("%.2f",student.missingGradePoints(finalGrade)) + " POINTS");

		sc.close();
	}
}
