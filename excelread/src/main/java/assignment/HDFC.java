package assignment;

public class HDFC implements RBI{

	public static void main(String[] args) {
		
		HDFC acc = new HDFC();
		
		acc.recurringDeposit(1000, 12);

	}

	@Override
	public double recurringDeposit(double amount, int duration) {
		
		
	
		
		double monthlyInterest = interstrate / 12; // Monthly interest rate
		
        double maturityAmount = amount * (1 + monthlyInterest * duration);
        
        
          System.out.println("Customer will receive Rs. " + maturityAmount + " after " + duration + " months.");
          
        return maturityAmount;
	}

}
