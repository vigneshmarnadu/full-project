package Condition;

public class WeekDays {
	public static void main (String[]args) {
		int num=3;
		switch (num) {
		case 1:
			System.out.println("MonDay");
			break;
		case 2:
			System.out.println("TuesDay");
			break;
		case 3:
			System.out.println("WednesDay");
			break;
		case 4:
			System.out.println("ThursDay");
			break;
		case 5:
			System.out.println("FriDay");
			break;
		case 6:
			System.out.println("Saturday");
		case 7:
			System.out.println("Sunday");
			default:
				System.out.println("Invalid Input");
				
		}
	}

}
