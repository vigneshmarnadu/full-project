package Dcollections2;

import java.util.HashMap;
import java.util.Iterator;

public class UseCustomerDetails {
	public static void main(String[]args) {
		CustomerDetails cd1=new CustomerDetails("Vignesh",27,"viki@123",5000,12345678963l);
		CustomerDetails cd2=new CustomerDetails("Viki",26,"viki123",7000,12345698963l);
		CustomerDetails cd3=new CustomerDetails("Rinoth",29,"viki@13",5700,1234567573l);
		CustomerDetails cd4=new CustomerDetails("Bignesh",27,"vii@123",5900,12345678963l);
		
		HashMap<Integer,CustomerDetails>cd=new HashMap<>();
		cd.put(1, cd1);
		cd.put(2, cd2);
		cd.put(3, cd3);
		cd.put(4, cd4);
		
		for(Integer f:cd.keySet() ) {
			System.out.println(f);
		}
		System.out.println("***********************");
	   for(CustomerDetails s:cd.values()) {
		   System.out.println(s);
	   }
		System.out.println("***********************");
		Iterator<Integer>d=cd.keySet().iterator();
		while(d.hasNext()) {
			System.out.println(d.next());
		}
		System.out.println("***********************");
		Iterator<CustomerDetails>e=cd.values().iterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		}

		
		


		
	}

}
