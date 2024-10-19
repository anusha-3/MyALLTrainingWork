class ContractualEmployeeSalary{

	private int perDayCost;
	private int workingDays;
	private int basicPayment;

	public void contractualEmpAssigned(){
		perDayCost = 5000;
		workingDays = 24;
		basicPayment = 110000;
	}
	private int perDay(){
		return (perDayCost + ((perDayCost*60)/100));
	}
	private int totalExtraPayment(){
		return (perDay()*(workingDays-22));
	}
	private int grossPayment(){
		return (basicPayment + totalExtraPayment());
	}
	public void contractualEmpInfo(){
		contractualEmpAssigned();
		System.out.println("Per Day Cost: " + perDayCost);
		System.out.println("Working Days: " + workingDays);
		System.out.println("Basic Payment: " + basicPayment);
		System.out.println("======Overtime Payment======");
		System.out.println("Extra Day: " + (workingDays-22));
		System.out.println("Per Day: " + perDay());
		System.out.println("Total Extra Payment: " + totalExtraPayment());
		System.out.println("Gross Payment: " + grossPayment());
		System.out.println("TDS: " + (grossPayment()/10));
		System.out.println("Net Payment Paid: " + (grossPayment() - (grossPayment()/10)));
	}
		
		
}