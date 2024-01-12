package com.hibernate.onetoone.OneToOne_Hibernate_Relation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClassRoom {
	
	@Id
	private int CNumber;
	private String CBenchNo;
	private String CSection;
	public int getCNumber() {
		return CNumber;
	}
	public void setCNumber(int cNumber) {
		CNumber = cNumber;
	}
	public String getCBenchNo() {
		return CBenchNo;
	}
	public void setCBenchNo(String cBenchNo) {
		CBenchNo = cBenchNo;
	}
	public String getCSection() {
		return CSection;
	}
	public void setCSection(String cSection) {
		CSection = cSection;
	}
	@Override
	public String toString() {
		return "ClassRoom [CNumber=" + CNumber + ", CBenchNo=" + CBenchNo + ", CSection=" + CSection + "]";
	}
	


	

}
