

/**		
*	@param  die Klasse Reiseagentur enthält die Variable name, Umsatzsteuer
*	
*	@author	Vladyslav Ohiienko 0566299
*	
*/
public class Reiseagentur {

	String name; 
	String Umsatzsteuer; 




	Adresse Adresse1;

	
	/**		
	*	@param die Methode getName hilft uns auf Name Elementen zugreifen und hat diese Element als Rückgabe= return Wert  
	*		
	* @return name
	*	@author	Vladyslav Ohiienko 0566299
	*		
	*/	
	public String getName() {
		return name;
	}

	
	/**		
	*	die Methode setName hilft uns die Zuweisung durchführen. Wir geben zu unseren Variable, anderes Wert 
	*		
	* 
	*	@author	Vladyslav Ohiienko 0566299
	*		
	*/	
	
	public void setName(String name) {
		this.name = name;
	}

	
	/**		
	*	 @param die Methode getUmsatzsteuer hilft uns auf Umsatzsteuer Element zugreifen und hat diese Element als Rückgabe= return Wert  
	*	@author	Vladyslav Ohiienko 0566299
	*		@return Umsatzsteuer
	*/	
	public String getUmsatzsteuer() {
		return Umsatzsteuer;
	}

	
	/**		
	*	@param die Methode setUmsatzsteuer hilft uns die Zuweisung durchführen. Wir geben zu unseren Variable, anderes Wert 
	*		
	* 
	*	@author	Vladyslav Ohiienko 0566299
	*		
	*/	
	public void setUmsatzsteuer(String umsatzsteuer) {
		Umsatzsteuer = umsatzsteuer;
	}

	/**		
	*	@param die Methode getAdresse1 hilft uns auf Adresse1 Elementen zugreifen und hat diese Element als Rückgabe= return Wert  
	*		
	* @return Adresse1
	*	@author	Vladyslav Ohiienko 0566299
	*		
	*/	
	public Adresse getAdresse1() {
		return Adresse1;
	}

	
	/**		
	*	@param die Methode setAdresse1 hilft uns die Zuweisung durchführen. Wir geben zu unseren Variable, anderes Wert 
	*		
	* 
	*	@author	Vladyslav Ohiienko 0566299
	*		
	*/	
	public void setAdresse1(Adresse adresse1) {
		Adresse1 = adresse1;
	}

	
	
	/**		
	*	der Konstruktor - es  macht die Zuweisung. Es wurde hier festgelegt, wie ein neues Objekt, eine Instanz zu initialisieren 
	*		
	*	@author	Vladyslav Ohiienko 0566299
	*		
	*/	
	public Reiseagentur(String name, String Umsatzsteuer ) {
		super();


		this.name = name;
		this.Umsatzsteuer = Umsatzsteuer; 

		// TODO Auto-generated constructor stub
	}
}
