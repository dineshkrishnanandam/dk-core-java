package com.kan.beginnersbook.constructor;

public class Student {

	private String name;
	private String rollNumber;
	private int age;
	private int tamilmark;
	private int englishmark;
	private int mathsmark;
	private int total;
	private int avg;

	public Student(String name, String rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;

	}

	public Student(String name, String rollNumber, int age, int tamilmark, int englishmark, int mathsmark) {

		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.age = age;
		this.tamilmark = tamilmark;
		this.englishmark = englishmark;
		this.mathsmark = mathsmark;
	}

	public String getName() {
		return this.name;
	}

	public void displayStudentInfo() {
		System.out.println("name=" + name + ", rollNumber=" + rollNumber);
	}

	public void calculateTotalMarks() {
		total = (tamilmark + englishmark + mathsmark);

	}

	public void calculateAvgMarks() {
		avg = ((total) / 3);

	}

	public int getTotal() {
		return this.total;
	}

	public int getAvg() {
		return this.avg;
	}

}
