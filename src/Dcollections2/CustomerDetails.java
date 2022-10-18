package Dcollections2;

public class CustomerDetails {
	private String name; 
	private int age;
	private String email;
	private int accountBalance;
	private long adharNo;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance=accountBalance;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo=adharNo;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public CustomerDetails(String name,int age,String email,int accountBalance,long adharNo) {
		this.name=name;
		this.age=age;
		this.email=email;
		this.accountBalance=accountBalance;
		this.adharNo=adharNo;
	}
	public String toString() {
		return "Name:"+name+","+"Age:"+age+","+"Email:"+email+","+"Account Balance:"+accountBalance+","+"Adhar No:"+adharNo;
	}

}
