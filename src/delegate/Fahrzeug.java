package delegate;


/*
 * 	Client, welcher den Delegator(EnergyFeaures) nutzt
 * 
 * 
 * 
 * 
 * 
 * 
 */

public abstract class Fahrzeug implements IDelegate{
	
	private double kw;
	//hier hält der client sein eigenes delegator-objekt
	private EnergyFeatures delegator;
	
	
	public Fahrzeug() {
		//hier übergibt der client seine eigene adresse an den konstruktor des delegators, damit dieser den client
		//ansprechen kann
		delegator=new EnergyFeatures(this);
	}
	
	

	public double getKw() {
		return kw;
	}

	public void setKw(double kw) {
		this.kw = kw;
	}
	
	
	
	

}
