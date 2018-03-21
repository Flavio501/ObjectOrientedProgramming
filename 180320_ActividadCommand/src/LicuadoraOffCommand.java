
public class LicuadoraOffCommand implements Command{
	LicuadoraReceiver Lic;
	public LicuadoraOffCommand(LicuadoraReceiver lic) {
		this.Lic = lic;
	}
	@Override
	public void execute() {
		this.Lic.apagarLicuadora();
	}
	@Override
	public void undo() {
		this.Lic.prenderLicuadora();
	}
}
