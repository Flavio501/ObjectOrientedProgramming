
public class DisplayA implements Displays, Showable{

	@Override
	public void update(float temp, float humidity, float pressure) {
		show(temp);
	}

	@Override
	public void show(float valor) {
		System.out.println("DisplayA muestra: " + valor + " grados");
	}

}
