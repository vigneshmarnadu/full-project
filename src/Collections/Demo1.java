package Collections;

import java.util.ArrayList;

public class Demo1 {
	public static void main(String[]args) {
	ArrayList <String> names=new ArrayList<>();
	names.add("Vinoth");
	names.add("Vignesh");
	names.add("Balu");
	names.remove("Balu");
	names.set(0, "Viki");
	for(String n:names) {
		System.out.println(n);
		
	}
	names.forEach(n->System.out.println(n));
	
	
	
	}
}
