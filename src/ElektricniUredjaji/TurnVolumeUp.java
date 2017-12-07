package ElektricniUredjaji;

public class TurnVolumeUp implements Command {

private ElectronicDevice ed;
	
	public TurnVolumeUp(ElectronicDevice edc){
		ed=edc;}
	@Override
	public void execute() {
		ed.VolumeUp();

	}
	@Override
	public void undo() {
		ed.VolumeDown();
	}

}
