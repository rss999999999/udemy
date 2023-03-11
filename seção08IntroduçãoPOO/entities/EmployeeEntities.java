package entities;

public class EmployeeEntities {
	public String name;
	public double salary;
	public double tax;
	public double percentage;


	public double IncreaseSalary() {
		double netSalary = salary-tax;
		return netSalary+((percentage/100)*salary);
	}

}