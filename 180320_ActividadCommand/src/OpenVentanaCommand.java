
public class OpenVentanaCommand implements Command{
	
	VentanaReceiver Ven;
	public OpenVentanaCommand(VentanaReceiver ven) {
		this.Ven = ven;
	}
	@Override
	public void execute() {
		this.Ven.abrirVentana();
	}
	@Override
	public void undo() {
		this.Ven.cerrarVentana();
	}
}
