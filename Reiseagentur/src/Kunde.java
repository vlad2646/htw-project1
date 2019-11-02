


/**		
 *	@param  die Klasse Kunde 
 *  @param   diese Klasse enthält solche Attributen wie Kundennummer , Anrede, Vorname, Nachname, Geburtsdatum, name, Telefonnummer, Mail, Adresse1, Adresse2. 
 *		
 *	@author	Vladyslav Ohiienko 0566299
 *	
 */
public class Kunde {



	int Kundennummer;
	private String Anrede; 
	private String Vorname; 
	private String Nachname; 
	private String Geburtsdatum; 
	private  String name;
	private String Telefonnummer; 
	private  String Mail;
	private Adresse Adresse1;
	private Adresse Adresse2;



	/**		
	 *	@param  Konstruktor  macht die Zuweisung. Es wurde hier festlegt, wie ein neues Objekt Bezahlmethode, eine Instanz zu initialisieren. Folglich haben wir hier die Werte
	 *    @param Beschreibung und  Bezeichnung die wurden ins Starter Klasse angelegt 
	 *		
	 *	@author	Vladyslav Ohiienko 0566299
	 *		
	 */	



	public Kunde(int kundennummer, String anrede, String vorname, String nachname, String geburtsdatum, String name,
			String telefonnummer, String mail, Adresse adresse1, Adresse adresse2, Bezahlmethode Bezahlmethode) {
		super();
		Kundennummer = kundennummer;
		Anrede = anrede;
		Vorname = vorname;
		Nachname = nachname;
		Geburtsdatum = geburtsdatum;
		this.name = name;
		Telefonnummer = telefonnummer;
		Mail = mail;
		Adresse1 = adresse1;
		Adresse2 = adresse2;
		Bezahlmethode = Bezahlmethode; 
	}
	@Override


	/**		
	 *	@param die Methode toString gibt auf die Konsole die Werte von Kundennummer , Anrede, Vorname, Nachname, Geburtsdatum, name, Telefonnummer, Mail, Adresse1, Adresse2

	 *	@author	Vladyslav Ohiienko 0566299
	 *	@version	1.0		
	 */	

	public String toString() {
		return "Kunde [Kundennummer=" + Kundennummer + ", Anrede=" + Anrede + ", Vorname=" + Vorname + ", Nachname="
				+ Nachname + ", Geburtsdatum=" + Geburtsdatum + ", name=" + name + ", Telefonnummer=" + Telefonnummer
				+ ", Mail=" + Mail + ", Adresse1=" + Adresse1 + ", Adresse2=" + Adresse2 + "]";
	}


}
