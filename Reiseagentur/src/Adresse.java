


/**		
*	die Klasse Adresse 
*   diese Klasse enthält solche Attributen wie strasse , Hausnummer, PLZ und ORT 	
*		
*	@author	Vladyslav Ohiienko 0566299
*	@version	1.0		
*/		

public class Adresse {



	private String strasse;
	private String Hausnummer ;
	private String plz;
	private String Ort;


	@Override
	
	/**		
	*	die Methode toString gibt auf die Konsole die Inhalte von strasse  Hausnummer plz und Ort 
	*   
	*		
	*	@author	Vladyslav Ohiienko 0566299
	*	@version	1.0		
	*/		

	public String toString() {
		return "Adresse [strasse=" + strasse + ", Hausnummer=" + Hausnummer + ", plz=" + plz + ", Ort=" + Ort + "]";
	}
	/**		
	*	die Methode get hilft uns auf Hausnummer Elementen zugreifen und hat diese Element als Rückgabe= return Wert  
	*	@return Hausnummer	
	* 
	*	@author	Vladyslav Ohiienko 0566299
	*		
	*/	


	public String getNummer() {
		return Hausnummer;
	}
	/**		
	*	die Methode setNummer hilft uns die Zuweisung durchführen. Wir geben zu unseren Variable, anderes Wert 
	*		
	* 
	*	@author	Vladyslav Ohiienko 0566299
	*		
	*/	
	public void setNummer(String nummer) {
		this.Hausnummer = nummer;
	}

	/**		
	*	die Methode get helfen uns auf Hausnummer Elementen zugreifen und hat diese Element als Rückgabe= return Wert  
	*		
	* 
	*	@author	Vladyslav Ohiienko 0566299
	*		@return strasse
	*/	
	public String getStrasse() {
		return strasse;
	}
	
	

	/**		
	*	@deprecated  die Methode setStrasse hilft uns die Zuweisung durchführen 
	*		
	* 
	*	@author	Vladyslav Ohiienko 0566299
	*		
	*/	
	
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	/**		
	*	die Methode getOrt hilft uns auf Ort Elementen zugreifen und hat diese Element als Rückgabe= return Wert  
	*		
	* 
	*	@author	Vladyslav Ohiienko 0566299
	*		
	*/	

	public String getOrt() {
		return Ort;
	}
	

	/**		
	*	@deprecated  die Methode setOrt hilft uns die Zuweisung durchführen. Wir geben zu unseren Variable, anderen Wert 
	*		
	* 
	*	@author	Vladyslav Ohiienko 0566299
	*		
	*/	
	public void setOrt(String ort) {
		Ort = ort;
	}

	/**		
	*	@deprecated  die Methode getPlz hilft uns auf Plz Elementen zugreifen und hat diese Element als Rückgabe= return Wert  
	*		
	* @return plz
	*	@author	Vladyslav Ohiienko 0566299
	*		
	*/	
	public String getPlz() {
		return plz;
	}
	/**		
	*	die Methode setPlz hilft uns die Zuweisung durchführen. Wir geben zu unseren Variable, anderes Wert 
	*		
	* 
	*	@author	Vladyslav Ohiienko 0566299
	*		
	*/	
	public void setPlz(String plz) {
		this.plz = plz;
	}


	
	/**		
	*	der Konstruktor - es  macht die Zuweisung. Es wurde hier festgelegt, wie ein neues Objekt, eine Instanz zu initialisieren 
	*		
	*	@author	Vladyslav Ohiienko 0566299
	*		
	*/	


	public Adresse(String Hausnummer,String strasse,String plz,String Ort) {
		super();
		this.Hausnummer = Hausnummer;
		this.strasse = strasse;	
		this.plz = plz;
		this.Ort = Ort;

	}
	
	
	

}
