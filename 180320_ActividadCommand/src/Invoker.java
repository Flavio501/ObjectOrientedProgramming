
public class Invoker {
	Command Com;
	Command LastCommand;
	boolean buttonPressed = false;
	boolean lastButtonPressed = false;
	
	public void setCommand(Command com) {
		this.LastCommand = this.Com;
		this.Com = com;
	}
	
	public void buttonPress() {
		if(buttonPressed) {
			this.Com.undo();
			this.buttonPressed = false;
		}
		else {
			this.Com.execute();
			this.buttonPressed = true;
		}
	}
	
	public void buttonUndo() {
		if(lastButtonPressed) {
			this.LastCommand.execute();
			this.lastButtonPressed = false;
		}
		else {
			this.LastCommand.undo();
			this.lastButtonPressed = true;
		}
	}
}
