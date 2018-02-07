import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Weather{

	List<Displays> lista = new ArrayList<Displays>();
	float temp;
	float humidity;
	float pressure;
	
	@Override
	public void registerDisplay(Displays disp) {
		lista.add(disp);
	}
	
	@Override
	public void removeDisplay(Displays disp) {
		lista.remove(disp);
	}

	@Override
	public void notifyDisplay(List<Displays> disp) {
		for(Displays display :disp)
		{
			display.update(temp, humidity, pressure);
		}
	}
	
	public void dataChange(List<Displays> list) {
		notifyDisplay(list);
	}
	

}
