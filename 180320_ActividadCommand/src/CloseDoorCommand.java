
public class CloseDoorCommand implements Command{
	GarageDoorReceiver Garage;
	
	public CloseDoorCommand(GarageDoorReceiver gar) {
		this.Garage = gar;
	}
	
	@Override
	public void execute() {
		this.Garage.cerrarPuerta();
	}

	@Override
	public void undo() {
		this.Garage.abrirPuerta();
	}

}
