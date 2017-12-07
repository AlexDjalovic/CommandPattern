package ElektricniUredjaji;

import java.util.List;

public class IskljuciSve implements Command {
	
	List<ElectronicDevice>dev;
	
	public IskljuciSve(List<ElectronicDevice>deve){
		dev=deve;
	}

	@Override
	public void execute() {
		for(ElectronicDevice ed:dev){
			ed.off();
		}

	}

	@Override
	public void undo() {
		for(ElectronicDevice ed:dev){
			ed.on();
		
	}

}
}