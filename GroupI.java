package com.gmail.gulyaev4420;

import java.util.Scanner;

public class GroupI {

	public String getFirstName() {
		System.out.println("Input fist name student");
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	public String getLastName() {
		System.out.println("Input last name student");
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	public int getAge() {
		System.out.println("Input age student");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public long getNumderList() {
		System.out.println("Input numder list student");
		Scanner sc = new Scanner(System.in);
		return sc.nextLong();
	}

	public boolean getWasLecture() {
		System.out.println("Input, if this student was a lecture: True or False");
		Scanner sc = new Scanner(System.in);
		return sc.nextBoolean();
	}

	public boolean getSleptLecture() {
		System.out.println("Input, if this student slept a lecture: True or False");
		Scanner sc = new Scanner(System.in);
		return sc.nextBoolean();
	}

	public Student newStudent() {
		Student student = new Student(getFirstName(), getLastName(), getAge(), getNumderList(), getWasLecture(),
				getSleptLecture());
		return student;
	}

}
