package delegate;

public abstract class Maschine implements IDelegate{
	
	private double kw;
	//Damit Objekte vom Typ Maschine die Dienste des Delegators nutzten können, wird hier eine Referenz auf den
	//Delegator vorgehalten:
	private EnergyFeatures delegator;
	
	public Maschine() {
		delegator=new EnergyFeatures(this);
	}
	

	public double getKw() {
		return kw;
	}

	public void setKw(double kw) {
		this.kw = kw;
	}
	
	private void drosselung() {
		//für gewisse entscheidungen muss hier der wirkungsgarad bekannt sein:
		if(delegator.berechneWirkungsgrad() < 0.3) {
			
		}
		
	}
	
	

}
