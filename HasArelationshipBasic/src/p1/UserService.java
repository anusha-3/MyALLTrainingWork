package p1;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	
	List<User> allUsers = new ArrayList<User>();

	public UserService() {
		User user1 = new User("anusha", "anu123", "Anusha Bera", 22, new Address("Ajanta", "Baguiati", "Kolkata", "WB"), null);
		allUsers.add(user1);
		User user2 = new User("Abhishikta", "abhi123", "Anusha Bera", 22, null, null);
		allUsers.add(user2);
	}

	public List<User> getAllUsers() {
		return allUsers;
	}

	public void setAllUsers(List<User> allUsers) {
		this.allUsers = allUsers;
	}
	
	public User getUser(String username, String password) {
		for(User user : allUsers) {
			if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

	
	
	
	

}
