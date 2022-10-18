package Collectios3;

import java.util.*;

import java.util.function.Function;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[]args) {
		Student s1=new Student("NAvin",1234,"Mech",300,true);
		Student s2=new Student("Viki",1235,"Civil",450,true);
		Student s3=new Student("Akila",1236,"CS",400,false);
		Student s4=new Student("Arun",1237,"EEE",380,true);
		Student s5=new Student("Janu",1238,"ECE",490,false);
	    
		ArrayList<Student>stss=new ArrayList<>();
		stss.add(s5);
		stss.add(s4);
		stss.add(s3);
		stss.add(s2);
		stss.add(s1);
		
		List<Integer>l=stss.stream().map(a->a.getMarks()).collect(Collectors.toList());
		l.forEach(x->System.out.println(x));
		System.out.println("****************************");
		stss.stream().map(a->a.getMarks()).forEach(x->System.out.println(x));
		ArrayList<Mobile>mobiles=new ArrayList<>();
		System.out.println("****************************");
		List<String>o=stss.stream().filter(x->x.getMarks()>=400).map(y->y.getName()).collect(Collectors.toList());
		o.forEach(z->System.out.println(z));
		System.out.println("****************************");
		long t=stss.stream().count();
		System.out.println(t);
		System.out.println("****************************");
		long c=stss.stream().filter(x->x.getMarks()>400).map(y->y.getName()).count();
		System.out.println(c);
		System.out.println("****************************");
		Map<Integer,Student>m=stss.stream().filter(x->x.getDepart().equals("Mech")).collect(Collectors.toMap(Student::getMarks,Function.identity()));
		m.forEach((k,v)->System.out.println(k+" Refers: "+v));
		System.out.println("****************************");
		Map<String,Boolean>s=stss.stream().filter(x->x.getDepart().equals("Civil")).collect(Collectors.toMap(Student::getName,Student::getIsMale));
		s.forEach((k,v)->System.out.println(k+" "+v));
		System.out.println("****************************");
		List<Student>u=stss.stream().filter(x->x.getDepart().equals("Civil")).collect(Collectors.toList());
		u.forEach(a->System.out.println(a));


		




		
	    
		
		




	}

}
