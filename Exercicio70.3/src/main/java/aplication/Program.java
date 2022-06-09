package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Studant;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		Studant studant = new Studant();
		
		studant.name = scan.nextLine();
		studant.grade1 = scan.nextDouble();
		studant.grade2 = scan.nextDouble();
		studant.grade3 = scan.nextDouble();
		
		System.out.println("FINAL GRADE: " + studant.finalGrade());
		
		if (studant.finalGrade() >= 60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.println("MISSING " + studant.missingPoint() + " POINTS");
		}
		
		

		scan.close();
	}

}
