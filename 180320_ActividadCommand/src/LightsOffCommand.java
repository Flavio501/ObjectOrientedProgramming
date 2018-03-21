
public class LightsOffCommand implements Command{
	LightsReceiver Light;
	public LightsOffCommand(LightsReceiver light) {
		this.Light = light;
	}
	@Override
	public void execute() {
		this.Light.apagarLuz();
	}
	@Override
	public void undo() {
		this.Light.prenderLuz();
	}
}
