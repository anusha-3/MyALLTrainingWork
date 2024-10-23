package p1;

public class User {
	
	String fullName;
	String applicationDate;
	String carNumber;
	
	
	public User(String fullName, String applicationDate, String carNumber) {
		super();
		this.fullName = fullName;
		this.applicationDate = applicationDate;
		this.carNumber = carNumber;
	}
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	
	
	@Override
	public String toString() {
		return "User [fullName=" + fullName + ", applicationDate=" + applicationDate + ", carNumber=" + carNumber + "]";
	}
	
	

}
