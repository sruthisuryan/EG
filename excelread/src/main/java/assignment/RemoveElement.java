package assignment;

import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {
		
		ArrayList var = new ArrayList<String>();
		
		var.add("Nano");
		var.add("Tiago");
		var.add("Altroz");
		var.add("Nexon");
		var.add("Punch");
		var.add("Safari");
		var.add("Harrier");
		
		System.out.println("Print the car list first :" +var);
		
System.out.println("Removed the 3rd element :"+var.remove(2));
System.out.println("Print the list after removal is : " +var);
		

	}

}
