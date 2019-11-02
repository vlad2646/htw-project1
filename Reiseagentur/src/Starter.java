/**		
*	die Klasse Starter dient als main klasse. Hier initialisieren wir alle Objekte und Weisen Sie ihnen Werte zu. 
*   Wir geben auch alle Werte aus
*   diese Klasse enthält solche Objekte wie Adresse1,Adresse2, Adresse3 Reiseagentur, Bezahlmethode1,Bezahlmethode2,Bezahlmethode3, kunde1, kunde2, kunde3  
*		
*	@author	Vladyslav Ohiienko 0566299
*	
*/
public class Starter {



	public static void main (String []args ) {

		/**		
		* @param Hier erstellen wir ein Objekt mit der Name Adresse und geben die Werte "5a", "Hauptstraße","10559","Berlin"
		*	@author	Vladyslav Ohiienko 0566299
		*	
		*/
		Adresse Adresse = new Adresse("5a", "Hauptstraße","10559","Berlin"); 
		/**		
		*@param  Hier erstellen wir ein Objekt mit der Name reiseagentur und geben die Werte "Magic Holidays Reiseagentur" - als Name und  "DE812524001" als Umsatzsteuer 
		*	@author	Vladyslav Ohiienko 0566299
		*	
		*/
		Reiseagentur reiseagentur = new Reiseagentur ("Magic Holidays Reiseagentur",  "DE812524001" );

		/**		
		* @param Hier geben wir auf die Konsole Name, UST_IDNR und Adresse
		*	@author	Vladyslav Ohiienko 0566299
		*	
		*/
		System.out.println("Name: "+ reiseagentur.getName()+" ");

		System.out.println("UST_IDNR: "+ reiseagentur.getUmsatzsteuer()+" ");

		System.out.print("Adresse: "+Adresse.getStrasse()+" ");

		System.out.print(Adresse.getNummer()+" ");
		System.out.print(Adresse.getPlz()+" ");
		System.out.println(Adresse.getOrt()+" ");



		/**		
		* @param Hier erstellen wir 3 Objekten mit der Name Bezahlmethode1, Bezahlmethode2, Bezahlmethode3 und geben die entsprechende werte die stehen in Klammern () rechts
		*	@author	Vladyslav Ohiienko 0566299
		*	
		*/
		Bezahlmethode Bezahlmethode1 = new Bezahlmethode ("PayPal","max.mustermann@email.de");
		Bezahlmethode Bezahlmethode2 = new Bezahlmethode ("Debit card","5666 2999 8891 3421");
		Bezahlmethode Bezahlmethode3 = new Bezahlmethode ("Deutsche Bank Credit Card","DE 09787 89987 98889 98899 01");

		
		/**		
		* @param Hier erstellen wir 3 Objekten mit der Name Adresse1, Adresse2, Adresse3 und geben die entsprechende Werte die stehen in Klammern () rechts
		*	@author	Vladyslav Ohiienko 0566299
		*	
		*/
		Adresse Adresse1 = new Adresse("4", "Domstrasse","20320","Berlin"); 
		Adresse Adresse2 = new Adresse("2", "Berlinstr","23213","Berlin"); 
		Adresse Adresse3 = new Adresse("1", "Julicher strasse","23232","Berlin"); 

		
		/**		
		* @param Hier erstellen wir 3 Objekten mit der Name kunde1, kunde2, kunde3 und geben die entsprechende Werte die stehen in Klammern () rechts
		*	@author	Vladyslav Ohiienko 0566299
		*	
		*/
		Kunde kunde1 = new Kunde ( 0, "Frau", "Helena", "Mueller", "12.02.1991", "ROM", "+4937621652176", "Helena@gmail.com", Adresse1, Adresse, Bezahlmethode1 ); 
		Kunde kunde2 = new Kunde ( 1, "Herr", "Markus", "Hallen", "2.02.1989", "TOM", "+4917331612126", "hallen221@gmail.com", Adresse2, Adresse, Bezahlmethode2); 
		Kunde kunde3 = new Kunde ( 2, "Herr", "Vladimir", "Orlov", "11.05.1993", "POM", "+4917626612176", "vladimir-orlov@gmail.com", Adresse3, Adresse, Bezahlmethode3);

		/**		
		* @param Wir geben Elemente auf der Konsole aus Kunde1, Kunde2, Kunde3
		* *	@author	Vladyslav Ohiienko 0566299
		*	
		*/
		System.out.println("Kunde1 = " + kunde1);
		System.out.println("Kunde2 = " + kunde2);	
		System.out.println("Kunde3 = " + kunde3);
	
		/**		
		* @param Wir geben Elemente auf der Konsole aus Bezahlmethode 1 , Bezahlmethode 2, Bezahlmethode 3
		* *	@author	Vladyslav Ohiienko 0566299
		*	
		*/
		System.out.println("Bezahlmethode 1: " + Bezahlmethode1.toString());
		System.out.println("Bezahlmethode 2 : " + Bezahlmethode2.toString());
		System.out.println("Bezahlmethode 3 : " + Bezahlmethode3.toString());

	}
}
