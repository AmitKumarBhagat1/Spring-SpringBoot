package com.springcore.ref;

public class Student {
	private int stdId;
	private String stdName;
	private Address add;
	
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public Student(int stdId, String stdName, Address add) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.add = add;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", add=" + add + "]";
	}
	

}
