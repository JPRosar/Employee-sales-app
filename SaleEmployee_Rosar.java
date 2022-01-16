//John Rosar
//COSC1437
//Lab4 part 2
//SaleEmployee_Rosar.java
//Data class


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//variables
public class SaleEmployee_Rosar {
	String name;
	String employeeId;
	float saleAmount;
	float baseSalary;
	LocalDate date = LocalDate.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");

	//initiating values
	public SaleEmployee_Rosar() {
		this.name = null;
		this.employeeId = null;
		this.saleAmount = 0;
		this.baseSalary = 0;
	}

	public SaleEmployee_Rosar(String name, String employeeId, float saleAmount, float baseSalary) {
		this.name = name;
		this.employeeId = employeeId;
		this.saleAmount = saleAmount;
		this.baseSalary = baseSalary;
	}

	//Getting and setting our variables
	public String getName() {
		return name;}

	public void setName(String name) {
		this.name = name;}

	public String getEmployeeId() {
		return employeeId;}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;}

	public float getSaleAmount() {
		return saleAmount;}

	public void setSaleAmount(float saleAmount) {
		this.saleAmount = saleAmount;}

	public float getBaseSalary() {
		return baseSalary;}

	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;}

	//Commission Method
	float calCommission() {
		float commission = 0;
		if (saleAmount < 10000) {
			commission = 0;
		} 
		else {
			commission = (float)((2.79 / 100) * saleAmount);
		}
		return commission;
	}

	//Bonus Method
	float calBonus() {
		float bonus = 0;
		if(saleAmount < 12000 ) {
			bonus = 0;
		}
		else {
			bonus = (float)((2.59 /100) * (saleAmount - 12000));
		}
		return bonus;
	}

	//Salary Method
	float calSalary() {
		float salary = 0;
		salary = baseSalary + calCommission() + calBonus();
		return salary;
	}

	//toString method to display the salary slip formatted
	public String toString() {
		String salarySlip = "----------------------------------------------\n";
		salarySlip += String.format("%-5s%-20s\n","File: ", "SalaryOfRepresentative_Rosar.java"); 
		salarySlip += String.format("%-20s%-20s\n","Sale Company      -  ", "    John Rosar");
		salarySlip += String.format("%-25s%-20s\n", "Today: ", date.format(formatter));
		salarySlip += "----------------------------------------------\n";
		salarySlip += String.format("%-35s%10s\n","Name of Sale Representative:", name);
		salarySlip += String.format("%-35s%10s\n","Employee ID:", employeeId);
		salarySlip += String.format("%-35s%10.2f\n","Sale amount", saleAmount);
		salarySlip += "----------------------------------------------\n";
		salarySlip += String.format("%-35s%10.2f\n","Base Salary:", baseSalary);
		salarySlip += String.format("%-35s%10.2f\n","Commission Amount:",calCommission());
		salarySlip += String.format("%-35s%10.2f\n","Bonus Amount:",calBonus());
		salarySlip += String.format("%-35s%10.2f\n","Salary:",calSalary());  
		salarySlip += "----------------------------------------------\n";

		return salarySlip;
	}
}