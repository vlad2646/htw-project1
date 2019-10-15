
public class Guest {



	private String name;
	private Address  privateAdresse;
	private Address  businessAdresse;
	
	
	public Guest(String name, Address privateAdresse, Address businessAdresse) {
		super();
		this.name = name;
		this.privateAdresse = privateAdresse;
		this.businessAdresse = businessAdresse;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getPrivateAdresse() {
		return privateAdresse;
	}


	public void setPrivateAdresse(Address privateAdresse) {
		this.privateAdresse = privateAdresse;
	}


	public Address getBusinessAdresse() {
		return businessAdresse;
	}


	public void setBusinessAdresse(Address businessAdresse) {
		this.businessAdresse = businessAdresse;
	}
	
	


}
