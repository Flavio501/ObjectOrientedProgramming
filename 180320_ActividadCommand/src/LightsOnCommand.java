
public class LightsOnCommand implements Command{
	LightsReceiver Light;
	public LightsOnCommand(LightsReceiver light) {
		this.Light = light;
	}
	@Override
	public void execute() {
		this.Light.prenderLuz();
	}
	@Override
	public void undo() {
		this.Light.apagarLuz();
		
	}
	
	
}
