package p1;

public class Policy {
	
	private int pid;
	private String policyName;
	private int premiumAmount;
	
	
	
	
	public Policy(int pid, String policyName, int premiumAmount) {
		super();
		this.pid = pid;
		this.policyName = policyName;
		this.premiumAmount = premiumAmount;
	}
	
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public int getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}



	@Override
	public String toString() {
		return "Policy [pid=" + pid + ", policyName=" + policyName + ", premiumAmount=" + premiumAmount + "]";
	}
	
	
	

}
