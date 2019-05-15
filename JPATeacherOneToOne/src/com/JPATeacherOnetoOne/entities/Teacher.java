package com.JPATeacherOnetoOne.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Teacher")
public class Teacher {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "id")

private long id;

private String tname;
private int salary;

@OneToOne
@JoinColumn(name = "credential_id")
private Credentials credentials;

public Teacher() {
	
}

public Teacher(int id,String tname,int salary) {
	this.id = id;
	this.tname = tname;
	this.salary = salary;
	
}

public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}

public Credentials getCredentials() {
	return credentials;
}

public void setCredentials(Credentials credentials) {
	this.credentials = credentials;
}




}
