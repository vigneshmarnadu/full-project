package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class UseShirt {
	public static void main(String[]args) {
		Shirt s1=new Shirt("hugdn",399,true);
		Shirt s2=new Shirt("hug",400,true);
		Shirt s3=new Shirt("hurg",500,false);
		Shirt s4=new Shirt("hutr",309,true);
		Shirt s5=new Shirt("huggh",200,false);
		
		ArrayList<Shirt>shirts=new ArrayList<>();
		
		shirts.add(s1);
		shirts.add(s2);
		shirts.add(s3);
		shirts.add(s4);
		shirts.add(s5);
		
		ArrayList<Shirt>checkedList=new ArrayList<>();
		for(Shirt s:shirts) {
			if(s. getIsChecked()==true) {
				checkedList.add(s);
			}
		}
		checkedList.forEach(x->System.out.println(x));
	
		
		
	}

}
