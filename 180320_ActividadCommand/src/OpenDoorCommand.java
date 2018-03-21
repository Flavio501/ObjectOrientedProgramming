
public class OpenDoorCommand implements Command{
GarageDoorReceiver Garage;
	
	public OpenDoorCommand(GarageDoorReceiver gar) {
		this.Garage = gar;
	}
	
	@Override
	public void execute() {
		this.Garage.abrirPuerta();
	}

	@Override
	public void undo() {
		this.Garage.cerrarPuerta();
	}
}
