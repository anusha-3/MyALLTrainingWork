package p1;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	public static void main(String[] args) throws Exception {
		Validator validator = new Validator();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String carNumber = "DL 1CU 7890";
		String userName = br.readLine();
		
		String carNumber = br.readLine();
		boolean verifiedCarNumber = validator.verifyCarNumber(carNumber);
		
		String dob = br.readLine();
		boolean verifiedDate = validator.verifyDate(dob);
		
		if(verifiedCarNumber && verifiedDate) {
			User user = new User(userName, carNumber, dob);
			displayUserDetails(user);
		}

		
	}
	
	public static void displayUserDetails(User user) {
		System.out.println(user);
	}

}
