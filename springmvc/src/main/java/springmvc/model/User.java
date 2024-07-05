package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String email1;
	private String name1;
	private String psw1;
	

	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getPsw1() {
		return psw1;
	}
	public void setPsw1(String psw1) {
		this.psw1 = psw1;
	}
	@Override
	public String toString() {
		return "User [email1=" + email1 + ", name1=" + name1 + ", psw1=" + psw1 + "]";
	}
	
	
}
