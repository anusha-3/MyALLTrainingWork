package p1;

public class Address {
	String houseName;
	String street;
	String city;
	String state;
	
	
	public Address(String houseName, String street, String city, String state) {
		super();
		this.houseName = houseName;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	
	
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address [houseName=" + houseName + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	
	

}
