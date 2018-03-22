import java.util.List;

public class MasterCommand implements Command{
	
	List<Command> Coms;
	public MasterCommand(List<Command> coms) {
		this.Coms = coms;
	}
	
	@Override
	public void execute() {
		for(Command com : Coms) {
			com.execute();
		}
	}
	@Override
	public void undo() {
		for(Command com : Coms) {
			com.undo();
		}
	}

}
