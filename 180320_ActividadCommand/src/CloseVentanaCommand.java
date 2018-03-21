
public class CloseVentanaCommand implements Command{
	VentanaReceiver Ven;
	public CloseVentanaCommand(VentanaReceiver ven) {
		this.Ven = ven;
	}
	@Override
	public void execute() {
		this.Ven.cerrarVentana();
	}
	@Override
	public void undo() {
		this.Ven.abrirVentana();
	}
}
