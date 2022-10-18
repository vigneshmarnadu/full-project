package Day1;

public class Marksheet {
	public static void main (String [] args) {
		int tamil = 97;
		int english = 78;
		int maths = 87;
		int science =96;
		int social = 79;
		int total = tamil+english+maths+science+social;
		float average = total/5;
		System.out.println("Tamil ="+tamil);
		System.out.println("English ="+english);
		System.out.println("Maths ="+maths);
		System.out.println("Science="+science);
		System.out.println("Social ="+social);
		System.out.println("Total = "+total);
		System.out.println("Average = "+average);

	}
}
