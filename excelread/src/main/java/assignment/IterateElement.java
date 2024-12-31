package assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateElement {
	
public static void main(String[] args)
	
	{
	
	Set <String> var = new HashSet<String>();
	var.add("Blue");
	var.add("RED");
	var.add("Green");
	var.add("Yellow");
	System.out.println("Colors to print : " +var);
	
	System.out.println("Colours to print after iteration:");
	
	Iterator itr = var.iterator();
	while(itr.hasNext())
	{
		
		System.out.println(itr.next());
	}

}
}