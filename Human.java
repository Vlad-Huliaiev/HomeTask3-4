package com.gmail.gulyaev4420;

public class Human {

	private String firstName;
	private String lastName;
	private int age;
	private long numderList;
	private boolean sex;

	public Human(String firstName, String lastName, int age, long numderList, boolean sex) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.numderList = numderList;
		this.sex = sex;
	}

	public Human() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String fistName) {
		this.firstName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getNumderList() {
		return numderList;
	}

	public void setNumderList(long numderList) {
		this.numderList = numderList;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Human [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", numderList="
				+ numderList + ", sex=" + sex + "]";
	}

}
