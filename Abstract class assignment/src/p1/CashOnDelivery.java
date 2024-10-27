package p1;

public class CashOnDelivery extends Payment {
	int locationPincode;
	boolean validLocation;
	
	
	public CashOnDelivery(int locationPincode) {
		super();
		this.locationPincode = locationPincode;
	}


	public int getLocationPincode() {
		return locationPincode;
	}


	public void setLocationPincode(int locationPincode) {
		this.locationPincode = locationPincode;
	}


	public boolean isValidLocation() {
		validLocation = true;
		long invalidLocations[] = {110014, 123456, 110033};
		for(long i : invalidLocations) {
			if(getLocationPincode() == i) {
				validLocation = false;
				return validLocation;
			}
		}
		return validLocation;
	}

	
	@Override
	public PaymentStatus processPayment(int amount) {
		super.setAmount(amount);
		if(isValidLocation()) {
			return PaymentStatus.Approved;
		}
		
		return PaymentStatus.Denied;
	}
	
	@Override
	public void doPrint() {
		System.out.println("Amount to be paid : " + super.getAmount());
	}
	
	
}
