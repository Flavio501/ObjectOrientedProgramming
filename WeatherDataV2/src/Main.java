
public class Main {

	public static void main(String[] args) {
		WeatherData clima = new WeatherData();
		
		clima.addObserver(new DisplayA(clima));
		clima.addObserver(new DisplayB(clima));
		clima.addObserver(new DisplayC(clima));
		
		clima.setMeasurements(28.00f, 15.01f, 19.50f);
		clima.setMeasurements(32.00f, 25.00f, 12.30f);
		
	}

}
