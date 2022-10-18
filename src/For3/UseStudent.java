package For3;

public class UseStudent {
	public static void main(String[]args) {
		Student st1=new Student();
		st1.name="vignesh";
	    st1.rollno=1234;
	    st1.dept="Maths";
	    st1.isMale=true;
	    Student st2=new Student();
		st2.name="Rishi";
	    st2.rollno=1235;
	    st2.dept="Commerce";
	    st2.isMale=true;
	    Student st3=new Student();
		st3.name="Rohini";
	    st3.rollno=1236;
	    st3.dept="Maths";
	    st3.isMale=false;
	    Student st4=new Student();
		st4.name="Eswar";
	    st4.rollno=1237;
	    st4.dept="Maths";
	    st4.isMale=true;
	    Student st5=new Student();
		st5.name="Nirmala";
	    st5.rollno=1238;
	    st5.dept="Maths";
	    st5.isMale=false;
	    Student[]stds= {st1,st2,st3,st4,st5};
	    for(int i=0;i<stds.length;i++) {
	    	if(stds[i].isMale==true) {
	    		System.out.println(stds[i].name+","+stds[i].rollno+","+stds[i].dept);
	    	}
	    }
		
	}

}
