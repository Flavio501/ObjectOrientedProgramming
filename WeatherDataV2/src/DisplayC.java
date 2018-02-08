import java.util.Observable;
import java.util.Observer;

public class DisplayC implements Observer, Showable{

	private float currentHumidity;
	private float lastHumidity;
	
	public DisplayC(Observable weatherData) {
		weatherData.addObserver(this);
	}
	
	public void show(float valor) {
		System.out.println("DisplayC muestra: " + valor + " porcentaje de humedad");
	}

	@Override
	public void update(Observable observable, Object arg) {
		if(arg == null) {
			System.out.println("Null Arg C");
		}else { 
			if(observable instanceof WeatherData) 
			{
				Wrapper wrap = (Wrapper) arg;
				lastHumidity = currentHumidity;
				currentHumidity = wrap.Humidity;
				show(currentHumidity);
			}
		}
	}
}
