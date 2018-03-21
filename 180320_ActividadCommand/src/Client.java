
public class Client {

	public static void main(String[] args) {
		Invoker inv = new Invoker();
		LightsReceiver lights = new LightsReceiver();
		GarageDoorReceiver garage = new GarageDoorReceiver();
		
		inv.setCommand(new LightsOnCommand(lights));
		inv.setCommand(new OpenDoorCommand(garage));
		
		inv.buttonPress();
		inv.buttonPress();
		inv.buttonUndo();
		inv.buttonUndo();
		
		inv.setCommand(new LightsOffCommand(lights));
		inv.setCommand(new CloseDoorCommand(garage));
		
		inv.buttonPress();
		inv.buttonPress();
		inv.buttonUndo();
		inv.buttonUndo();
		
	}

}
