package application;

import java.util.Locale;
import java.util.Scanner;
import entities.EmployeeEntities;

public class EmployeeApplication {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		EmployeeEntities leao = new EmployeeEntities();


		System.out.print("Name: ");
		leao.name = sc.nextLine();
		System.out.print("Gross salary: ");
		leao.salary = sc.nextDouble();
		System.out.print("Tax: ");
		leao.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Employee: " + leao.name + ", $ " + leao.salary );

		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		leao.percentage = sc.nextDouble();
		System.out.println();
		System.out.println("Updated data: " + leao.name + ", $ " + leao.IncreaseSalary() );


		sc.close();
	}
}