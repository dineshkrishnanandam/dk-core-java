package com.kan.beginnersbook.constructor;

/*
 *  When "Run" button is clicked,
	1. Java-JVM searches StudentApp.class and loads it into memory,
	2. and then, invokes "main" method.
*/
public class StudentApp {
	static String collegename = "Saranathan College of Engineering";

	static
	{
		System.out.println("CollegeName  " + collegename);
		System.out.println("=============================================");
	}
	
	public static void main(String[] args) {

		Student student1 = new Student("Kumaran", "100001", 1, 10, 20, 30);
		Student student2 = new Student("Jeeva", "100002", 2, 40, 50, 60);
		Student student3 = new Student("Lakshmi", "100003", 3, 70, 80, 90);
		Student student4 = new Student("Dinesh", "100004", 4, 12, 13, 14);
		Student student5 = new Student("Naveen", "100005", 5, 15, 16, 17);

		// String MystudentName = student1.getName();
		// System.out.println("||MystudentName: " + MystudentName);
		// int student1total = student1.calculateTotalMarks();
		// System.out.println("Student1 Total Marks= " +student1total );
//		int student1avg = student1.calculateAvgMarks();
//		System.out.println("  ||MystudentName1:  " + MystudentName + "  ||Student1 Total Marks=  " + student1total
//				+ "  ||Student1 Avg Marks=  " + student1avg);

		student1.calculateTotalMarks();
		student1.calculateAvgMarks();
		StudentDisplay.printStudent(student1);

		student2.calculateTotalMarks();
		student2.calculateAvgMarks();
		StudentDisplay.printStudent(student2);

	}

	
}
