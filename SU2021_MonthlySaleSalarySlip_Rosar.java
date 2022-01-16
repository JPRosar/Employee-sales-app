//John Rosar
//COSC1437
//Lab4 part 2
//SU2021_MonthlySaleSalarySlip_Rosar
//Driver class

import java.util.Scanner;

public class SU2021_MonthlySaleSalarySlip_Rosar {
	public static void main(String[] args) {
	
		//Variables 
		String name;
		String employeeId;
		float saleAmount;
		float baseSalary;
		baseSalary = 2500.0f;

		// User is inputting values via our scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Employee name :");
		name = sc.nextLine();
		System.out.print("Enter the Employee ID :");
		employeeId = sc.nextLine();
		System.out.print("Enter the Sale Amount:");
		saleAmount = sc.nextFloat();

		// Making our object
		SaleEmployee_Rosar saleEmployee_Rosar = new SaleEmployee_Rosar(name,employeeId,saleAmount,baseSalary);
		System.out.println(saleEmployee_Rosar.toString());
		sc.close();
	}
}