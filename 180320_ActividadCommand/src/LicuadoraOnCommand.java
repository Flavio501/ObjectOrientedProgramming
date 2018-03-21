
public class LicuadoraOnCommand implements Command{
	LicuadoraReceiver Lic;
	public LicuadoraOnCommand(LicuadoraReceiver lic) {
		this.Lic = lic;
	}
	@Override
	public void execute() {
		this.Lic.prenderLicuadora();
	}
	@Override
	public void undo() {
		this.Lic.apagarLicuadora();
	}
}
