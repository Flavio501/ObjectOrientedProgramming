
public class Facade {
	
	Television TV;
	Sofa SF;
	BluRayPlayer BR;
	LEDLights Tron;
	Stove Mabe;
	
	public Facade(
			Television tv,
			Sofa sf,
			BluRayPlayer br,
			LEDLights tron,
			Stove mabe) {
		this.TV = tv;
		this.SF = sf;
		this.BR = br;
		this.Tron = tron;
		this.Mabe = mabe;
	}
	
	public void NetflixAndChilaquiles() {
		System.out.println("\n");
		Mabe.cook();
		Mabe.turnOff();
		Tron.on();
		TV.on();
		TV.changeSource();
		BR.on();
		SF.reclinar();
		BR.play();
	}
	
	public void EstudiHambre() {
		System.out.println("\n");
		Mabe.cook();
		Mabe.turnOff();
	}
	
	public void deStress() {
		System.out.println("\n");
		Tron.on();
		SF.reclinar();
		SF.iniciarMasaje();
		TV.on();
		SF.terminarMasaje();
		TV.off();
		Tron.off();
	}
}
