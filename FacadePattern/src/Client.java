
public class Client {

	public static void main(String[] args) {
		Television tv = new Television();
		Sofa sf = new Sofa();
		BluRayPlayer br = new BluRayPlayer();
		LEDLights tron = new LEDLights();
		Stove mabe = new Stove();
		
		Facade combo = new Facade(tv,sf,br,tron,mabe);
		
		combo.NetflixAndChilaquiles();
		
		combo.deStress();
		
		combo.EstudiHambre();
	}

}
