package com.gmail.gulyaev4420;

public class Student extends Human {

	private boolean wasLecture;
	

	public Student(String firstName, String lastName, int age, long numderList, boolean sex, boolean wasLecture) {
		super(firstName, lastName, age, numderList, sex);
		this.wasLecture = wasLecture;
	}

	public Student(String firstName, String lastName, int age, long numderList, boolean sex) {
		super(firstName, lastName, age, numderList, sex);
	}

	public boolean isWasLecture() {
		return wasLecture;
	}

	public void setWasLecture(boolean wasLecture) {
		this.wasLecture = wasLecture;
	}

	@Override
	public String toString() {
		return "Student [wasLecture=" + wasLecture + ", " + super.toString();
	}

}
