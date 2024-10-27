package p1;

public class CreditCard extends Payment{
	
	int maxLimit = 50000;

	public CreditCard() {
		super();
	}

	public int getMaxLmit() {
		return maxLimit;
	}

	public void setMaxLmit(int maxLmit) {
		this.maxLimit = maxLimit;
	}
	
	
	@Override
	public PaymentStatus processPayment(int amount) {
		amount += (amount*3)/100;
		super.setAmount(amount);
		if(amount > maxLimit) {
			return PaymentStatus.Denied;
		}
		else
			return PaymentStatus.Approved;
	}
	

	public void doPrint() {
		System.out.println("=================");
		System.out.println("Extra 3% surcharge debited");
		System.out.println("Amount to be paid(via CreditCard) : " + (super.getAmount()));
	}
}
