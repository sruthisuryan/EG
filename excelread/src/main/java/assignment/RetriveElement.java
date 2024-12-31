package assignment;

import java.util.ArrayList;
import java.util.List;

public class RetriveElement {

	public static void main(String[] args)
	
	{
		List <String> var = new ArrayList <String>();
		
		var.add("Nano");
		var.add("Tiago");
		var.add("Altroz");
		var.add("Nexon");
		var.add("Punch");
		var.add("Safari");
		var.add("Harrier");
		
		System.out.println("----------Tata car list:--------------");
		System.out.println(var);
		System.out.println("Retrieved the 3rd index :" +var.get(4));
		System.out.println(" Print the list after retrival:" +var);
	}

}
