class RegularEmployeeSalary{
	
	private int empID;
	private String name;
	private String designation;
	private int basicSalary;
	private int hra;
	private int da;
	private int ta;
	private int tax;
	
	private int perDayCost = 5000;
	private int workingDays = 24;
	private int basicPayment = 110000;
	
	public void assigned(int empID, String name, String designation, int basicSalary){
		this.name = name;
		this.empID = empID;
		this.designation = designation;
		this.basicSalary = basicSalary;
		
	}
	private int hra(){
		return ((basicSalary*17)/100);
	}
	private int da(){
		return ((basicSalary*10)/100);
	}
	private int ta(){
		return (((basicSalary + da())*5)/100);
	}
	private int totalSalary(){
		if (designation == "Software Engineer")
			return (basicSalary + hra() + da());
		else
			return (basicSalary + hra() + da()+ ta());
	}
	private int annualSalary(){
		return (basicSalary + hra() + da() +ta())*12;
	}
	private int tax(){
		if(annualSalary() < 250000)
			return 0;
		else if(annualSalary() > 250000 && annualSalary() < 700000)
			return 10;
		else if(annualSalary() > 700001 && annualSalary() < 1200000)
			return 20;
		else
			return 30;
	}
	public void doPrint(){
		System.out.println("Employee ID: " + empID);
		System.out.println("Name: " + name);
		System.out.println("Designation: " + designation);
		System.out.println("Basic Salary: " + basicSalary);
		System.out.println("HRA: " + hra());
		System.out.println("DA: " + da());
		if(designation == "Manager")
			System.out.println("TA: "+ ta());
		System.out.println("Total Salary: " + totalSalary());
		System.out.println("Annual Salary: " + annualSalary());
		int t = ((annualSalary()*tax())/100);
		System.out.println("Tax " + tax()+"%: " + t);
		System.out.println("Net Salary: "+ (annualSalary()-t));
		
	}



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
		System.out.println("Extra Day: " + (workingDays-22));
		System.out.println("Per Day: " + perDay());
		System.out.println("Total Extra Payment: " + totalExtraPayment());
		System.out.println("Gross Payment: " + grossPayment());
		System.out.println("TDS: " + (grossPayment()/10));
		System.out.println("Net Payment Paid: " + (grossPayment() - (grossPayment()/10)));
	}
		
		
}