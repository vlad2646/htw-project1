




/**		
*  @param die Klasse Bezahlmethode 
*  @see  diese Klasse enthält solche Attributen wie Beschreibung , Bezeichnung. 
*		
*	@author	Vladyslav Ohiienko 0566299
*	
*/
public class Bezahlmethode {

	/**		
	*  @param Beschreibung 
	*/

	String Beschreibung;
	/**		
	*  @param Bezeichnung 
	*/
	String Bezeichnung; 


	/**		
	*	 Konstruktor  macht die Zuweisung. Es wurde hier festlegt, wie ein neues Objekt Bezahlmethode, eine Instanz zu initialisieren. Folglich haben wir hier die Werte
	*Beschreibung und  Bezeichnung die wurden ins Starter Klasse angelegt 
	*		
	*	@author	Vladyslav Ohiienko 0566299
	*		
	*/	


	public Bezahlmethode(String Beschreibung, String Bezeichnung) {
		super();
		
		/**		
		 
		*	Wir brauchen 2 Dimensionalen Array um die Elemente richtig zu speichern. Folglich zu jeder Beschreibung wir brauchen Bezeichnung und die müssen in eine Relation zu einander stehen. 
		
		*
		*@author	Vladyslav Ohiienko 0566299
		*		
		*/	
		
		/**		
		 hier initialisieren wir diese Array 
		*		
		*/	
		String[][]	Bezahlmethode;	
		/**		
		 Hier geben wir die Anzahl von Elementen die können wir speichern in diesem Array ( in der beiden Deminsionen )
		*		
		*/
		int anzZeilen =2; 
		int anzSpalten=2;	
		Bezahlmethode= new String[anzZeilen][anzSpalten];		

		this.Beschreibung = Bezahlmethode[0][0]= Beschreibung;
		this.Bezeichnung =  Bezahlmethode[0][1]= Bezeichnung;
		// TODO Auto-generated constructor
	}




	/**		
	*	die Methode getBeschreibung hilft uns auf Plz Elementen zugreifen und hat diese Element als Rückgabe= return Wert  
	*		
	*   @return Beschreibung 
	*	@author	Vladyslav Ohiienko 0566299
	*		
	*/	

	public String getBeschreibung() {
		return Beschreibung;
	}

	
	/**		
	*	die Methode setBeschreibung hilft uns die Zuweisung durchführen. Wir weisen unserer Variablen einen anderen Wert zu

	*	@author	Vladyslav Ohiienko 0566299
	*		
	*/	
	public void setBeschreibung(String beschreibung) {
		Beschreibung = beschreibung;
	}





	/**		
	*	@param die Methode toString gibt auf die Konsole die Inhalte von Beschreibung und Bezeichnung
	*   
	*		
	*	@author	Vladyslav Ohiienko 0566299
	*	@version	1.0		
	*/		


	@Override
	public String toString() {
		return "Bezahlmethode [Beschreibung=" + Beschreibung + ", Bezeichnung=" + Bezeichnung + "]";
		
	}

	



	/**		
	*	@param die Methode getBezeichnung hilft uns auf Plz Elementen zugreifen und hat diese Element als Rückgabe= return Wert  
	*		
	* 
	*	@author	Vladyslav Ohiienko 0566299
	*		
	*/	
	
	public String getBezeichnung() {
		return Bezeichnung;
	}

	
	/**		
	*	@param die Methode setBezeichnung hilft uns die Zuweisung durchführen. Wir weisen unserer Variablen einen anderen Wert zu

	*		
	* 
	*	@author	Vladyslav Ohiienko 0566299
	*		
	*/	

	public void setBezeichnung(String bezeichnung) {
		Bezeichnung = bezeichnung;
	}	


}


