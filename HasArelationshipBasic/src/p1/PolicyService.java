package p1;

import java.util.ArrayList;
import java.util.List;

public class PolicyService {
	
	List<Policy> allPolicy = new ArrayList<Policy>();
	
	public PolicyService(){
		Policy p1 = new Policy(101, "Policy-1", 50000);
		Policy p2 = new Policy(102, "Policy-2", 70000);
		Policy p3 = new Policy(103, "Policy-3", 100000);
		allPolicy.add(p1);
		allPolicy.add(p2);
		allPolicy.add(p3);
	}

	public List<Policy> getAllPolicy() {
		return allPolicy;
	}

	public void setAllPolicy(List<Policy> allPolicy) {
		this.allPolicy = allPolicy;
	}
	
	public Policy getPolicyByID(int pid) {
		for(Policy p : allPolicy) {
			if(p.getPid() == pid) {
				return p;
			}
		}
		return null;
	}
	
	public Policy getPolicyByPolicyName(String policyName) {
		for(Policy p : allPolicy) {
			if(p.getPolicyName().equals(policyName)) {
				return p;
			}
		}
		return null;
	}
	
	
	
	

}
