package com.financialsanctionimporter.importer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class IndividualDOB {
	
	@GeneratedValue
	@Id
	private Long id;
	
	private String day;
	
	private String month;
	
	private String year;

	
	public IndividualDOB() {
		
	}

	public IndividualDOB(String day, String month, String year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
}
