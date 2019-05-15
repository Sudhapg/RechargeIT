package bnym.casestudy.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHORITIES")
@IdClass(Authorities.IdClass.class)
public class Authorities {
	
	  @Id
	  @Column(name = "AUTHORITY")
	  private String authority;

	  @Id
	  @ManyToOne
	  @JoinColumn(name = "USERNAME")
	  private User user;

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	
    static class IdClass implements Serializable {
        private String authority;
        private User user;
    }
}
