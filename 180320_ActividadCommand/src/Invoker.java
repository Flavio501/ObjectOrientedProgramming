import java.util.ArrayList;
import java.util.List;

public class Invoker {
	
	List<Button> buttons = new ArrayList<Button>(8);
	Button lastButton;
	
	public void addButton(Button but) {
		buttons.add(but);
	}
	
	public void buttonPress(Button but) {
		//but.pressButton();
		but.Com.execute();
		lastButton = but;
	}
	
	public void buttonUndo() {
		//lastButton.pressButton();
		lastButton.Com.undo();
	}
}
