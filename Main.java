package com.gmail.gulyaev4420;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Group group = new Group();

		Student student1 = new Student("Sid", "Wilson", 20, 1, true, true);
		Student student2 = new Student("Christina", "Fehna", 22, 2, false, true);
		Student student3 = new Student("James", "Root", 23, 3, true, false);
		Student student4 = new Student("Craig", "Jones", 24, 4, true, false);
		Student student5 = new Student("Joan", "Crahan", 25, 5, false, false);
		Student student6 = new Student("Mick", "Thomson", 26, 6, true, true);
		Student student7 = new Student("Corey", "Taylor", 27, 7, true, true);
		Student student8 = new Student("Jina", "Weinberg", 24, 8, false, true);
		Student student9 = new Student("Alexa", "Venturulla", 25, 9, false, true);
		Student student10 = new Student("Paul", "Gray", 26, 10, true, true);
		Student student11 = new Student("Jona", "Ray", 27, 11, false, true);
		
		try {
			group.addStudent(student1);
			group.addStudent(student2);
			group.addStudent(student3);
			group.addStudent(student4);
			group.addStudent(student5);
			group.addStudent(student6);
			group.addStudent(student7);
			group.addStudent(student8);
			group.addStudent(student9);
			group.addStudent(student10);
			group.addStudent(student11);
			} catch (MyExeption e) {
			System.out.println(e.getMessage());
		}

		System.out.println();

		System.out.println("The first list of students:");
		System.out.println(group);

		System.out.println();

		System.out.println("Deleted student: " + group.delStudets(10));

		System.out.println();

		System.out.println("Searched: " + group.searchStudents("Wilson"));

		System.out.println();

		System.out.println(group);

		System.out.println();

		System.out.println("These students are going to the Army:");
		System.out.println(Arrays.toString(group.goForArmy()));
	}
}