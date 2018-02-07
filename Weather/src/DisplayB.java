
public class DisplayB implements Displays,Showable{
	@Override
	public void update(float temp, float humidity, float pressure) {
		show(pressure);
	}

	@Override
	public void show(float valor) {
		System.out.println("DisplayB muestra: " + valor + " de humedad");
		
	}
}
