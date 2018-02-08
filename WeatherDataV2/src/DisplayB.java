import java.util.Observable;
import java.util.Observer;

public class DisplayB implements Observer, Showable{

	private float currentTemp;
	private float lastTemp;
	
	public DisplayB(Observable weatherData) {
		weatherData.addObserver(this);
	}
	
	public void show(float valor) {
		System.out.println("DisplayB muestra: " + valor + " grados de temperatura");
	}

	@Override
	public void update(Observable observable, Object arg) {
		if(arg == null) {
			System.out.println("Null Arg B");
		}else {
			if(observable instanceof WeatherData) 
			{
				Wrapper wrap = (Wrapper) arg;
				lastTemp = currentTemp;
				currentTemp = wrap.Temp;
				show(currentTemp);
			}
		}
	}
}
