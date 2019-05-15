package jpa.entitymodels;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Student")
public class Student {
	@Id
	@Column(name="email")
	private String sEmail;
	@Column(name="name")
	private String sName;
	@Column(name="password")
	private String sPass;
	
	@OneToMany
	private List<Course> sCourses;
	
	public Student() {
		
	}
	
	public Student(String sEmail,String sName,String sPass,List<Course> sCourses) {
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPass;
		this.sCourses = sCourses;
	}
	
	public String toString() {
		
		return (this.sEmail+" "+this.sName+" "+this.sPass);
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPass() {
		return sPass;
	}

	public void setsPass(String sPass) {
		this.sPass = sPass;
	}

	public List<Course> getsCourses() {
		return sCourses;
	}

	public void setsCourses(List<Course> sCourses) {
		this.sCourses = sCourses;
	}

public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
		Student other = (Student) obj;
		
		//validation
		boolean sameemail = this.sEmail.equals(other.getsEmail());
		boolean samename = this.sName.equals(other.getsName());
		boolean samepassword = this.sPass.equals(other.getsPass());
		
		if(samename && sameemail && samepassword) {
		return true;
		}else {
			return false;
		}
		}else {
			return false;
		}
	}
}
