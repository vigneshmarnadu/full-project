package Dcollections2;

import java.util.HashMap;
import java.util.Iterator;

public class Demo2 {
	public static void main(String[]args) {
		HashMap<Integer,String>hm=new HashMap <>();
		hm.put(18, "Bhavani");
		hm.put(17, "Raji");
		hm.put(12, "Raja");
		hm.put(23, "Rani");
		hm.put(14, "Ravi");
		Iterator<Integer>itr=hm.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
		Iterator<String>i=hm.values().iterator();
		while(i.hasNext()) {
			if(!i.next().startsWith("R")) {
				i.remove();
			//System.out.println(i);
			}
		}
		hm.values().forEach(x->System.out.println(x));
	}

}
