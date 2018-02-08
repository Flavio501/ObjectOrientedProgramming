import java.util.Observable;

public class WeatherData extends Observable{
	float Temp;
	float Humidity;
	float Pressure;
	
	public void setMeasurements(float temp,float humidity, float pressure) {
		this.Temp = temp;
		this.Humidity = humidity;
		this.Pressure = pressure;
		measurementsChanged();
	}
	public float getPressure() {
		return Pressure;
	}
	public float getTemp() {
		return Temp;
	}
	public float getHumidity() {
		return Humidity;
	}
	
	public void measurementsChanged() {
		setChanged();
		//notifyObservers();
		notifyObservers(new Wrapper(Temp,Humidity,Pressure));
	}
	

}
