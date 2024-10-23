package p1;

public class InvalidCarNumberException extends Exception{
	
	String carNumber;

	public InvalidCarNumberException(String carNumber) {
		super();
		this.carNumber = carNumber;
	}

	@Override
	public String toString() {
		return "InvalidCarNumberException [carNumber " + carNumber + "is Invalid!!!"+"]";
	}
	
	

}
