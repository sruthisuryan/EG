package assignment;

public class FullTimeEmployee extends Employee {

	
	private double hourlyRate;
	
	public  FullTimeEmployee (double hourlyRate)
	{
		this.hourlyRate = hourlyRate;
	}

	

	public static void main(String[] args) {
	
		
		Contractor cn = new Contractor(8, 10);
		FullTimeEmployee full = new FullTimeEmployee(20);
		cn.calculateSalary();
		full.calculateSalary();
		
	}





	@Override
	public double calculateSalary() {
		
		
		double fulltimeempsalary  = hourlyRate * 8;
		
		System.out.println("Full time emp salary is :" +fulltimeempsalary);
		return fulltimeempsalary;
	}

}
