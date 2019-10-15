
public class Starter {

	
	public static void main (String []args ) {

		Address address = new Address('1', "Karl-marx", "26171", "11", "Berlin"); 
		Guest matt = new Guest("matt", address, address); 
		Guest Anna = new Guest("Anna", address, address); 

		matt.setPrivateAdresse(address);
		Anna.setPrivateAdresse(address);
	
		}

	@Override
	public String toString() {
		return "Starter [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
