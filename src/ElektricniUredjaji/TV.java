package ElektricniUredjaji;

public class TV implements ElectronicDevice{//concreteReceiver

	private int volume=0;
	
	@Override
	public void on() {
		System.out.println("Tv is ON");	
	}
	@Override
	public void off() {
		System.out.println("Tv is OFF");	
	}
	@Override
	public void VolumeUp() {
		volume++;
		System.out.println("zvuk je na "+volume);	
	}
	@Override
	public void VolumeDown() {
		volume--;
		System.out.println("zvuk je na "+volume);	
		
	}

}
