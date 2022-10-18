package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo4 {
	public static void main(String[]args) {
		ArrayList<Integer>ages=new ArrayList<>(Arrays.asList(10,20,30,40,50,60,60));
		for(int i=0;i<ages.size();i++) {
			System.out.println(ages.get(i));


		}
	}

}
