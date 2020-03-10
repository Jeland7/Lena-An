import java.util.Scanner;

public class Wage {
	
	// declare instance variables name as a String ,salary, rate, netSalary, allowance, taxDue, taxable as double
	private double grossSalary;
	private double allowance;
	private double taxRate;
	private double taxable;
	private double taxDue;
	private double netSalary;
	
	//process
    //run calculate methods() which we created in our Wage class
	public double calculateTaxable(double allowance, double grossSalary) {
		return grossSalary - allowance;
		
	}
	public double calculateTaxDue(double taxable, double taxRate) {
		return taxable * taxRate;
		
	}
	public double calculateNetSalary(double taxable, double taxDue) {
		return taxable - taxDue;
		
	}
	public void displayAll() {
		System.out.println("\n\tHere's the bad news, " + name + "\n" + "\tGross salary = \t" + grossSalary + "\n" + "\tAllowance = \t" + allowance + "\n" +"\t\t\t______________\n" +
				"\tTaxable = \t" + taxable + "\n" + "\ttaxRate = \t\t" + taxRate*100 + "%\n" + "\tTax due = \t" + taxDue + "\n" + "\tNet Salary = \t" + netSalary +"n");
	}
		
	// declare the main method to calculate and run the app
	public static void main(String[] args) {
		//inside the main
	    // declare and create objects of type Scanner and objects of type of Wage Class to access all instance variables and methods()
	Scanner sc = new Scanner(System.in);
	// get input from user
    // System.out.print("Please enter your name : ");
    //and store inside String name
	System.out.println("Please enter your name: ");
	String name;
	name = sc.nextLine();
	System.out.println("Hi " + name + " can you please enter your salary: ");
    double salary;
	salary = sc.nextDouble();
	System.out.println("Thank you, " + name + ", can you now enter the tax rate ie 45% or 24%: ");
	double rate;
	rate = sc.nextDouble();
	System.out.println("Finally, " + name + " please enter your tax free allowance: ");
	double allowance;
	allowance = sc.nextDouble();
	
	Wage myWage;
	myWage = new Wage();
	double taxbl, taxD;
	myWage.calculateTaxable(allowance, salary);
	myWage.calculateTaxDue(taxbl, rate);
	myWage.calculateNetSalary(taxbl, taxD);
	
	
	
	}//end of main
}//end of class
