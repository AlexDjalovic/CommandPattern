package ElektricniUredjaji;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		ElectronicDevice ed=new TV();
		Command com=new TurnTvOn(ed);
		DeviceButton db;
		db=new DeviceButton(com);
		db.press();
		System.out.println("******");
		TurnTvOff off=new TurnTvOff(ed);
		db=new DeviceButton(off);
		db.press();
		System.out.println("******");
		TurnVolumeUp up=new TurnVolumeUp(ed);
		db=new DeviceButton(up);
		db.press();
		db.press();
		db.press();
		System.out.println("@@@@@@@@@@");
		ed=new Radio();
		Command c2=new TurnTvOn(ed);
		db=new DeviceButton(c2);
		db.press();
		
		System.out.println("/*-/-*/-*/-*/-*/-*/-*/-*");
		TV t2=new TV();
		Radio r2=new Radio();
		List<ElectronicDevice>sveNaprave=new ArrayList<>();
		sveNaprave.add(t2);
		sveNaprave.add(r2);
		IskljuciSve is=new IskljuciSve(sveNaprave);
		DeviceButton db2=new DeviceButton(is);
		db2.press();
		db2.pressUndo();
	}

}
