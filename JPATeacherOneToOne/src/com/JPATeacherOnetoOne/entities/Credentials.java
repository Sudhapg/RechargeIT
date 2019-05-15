package com.JPATeacherOnetoOne.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Credentials")
public class Credentials {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="credential_id")
	private long id;
	private String username;
	private String pwd;
	
	@OneToOne
	private Teacher teacher;
	
	public Credentials() {
		
	}
	
	public Credentials(long id,String username,String pwd) {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	

}
