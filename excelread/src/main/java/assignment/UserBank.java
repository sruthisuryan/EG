package assignment;

import java.util.HashSet;
import java.util.Set;

public class UserBank {

	
	private int pin;
	
	public UserBank() {
		
		Set <Integer> var = new HashSet<>();
		var.add(1234);
		var.add(3456);
		var.add(2255);
		
		
	}

	
	public  void setPin(int pin)
	{
this.pin = pin;		
	}
	
	public int getPin()
	{
		return pin;
		
	}
	
	//public boolean isValid()
	//{
		
	
		
		
	}
//}
