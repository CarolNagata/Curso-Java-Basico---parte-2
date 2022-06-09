package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Employee emplyee = new Employee();
		
		System.out.print("Name: ");
		emplyee.name = scan.nextLine();
		System.out.print("Gross Salary: ");
		emplyee.grossSalary = scan.nextDouble();
		System.out.print("Tax: ");
		emplyee.tax = scan.nextDouble();
		
		System.out.println();
		System.out.print("Employee: " + emplyee.name + ", $ " + emplyee.liqSalary());
		
		System.out.println();
		System.out.print("Wich percentage to increase salary? ");
		double percentage = scan.nextDouble();
		emplyee.percentSalary(percentage);
		
		
		System.out.println("Update data: " + emplyee);

		scan.close();
	}

}
