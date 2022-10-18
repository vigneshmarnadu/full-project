package Dcollections2;

import java.util.HashMap;
import java.util.Iterator;

public class UseStudent {
	public static void main(String[]args) {
		Student s1=new Student("Vignesh",23,"Mech",550);
		Student s2=new Student("Bala",32,"Civil",540);
		Student s3=new Student("Gia",24,"EEE",470);
		Student s4=new Student("Hari",27,"CS",579);
		Student s5=new Student("Jai",25,"ECE",580);
		
		HashMap<Integer,Student>st=new HashMap<>();
		st.put(s1.getId(), s1);
		st.put(s2.getId(), s2);
		st.put(s3.getId(), s3);
		st.put(s4.getId(), s4);
		st.put(s5.getId(), s5);
		
		System.out.println(st);
		System.out.println("********************************");
		
		for(Student s:st.values()) {
			System.out.println(s);
		}
		System.out.println("********************************");
		Iterator<Student>st1=st.values().iterator();
		while(st1.hasNext()) {
			System.out.println(st1.next());
		}

		
		
	}

}
