
public class King extends Characters{

	public King(String clase, WeaponBehaviour w) {
		super(clase, w);
	}
	public void fight() {
		Weapon.battle();
	}
}
