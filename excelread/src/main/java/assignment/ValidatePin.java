package assignment;

import java.util.Scanner;

public class ValidatePin {

	public static void main(String[] args) {
		
		Userclass p = new Userclass();
		
		p.setPin(1234);
		
		if (p.IsvalidPin())
		{
			System.out.println("pin entered correct");
		}
		
		else
		{
			System.out.println("Pin enter is not correct");
		}
		
		
	}
	
	

}
