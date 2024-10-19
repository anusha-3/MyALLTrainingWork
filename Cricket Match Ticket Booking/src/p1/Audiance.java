package p1;

public class Audiance {
	
	private String name;
	private String gender;
	private int age;
	private long phoneNumber;
	

	
	public Audiance(String name, String gender, int age, long phoneNumber) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	@Override
	public String toString() {
		return "Audiance {name=" + name + ", gender=" + gender + ", age=" + age + ", phoneNumber=" + phoneNumber + "}";
	}
	
	
	
	

}
