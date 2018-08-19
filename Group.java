package com.gmail.gulyaev4420;

import java.util.Arrays;

import com.gmail.gulyaev4420.MyExeption;

public class Group implements Voencom {

	private Student[] studentsMas = new Student[10];

	public Group(Student[] studentsMas) {
		super();
		this.studentsMas = studentsMas;
	}

	public Group() {
		super();
	}

	public Student[] getStudentMas() {
		return studentsMas;
	}

	public void setStudentMas(Student[] studentMas) {
		this.studentsMas = studentMas;
	}

	public void addStudent(Student student) throws MyExeption {
		if (student == null) {
			throw new IllegalArgumentException("No student");
		}
		for (int i = 0; i < studentsMas.length; i = i + 1) {
			if (studentsMas[i] == null) {
				studentsMas[i] = student;
				System.out.println(student.getLastName() + " added to group.");
				return;
			}
		}
		throw new MyExeption();
	}

	public boolean delStudets(long n) {
		for (int i = 0; i < studentsMas.length; i++) {
			if (studentsMas[i] != null && studentsMas[i].getNumderList() == n) {
				System.out.println();
				System.out.println(studentsMas[i].getLastName() + " deleted from group ");
				studentsMas[i] = null;
				return true;
			}
		}
		return false;
	}

	public Student searchStudents(String name) {
		for (Student students : studentsMas) {
			if (students != null && students.getLastName().equals(name)) {
				return students;
			}
		}
		return null;
	}

	public Student[] goForArmy() {
		int size = 0;
		for (Student student : studentsMas) {
			if (student != null && student.isSex() != false && student.getAge() >= 20
					&& student.isWasLecture() == false) {
				size++;
			}
		}

		Student[] voenkomMas = new Student[size];
		int i = 0;
		for (Student student : this.studentsMas) {
			if (student != null && student.isSex() != false && student.getAge() >= 20
					&& student.isWasLecture() == false) {
				voenkomMas[i++] = student;
			}
		}
		return voenkomMas;
	}

	@Override
	public String toString() {
		return "Group [studentsMas=" + Arrays.toString(studentsMas) + "]";
	}

}