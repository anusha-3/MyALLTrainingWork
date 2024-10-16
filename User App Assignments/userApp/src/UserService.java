
public class UserService {

    String validDomains[] = { "gmail.com", "outlook.com", "hotmail.com", "zoho.com" };

    public boolean doEmailDomainVerification(String email) {
        boolean verified = false;

        // write code here , to verify that email domain belongs to the given valid
        // domains
        for (String s : validDomains) {
            if (email.contains(s))
                ;
            verified = true;
            break;
        }

        return verified;
    }

    public String getUserName(String email) {
        // write code to retrieve username from email and send back
        return null;
    }

    public boolean isWordContains(String word, String wholeString) {
        // write code which returns true if wholeString contains word
        if (wholeString.contains(word))
            return true;

        return false;
    }

}