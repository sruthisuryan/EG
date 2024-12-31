package assignment;

import java.util.ArrayList;
import java.util.List;

public class SearchAnElement {

	public static void main(String[] args) {
		
		
List <String> var = new ArrayList <String>();
		
		var.add("Nano");
		var.add("Tiago");
		var.add("Altroz");
		var.add("Nexon");
		var.add("Punch");
		var.add("Safari");
		var.add("Harrier");
		
		System.out.println("Print the list of cars"+var);
		
		String searchElement ="Swift";
		System.out.println("Search element  :" +searchElement);
		
		if(var.contains(searchElement))
		{
			System.out.println("Element " +searchElement+ " is present in the list");
		}
		else
		{
		System.out.println("Searchelement  "+searchElement+ " not present in the list");

	}
	}
}
