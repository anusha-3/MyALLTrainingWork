package exception;

public class ExceedsMaxTicketException extends Exception {
	
	String msg;
	
	
    public ExceedsMaxTicketException(String msg) {
		super();
		this.msg = msg;
	}


	@Override
    public String toString() {
        return "[ExceedsMaxTicketException] : " + msg;
    } 

}
