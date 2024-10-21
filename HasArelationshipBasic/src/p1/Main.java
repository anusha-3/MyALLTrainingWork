package p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	PolicyService policyService = new PolicyService();
	UserService userService = new UserService();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Main app = new Main();
		System.out.println("=========All Policy=========");
		app.showAllAvailablePolicy();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("1. Login");
			System.out.println("2. Exit");
			
			System.out.println("Enter Choice: ");
			int choice = Integer.parseInt(br.readLine());
			
			switch(choice) {
			case 1:
			
				System.out.println("Enter username: ");
				String username = br.readLine();
				System.out.println("Enter password: ");
				String password = br.readLine();
//				User user = app.getUser(username, password);
				if(app.getUser(username, password) != null) {
					System.out.println("Login Successfull");
					
					app.printUserDetails(app.getUser(username, password));
				}
				else {
					System.out.println("Invalid User!!!");
					break;
				}
				User user = app.getUser(username, password);
									
				System.out.println("=========All Policy=========");
				app.showAllAvailablePolicy();
				
				app.logedIn(username, password);
				app.printUserDetails(user);
				
				
				
				break;
			case 0:
				System.exit(0);
				
			default:
	            System.out.println("Wrong Option");
	            break;
			}
			
		}
//		System.out.println("====Get Policy By ID====");
//		System.out.println("Enter Policy ID: ");
//		int pid = Integer.parseInt(br.readLine());
//		Policy policyById = app.getPolicy(pid);
//		System.out.println(policyById);
		
//		System.out.println("====Get Policy By Policy Name====");
//		System.out.println("Enter Policy Name: ");
//		String policyName = br.readLine();
//		Policy policyByPolicyName = app.getPolicy(policyName);
//		System.out.println(policyByPolicyName);
	
		
		
	}
	
	public void showAllAvailablePolicy() {
		for (Policy p: policyService.getAllPolicy()) {
			System.out.println(p);
			
		}
		
		System.out.println("----------------------------------------");
	}
	
	public Policy getPolicy(int pid) {
		Policy p = policyService.getPolicyByID(pid); 
		return p;
		
	}
	
	public Policy getPolicy(String policyName) {
		Policy p = policyService.getPolicyByPolicyName(policyName);
		return p;
	}
	
	public User getUser(String username, String password) {
		User user = userService.getUser(username, password);
		
		return user;
		
	}
	
	public void setPolicyForUser(User user, Policy policy) {
		
		user.setPolicy(policy);
	}
	

	
	public void printUserDetails(User user) throws IOException {
		
			// code to Print user values 
		
		
			System.out.println("User Name: "+user.getFullname());
			if(user.getAddres()==null) {
				System.out.println("Update Address");  // in web , replaced through hyperlink
				
			}
			else System.out.println("Address "+user.getAddres());
			
			if(user.getPolicy() == null) {
				System.out.println("No policy Selected");
			}else
			{
				System.out.println(user.getPolicy());
				
			
			}
			
		}
	
	public void setUserAddress(User user)throws IOException
	{
		System.out.println("Enter House Name: ");
		String houserName = br.readLine();
		System.out.println("Enter Street Name: ");
		String street = br.readLine();
		System.out.println("Enter City Name: ");
		String city = br.readLine();
		System.out.println("Enter State Name: ");
		String state = br.readLine();
		
		user.setAddres(new Address(houserName, street, city, state));
	
	}
	
	public void logedIn(String username, String password) throws IOException {
		User user = getUser(username, password);
		
		if(user.getAddres() == null) {
			setUserAddress(user);
		}
		else 
			System.out.println(user.getAddres());
		if(user.getPolicy() == null) {
			System.out.println("Enter Policy ID which Policy You want: ");
			int pID = Integer.parseInt(br.readLine());
			
			setPolicyForUser(user, getPolicy(pID));
			
			System.out.println("Policy purchase successful.");
		}
		else {
			System.out.println("You have already one policy");
		}
		
			
			
	}
}
