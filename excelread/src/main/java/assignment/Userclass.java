package assignment;

import java.util.Arrays;

public class Userclass {
	
	
	private int pin;
	private  int[] pincode = {1001, 1234, 1212};
	
	public void setPin(int pin)
	{
		this.pin = pin;
	}
	public int   getPin()
	{
		return pin ;
		
		
		
	}
	public boolean IsvalidPin() {
		
        for(int valid : pincode)
        {
        	if(valid == pin)
        	{
        		return true;
        	}
        }
		return false;
    }
    }



