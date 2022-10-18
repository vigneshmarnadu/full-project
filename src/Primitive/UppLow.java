package Primitive;

public class UppLow {
	public static void main(String[]args) {
		String a="ViJayaLaKshmI";
		char b[]=a.toCharArray();
		int upper=0;
		int lower=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]>='A'&& b[i]<='Z') {
				upper++;
			}
			else {
			    lower++;
			}
		}
		System.out.println(upper);
		System.out.println(lower);
	}

}
