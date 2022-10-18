package Dcollections2;

import java.util.HashMap;
import java.util.Set;

public class Demo {
	public static void main(String[]args) {
		HashMap<Integer,String>hm=new HashMap <>();
		hm.put(18, "Bhavani");
		hm.put(17, "Raji");
		hm.put(12, "Raja");
		hm.put(23, "Rani");
		hm.put(14, "Ravi");
		int max=0; int min=max;
		for (Integer i:hm.keySet()) {
			if(i>max) {
				max=i;
			}
			else if(min<i) {
				min=i;
			}
			
			System.out.println(i);
		}
		System.out.println("********************");
		System.out.println(max);
		System.out.println(min);
		System.out.println("********************");

		
		for(String i:hm.values()) {
			System.out.println(i);
		}
		System.out.println("********************");

		System.out.println( hm);
		System.out.println("********************");
		for(Integer i:hm.keySet()) {
			String str=hm.get(i);
			System.out.println(i+" "+str);

		}
		System.out.println("********************");

		hm.forEach(
				(K,V)->{
			System.out.println(K+" "+V);
		}
				);
		System.out.println("********************");
		hm.keySet().forEach(a->{
			System.out.println(a);
		});
		System.out.println("********************");
		hm.values().forEach(a->{
			System.out.println(a);
		});
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");
	
		
	}

}
