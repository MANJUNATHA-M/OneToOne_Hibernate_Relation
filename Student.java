package com.hibernate.onetoone.OneToOne_Hibernate_Relation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int Sid;
	private String Sname;
	private String SStarting;
	private String SLeaving;
	
	@OneToOne
	private ClassRoom classRoom;

	public int getSid() {
		return Sid;
	}

	public void setSid(int sid) {
		Sid = sid;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public String getSStarting() {
		return SStarting;
	}

	public void setSStarting(String sStarting) {
		SStarting = sStarting;
	}

	public String getSLeaving() {
		return SLeaving;
	}

	public void setSLeaving(String sLeaving) {
		SLeaving = sLeaving;
	}

	public ClassRoom getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(ClassRoom classRoom) {
		this.classRoom = classRoom;
	}

	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", SStarting=" + SStarting + ", SLeaving=" + SLeaving
				+ ", classRoom=" + classRoom + "]";
	}
	
}
