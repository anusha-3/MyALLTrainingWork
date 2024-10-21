package p1;

public class User {
	
	String username;
	String password;
	String fullname;
	int age;
	Address addres;
	Policy policy;
	
	
	
	public User(String username, String password, String fullname, int age, Address addres, Policy policy) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.age = age;
		this.addres = addres;
		this.policy = policy;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddres() {
		return addres;
	}
	public void setAddres(Address addres) {
		this.addres = addres;
	}
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}


	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", fullname=" + fullname + ", age=" + age
				+ ", addres=" + addres + ", policy=" + policy + "]";
	}
	
	
	

}
