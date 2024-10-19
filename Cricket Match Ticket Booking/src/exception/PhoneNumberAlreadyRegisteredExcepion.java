package exception;

public class PhoneNumberAlreadyRegisteredExcepion extends Exception {
	
	long phoneNumber;
	
	
    public PhoneNumberAlreadyRegisteredExcepion(long phoneNumber2) {
		super();
		this.phoneNumber = phoneNumber2;
	}


	@Override
    public String toString() {
        return "[PhoneNumberAlreadyRegisteredExcepion] Phone Number: " + phoneNumber + " already registered!!";
    } 

}
