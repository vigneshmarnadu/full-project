package Collectios3;

public class Student {
     String name;
     int rollNo;
     String depart;
     int marks;
     boolean isMale;
     public void setName(String name) {
    	 this.name=name;
     }
     public String getName() {
    	 return name;
     }
     public void setRollNo(int rollNo) {
    	 this.rollNo=rollNo;
     }
     public int getRollNo() {
    	 return rollNo;
     }
     public void setDepart(String depart) {
    	 this.depart=depart;
     }
     public String getDepart() {
    	 return depart;
     }
     public void setMarks(int marks) {
    	 this.marks=marks;
     }
     public int getMarks() {
    	 return marks;
     }
     public void setIsMale(boolean isMale) {
    	 this.isMale=isMale;
     }
     public boolean getIsMale() {
    	 return isMale;
     }
     public Student(String name,int rollNo,String depart,int marks,boolean isMale) {
    	 this.name=name;
    	 this.rollNo=rollNo;
    	 this.depart=depart;
    	 this.marks=marks;
    	 this.isMale=isMale;
     }
     public String toString() {
    	 return name+" "+rollNo+" "+depart+" "+marks+" "+isMale;
     }

}
