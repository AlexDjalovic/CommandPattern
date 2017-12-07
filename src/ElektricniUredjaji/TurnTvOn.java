package ElektricniUredjaji;

public class TurnTvOn implements Command {

	private ElectronicDevice ed;
	
	public TurnTvOn(ElectronicDevice edc){
		ed=edc;
	}
	@Override
	public void execute() {
		ed.on();

	}
	@Override
	public void undo() {
		ed.off();
		
	}

}
