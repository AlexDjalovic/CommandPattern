package ElektricniUredjaji;

public class TurnTvOff implements Command {

private ElectronicDevice ed;
	
	public TurnTvOff(ElectronicDevice edc){
		ed=edc;}
	@Override
	public void execute() {
	ed.off();

	}
	@Override
	public void undo() {
		ed.on();
		
	}

}
