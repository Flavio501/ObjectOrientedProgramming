
public class Characters {
	private String Clase;
	protected WeaponBehaviour Weapon;
	
	public Characters(String clase) {
		this.Clase = clase;
		this.Weapon = new DefaultBehaviour();
	}
	public Characters(String clase, WeaponBehaviour w) {
		this.Clase = clase;
		this.Weapon = w;
	}
	
	public void setWeapon(WeaponBehaviour w) {
		this.Weapon = w;
	}
	
	public WeaponBehaviour getWeapon() {
		return Weapon;
	}
	
	public void speak() {
		System.out.println("I am a " + this.Clase);
	}
	public void fight() {
		Weapon.battle();
	}
	
}