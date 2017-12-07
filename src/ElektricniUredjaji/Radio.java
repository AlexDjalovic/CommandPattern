package ElektricniUredjaji;

public class Radio implements ElectronicDevice {
	private int volume;
	@Override
	public void on() {
		System.out.println("Radio is ON");

	}

	@Override
	public void off() {
		System.out.println("Radio is Off");

	}

	@Override
	public void VolumeUp() {
		volume++;
		System.out.println("zvuk radija je na "+volume);

	}

	@Override
	public void VolumeDown() {
		// TODO Auto-generated method stub

	}

}
