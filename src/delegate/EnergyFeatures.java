package delegate;



//Das ist der Delegator:
/*
 * 	Delegator bietet Dienste an, welche von anderen Klassen benutzt werden k�nnen
 * 
 * 		-> Ein Delegator muss nicht immer eine Feature-Klasse sein - ist er aber jedoch ganz oft
 * 
 * 		-> Ein Delegator wird von Clients so genutzt, dass der Client bestimmte Aufgaben an den Delegator
 * 			weiter reicht
 * 
 * 		-> WENN der Delegator Informationen aus seinen Clients f�r die Erf�llung seiner Aufgabe ben�tigt, 
 * 			dann h�lt der Delegator in sich ein Attribut des Clients
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class EnergyFeatures {
	
	//Referenz auf den Client, welcher den Delegator nutzt
	private IDelegate client;
	
	
	public EnergyFeatures(IDelegate client) {
		this.client=client;
	}
	
	
	public double berechneWirkungsgrad() {
		//wg berechnen---
		client.getKw();
		
		return 0;
		
	}
	
	
	
	
	
	
	
	
	
	

}
