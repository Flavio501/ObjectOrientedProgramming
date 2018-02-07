import java.util.List;

public interface Weather {
	public void registerDisplay(Displays disp);
	public void removeDisplay(Displays disp);
	public void notifyDisplay(List<Displays> list);
	
}
