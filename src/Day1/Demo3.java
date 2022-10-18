package Day1;

public class Demo3 {
	
	public void Demo(String a) {
		
		int lcount=0;
		int ucount=0;
		int ncount=0;
		int scount=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)<='A'&&a.charAt(i)>='Z') {
				ucount++;
			}
			else if(a.charAt(i)<='a'&&a.charAt(i)>='z') {
				lcount++;
			}
			else if(a.charAt(i)<='0'&&a.charAt(i)>='9') {
				ncount++;
			}
			else {
				scount++;
			}
		}
		System.out.println(lcount+ncount+scount);
		
		
	}


public static void main(String[]args) {
	String a="ABCabc123@gmail.com";
	Demo3 d=new Demo3();
	System.out.println(d.)
}
