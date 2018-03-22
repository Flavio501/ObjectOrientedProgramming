
public class FanSpeedCommand implements Command{
	
	FanReceiver Fan;
	String state="Off";
	public FanSpeedCommand(FanReceiver fan) {
		this.Fan = fan;
	}
	@Override
	public void execute() {
		if(state=="High") {
			this.Fan.fanOff();
			state= "Off";
		}
		else if(state=="Medium") {
			this.Fan.fanHigh();
			state="High";
		}
		else if(state == "Low") {
			this.Fan.fanMedium();
			state="Medium";
		}
		else {
			this.Fan.fanLow();
			state = "Low";
		}
	}
	@Override
	public void undo() {
		if(state=="High") {
			this.Fan.fanMedium();
			state = "Medium";
		}
		else if(state=="Medium") {
			this.Fan.fanLow();
			state = "Low";
		}
		else if(state == "Low") {
			this.Fan.fanOff();
			state = "Off";
		}
		else {
			this.Fan.fanHigh();
			state = "High";
		}
	}

}
