import java.util.Observable;
import java.util.Observer;

public class DisplayA implements Observer, Showable{

	private float currentPressure;
	private float lastPressure;
	
	public DisplayA(Observable weatherData) {
		weatherData.addObserver(this);
	}
	public void show(float valor) {
		System.out.println("DisplayA muestra: " + valor + " grados de presion");
	}

	@Override
	public void update(Observable observable, Object arg) {
		if(arg == null) {
			System.out.println("Null Arg A");
		}else 
		{
			if(observable instanceof WeatherData) 
			{
				Wrapper wrap = (Wrapper) arg;
				lastPressure = currentPressure;
				currentPressure = wrap.Pressure;
				show(currentPressure);
			}
		}
	}

}
