package Collectios3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseMobile {
	public static void main(String[]args) {
		Mobile m1=new Mobile("Lenovo",20000,"Black","Aj34",true);
		Mobile m2=new Mobile("SamSung",15000,"White","Wigt",false);
		Mobile m3=new Mobile("Mi",25000,"Blue","Ftyt",true);
		Mobile m4=new Mobile("Iphone",18000,"Grey","jiy",true);
		Mobile m5=new Mobile("OnePlus",22000,"Yellow","Nihg",false);
		
		ArrayList<Mobile>mobiles=new ArrayList<>();
		mobiles.add(m5);
		mobiles.add(m4);
		mobiles.add(m3);
		mobiles.add(m2);
		mobiles.add(m1);
		
	    List<Mobile>l=mobiles.stream().filter(a->a.getPrice()>20000).collect(Collectors.toList());
	    l.forEach(x->System.out.println(x));
	    System.out.println("***************************");
	    for(Mobile m:l) {
	    	System.out.println(m);
	    }
	    System.out.println("***************************");
	    List<Mobile>s=mobiles.stream().filter(a->a.getIsWarranty()).collect(Collectors.toList());
	    for(Mobile u:s) {
	    	System.out.println(u);
	    }
	    System.out.println("***************************");
	    //List Use that method
	    List<Mobile>m=mobiles.stream().filter(a->a.getBrand().contains("S")).collect(Collectors.toList());
	    for(Mobile j:m) {
	    	System.out.println(j);
	    System.out.println("***************************");
	    List<Mobile>h=mobiles.stream().filter(a->a.getIsWarranty()).collect(Collectors.toList());
	    for(Mobile y:h) {
	    	System.out.println(y.getBrand()+" "+(y.getPrice()-999));
	    }
	    System.out.println("***************************");
	    //Only for Use Stream
	    mobiles.stream().filter(a->a.getBrand().toUpperCase().startsWith("S")).forEach(x->System.out.println(x));
	    System.out.println("***************************");
	   //ArrayList Use that method.
	    ArrayList<Mobile>o=mobiles.stream().filter(a->a.getModel().equalsIgnoreCase("jiY")).collect(Collectors.toCollection(ArrayList::new));
	    o.forEach(x->System.out.println(x));



	    	
	    }
	    


	    
	    }
		
		
	}


