package p1;

public class MainClass {
	public static void main(String[] args) {
		Payment p;
		
		
//		===================================
		p = new CashOnDelivery(110014);
		PaymentStatus status = p.processPayment(10000);
		
		if(status == PaymentStatus.Approved) {
			p.doPrint(); 
			
		}
		else {
			System.out.println("Error");
		}
		
//		===================================
		
		p = new UPIpayment();
		status = p.processPayment(10000);
		
		if(status == PaymentStatus.Approved) {
			p.doPrint();
		}
		else {
			System.out.println("Error");
		}
		
//		===================================
		
		p = new CreditCard();
		status = p.processPayment(47000);
		if(status == PaymentStatus.Approved) {
			p.doPrint();
		}
		else {
			System.out.println("Error");
		}
		
		
		
		
	}

}
