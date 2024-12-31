package assignment;

public class Onseason {
	

	public void discount(double amount) {
		
		double discount = amount * 0.40;
		double finalPrice = amount - discount;
		
		System.out.println("-----------------Onseason details-------------------");
		System.out.println("onseason discount is 40%");
		System.out.println("Total amount of the on season cloth is :" +amount);
		System.out.println("Discount of onseason cloth is : "+discount);
		System.out.println("Final amount after the discount in on season is  :" +finalPrice);
		System.out.println("-------------------------------------------------------------------");
		
		
		
	}

}
