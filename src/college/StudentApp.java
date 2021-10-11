package college;

import com.kan.beginnersbook.constructor.Student;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student student1 = new Student("Kumaran", "100001");
		Student student2 = new Student("Jeeva", "100002");
		Student student3 = new Student("Lakshmi", "100003");
		Student student4 = new Student("Dinesh", "100004");
		Student student5 = new Student("Naveen", "100005");
		String MystudentName = student1.getName();
		System.out.println("NewName: " + MystudentName);
		
	}
}
		
		
		


