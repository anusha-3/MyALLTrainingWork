package p1;

public class InvalidDateException extends Exception{
	
	String dob;

	public InvalidDateException(String dob) {
		super();
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "InvalidDateException [Date " + dob + "is Invalid!!!"+"]";
	}
	

}
