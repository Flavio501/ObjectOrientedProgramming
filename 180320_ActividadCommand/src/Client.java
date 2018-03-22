import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Invoker inv = new Invoker();
		LightsReceiver lights = new LightsReceiver();
		GarageDoorReceiver garage = new GarageDoorReceiver();
		LicuadoraReceiver lic = new LicuadoraReceiver();
		VentanaReceiver ven = new VentanaReceiver();
		FanReceiver fan = new FanReceiver();
		List<Command> Coms = new ArrayList<Command>();
		
		Coms.add(new LightsOffCommand(lights));
		Coms.add(new CloseDoorCommand(garage));
		Coms.add(new CloseVentanaCommand(ven));
		Coms.add(new LicuadoraOffCommand(lic));
		
		inv.addButton(new Button(new MasterCommand(Coms)));
		inv.buttonPress(inv.buttons.get(0));
		System.out.print("\n------------------\n");
		inv.buttonUndo();
		System.out.print("\n------------------\n");
		
		//inv.addButton(new Button(new LightsOffCommand(lights)));
		//inv.buttonPress(inv.buttons.get(0));
		//inv.buttonPress(inv.buttons.get(0));
		
		inv.addButton(new Button(new LightsOnCommand(lights)));
		inv.buttonPress(inv.buttons.get(1));
		//inv.buttonPress(inv.buttons.get(1));
		
		inv.addButton(new Button(new OpenDoorCommand(garage)));
		inv.buttonPress(inv.buttons.get(2));
		//inv.buttonPress(inv.buttons.get(2));
		
		inv.addButton(new Button(new CloseDoorCommand(garage)));
		inv.buttonPress(inv.buttons.get(3));
		//inv.buttonPress(inv.buttons.get(3));
		
		inv.addButton(new Button(new LicuadoraOnCommand(lic)));
		inv.buttonPress(inv.buttons.get(4));
		//inv.buttonPress(inv.buttons.get(4));
		
		System.out.println("\nTesting Undo: ");
		inv.buttonUndo();
		//inv.buttonUndo();
		System.out.println("End Testing Undo: \n");
		
		inv.addButton(new Button(new LicuadoraOffCommand(lic)));
		inv.buttonPress(inv.buttons.get(5));
		//inv.buttonPress(inv.buttons.get(5));
		
		inv.addButton(new Button(new OpenVentanaCommand(ven)));
		inv.buttonPress(inv.buttons.get(6));
		//inv.buttonPress(inv.buttons.get(6));
		
		inv.addButton(new Button(new FanSpeedCommand(fan)));
		inv.buttonPress(inv.buttons.get(7));
		inv.buttonPress(inv.buttons.get(7));
		inv.buttonPress(inv.buttons.get(7));
		inv.buttonPress(inv.buttons.get(7));
		
		System.out.println("\nTesting Undo: ");
		inv.buttonUndo();
		inv.buttonUndo();
		inv.buttonUndo();
		inv.buttonUndo();
		System.out.println("End Testing Undo: \n");
		
	}

}
