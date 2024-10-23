package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	
	public boolean verifyDate(String dob) throws InvalidDateException {
		String regex1 = "^(0?[1-9]|[12][0-9]|30)-(0?[1-9]|[1][0-2])-[0-9]{4}$";
		String regex2 = "^(0?[1-9]|[12][0-9]|30)-(0?[1-9]|[1][0-2])-[0-9]{2}$";
		Pattern pattern1 = Pattern.compile(regex1);
		Matcher matcher1 = pattern1.matcher(dob);
		
		Pattern pattern2 = Pattern.compile(regex2);
		Matcher matcher2 = pattern2.matcher(dob);
		
		boolean verified = matcher1.find() || matcher2.find();
		
		if(verified) {
			return true;
		}
		
		else
			throw new InvalidDateException(dob);
		
	}
	
	public boolean verifyCarNumber(String carNumber) throws InvalidCarNumberException {
		String regex = "^[A-Z]{2}\\s\\d{1}[A-Z]{2}\\s\\d{4}$";
		Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(carNumber);
        boolean verified = matcher.find();
        if(verified) {
        	return verified;
        }
        else throw new InvalidCarNumberException(carNumber);
	}

}
