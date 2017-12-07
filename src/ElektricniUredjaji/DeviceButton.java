package ElektricniUredjaji;

public class DeviceButton {//INVOKER
	private Command com;
	
	public DeviceButton(Command com){
		this.com=com;
	}

	public void press(){
		com.execute();
	}
	public void pressUndo(){
		com.undo();
	}
}
