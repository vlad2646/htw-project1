
public class Address {

	int nummer ;
	private String strasse;
	private String hausNr;
	private String plz;
	private String stadt;

	public int getNummer() {
		return nummer;
	}
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public String getHausNr() {
		return hausNr;
	}
	public void setHausNr(String hausNr) {
		this.hausNr = hausNr;
	}
	public String getStadt() {
		return stadt;
	}
	public void setStadt(String stadt) {
		this.stadt = stadt;
	}
	
	public Address(int nummer, String strasse, String plz, String hausNr, String stadt) {
		super();
		this.nummer = nummer;
		this.strasse = strasse;
		this.plz = plz;
		this.hausNr = hausNr;
		this.stadt = stadt;
	}









}
