package assignment;

public class Contractor extends Employee{
	
	private int totalhours;
	private int workingdays;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public Contractor(int totalhours,
			int workingdays)
	{
		this.totalhours = totalhours;
		this.workingdays =workingdays;
	}

	@Override
	public double calculateSalary() {
		
		double contractorSalary = totalhours * workingdays;
		System.out.println("Contractor salary is :" +contractorSalary);
		
		return contractorSalary  ;
	}

}
