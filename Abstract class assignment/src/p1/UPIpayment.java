package p1;

public class UPIpayment extends Payment {
	
	public UPIpayment() {
		super();
	}

	public PaymentStatus processPayment(int amount) {
		super.setAmount(amount);
		return PaymentStatus.Approved;
	}
	
	public void doPrint() {
		System.out.println("=================");
		int cashBack = (super.getAmount()*5)/100;
		System.out.println("5% cashback provided");
		System.out.println("Amount to be paid(via UPI) : " + (super.getAmount()-cashBack));
	}
}