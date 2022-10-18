package Collections;

public class Student {
		private String name;
		private int fees;
		private String gender;
		
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return "Name:"+name;
		}
		public void setFees(int fees) {
			this.fees=fees;
		}
		public int getFees() {
			return fees;
		}
		public void setGender(String gender) {
			this.gender=gender;
		}
		public String getGender() {
			return "Gender"+gender;
		}
		public Student(String name,int fees,String gender) {
			this.name=name;
			this.fees=fees;
			this.gender=gender;
		}
		public String toString() {
			return "Name:"+name+" "+"Fees:"+fees+" "+"Gender:"+gender;
		}
		}
		
		
		

	

