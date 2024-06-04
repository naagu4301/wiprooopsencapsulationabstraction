package wipro_oops.com;
import java.util.*;
public class author {
	String name;
	String email;
	char gender;
	public author(String name,String email,char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
}

	 