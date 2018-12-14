package com.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Student {
	@Id
	@Column(name = "Id")
	private int studId;
	@Column(name = "Name")
	private String stdName;
	@Temporal(TemporalType.DATE)
	@Column(name = "date")
	private Date dt1;
	@Temporal(TemporalType.TIME)
	@Column(name = "time")
	private Date dt2;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dayTime")
	private Date dt3;

	public Student() {
		super();
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Date getDt1() {
		return dt1;
	}

	public void setDt1(Date dt1) {
		this.dt1 = dt1;
	}

	public Date getDt2() {
		return dt2;
	}

	public void setDt2(Date dt2) {
		this.dt2 = dt2;
	}

	public Date getDt3() {
		return dt3;
	}

	public void setDt3(Date dt3) {
		this.dt3 = dt3;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", stdName=" + stdName + ", dt1=" + dt1 + ", dt2=" + dt2 + ", dt3=" + dt3
				+ "]";
	}

}
