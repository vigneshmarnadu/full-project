package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
	public static void main(String[]args) {
		ArrayList<Integer>ages=new ArrayList<>();
		ages.add(28);
		ages.add(26);
		ages.add(24);
		ages.add(27);
		ages.add(28);
		ages.add(29);
		ages.add(29);
		for(int i=0;i<ages.size();i++) {
			System.out.println(ages.get(i));
		}
	}

}
