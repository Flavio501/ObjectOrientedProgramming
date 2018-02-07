
public class Main {

	public static void main(String[] args) {
		WeatherData clima = new WeatherData();
		
		clima.registerDisplay(new DisplayA());
		clima.registerDisplay(new DisplayB());
		clima.registerDisplay(new DisplayC());
		
		clima.notifyDisplay(clima.lista);
		
	}

}
