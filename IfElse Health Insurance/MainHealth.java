class MainHealth{
	public static void main(String[] args){

		Health h = new Health();
		h.doPrint();
		
		int p = h.premium();
		System.out.println("Base Premium: " + p);
		
		int x = h.surCharge();
		System.out.println("Sur Charge: "+ x);
		
		System.out.println("Total Premium: "+ (x+p));
		
	}

}