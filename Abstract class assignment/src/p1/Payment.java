package p1;

public abstract class Payment {
	int amount = 0;
	public abstract PaymentStatus processPayment(int amount);
	
	public Payment() {
		
	}
	
	public Payment(int amount) {
		super();
		this.amount = amount;
	}



	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	public void doPrint() {
		System.out.println("Amount to be paid : " + amount);
	}

}

enum PaymentStatus {
	PaymentMade,
	Approved,
	Denied,
	Failed;
}
