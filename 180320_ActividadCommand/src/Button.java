public class Button{

	Command Com;
	boolean buttonPressed = false;
	public Button(Command com){
		this.Com = com;
	}
	public void pressButton(){
		if(buttonPressed){
			this.Com.undo();
			this.buttonPressed = false;
		}
		else{
			this.Com.execute();
			this.buttonPressed = true;
		}
	}
}