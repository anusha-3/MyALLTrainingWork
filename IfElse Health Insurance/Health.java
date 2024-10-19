class Health{
	private int inssuranceId;
	private String policyName;
	private String policyOwnerName = "ANUSHA BERA";
	int age = 35;
	String gender = "M";
	private int p;
	private int SumAssured = 500000;


	public void planTypeForMale(){
		if(age >= 18 && age <= 50){
			policyName = "M1";
			System.out.println("Policy Name - "+ policyName);
		}
		else if(age > 50 && age <= 70){
			policyName = "M2";
			System.out.println("Policy Name - "+ policyName);
		}
	}

	public void planTypeForFemale(){
		if(age >= 18 && age <= 50){
			policyName = "F1";
			System.out.println("Policy Name - "+ policyName);
		}
		else if(age > 50 && age <= 70){
			policyName = "F2";
			System.out.println("Policy Name - "+ policyName);
		}
	}

	public int surCharge(){
		if(age > 30 && age <= 50){
			int x = (age-30);
			int sc = ((SumAssured*7)/100)*x;
			return sc;
		}
		else if(age > 65){
			int x = (age-65);
			int sc = ((SumAssured*10)/100)*x;
			return sc;
		}
		else
			return 0;
	}

	public int premium(){
		if(policyName == "M1")
			return 8000;
		else if(policyName == "M2")
			return 15000;
		else if(policyName == "F1")
			return 10000;
		else 
			return 20000;
	
	}
	public void doPrint(){

		System.out.println("ID: "+ (int)(Math.random()*123456));
		System.out.println("Policy Owner Name: "+policyOwnerName);

		System.out.println("Age: "+ age);
		System.out.println("Gender: "+ gender);

		if (gender == "F")
			planTypeForFemale();
		else
			planTypeForMale();
		
		System.out.println("Sum Assured: "+ SumAssured);
		System.out.println("**********************");
		System.out.println("Premium Amount: ");
		
		
	}
		

}