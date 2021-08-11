package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

/**
 ** @author Gabriel Rubio
 * 
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

		if (finalGrade > 60)
			System.out.println("PASS");
		else
			System.out.println("FAILED" + "\n MISSING "
					+ String.format("%.2f", student.missingGradePoints(finalGrade) + " POINTS"));

		sc.close();
	}
}
