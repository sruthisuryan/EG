package assignment;

public class OffSeason extends Onseason {

	public static void main(String[] args) {
		
		OffSeason obj = new OffSeason();
		obj.discount(300);
		

	}
	

	public void discount(double amount) {
		
		super.discount(200);
		
		double discount = 0.15 * amount;
		double finalPrice = amount - discount;
		System.out.println("-----------------Offseason details-------------------");
		System.out.println("off season discount is 15%");
		System.out.println("Total amount of the offseason cloth is :" +amount);
		System.out.println("Discount of off season cloth is : "+discount);
		System.out.println("Final amount after the discount in offseason is  :" +finalPrice);
		System.out.println("-----------------------------------------------------------");
		
		
	}

}
