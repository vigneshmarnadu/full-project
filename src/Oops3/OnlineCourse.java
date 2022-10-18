package Oops3;

public class OnlineCourse implements Course {
	public String showCourseId(int id) {
		return "Id"+id;
	}
	
	public String showCourseName(String name) {
		return "Name"+name;
	}
	public String showCourseTrainer(String train) {
		return "Trainer"+train;
	}
	public String showCourseFees(int fees) {
		return "Fees"+fees;
	}

	@Override
	public String shoeCourseFees(int fees) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
