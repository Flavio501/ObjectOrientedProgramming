
public class Troll extends Characters{

	public Troll(String clase, WeaponBehaviour w) {
		super(clase, w);
	}
	
	public Troll(String clase) {
		super(clase);
	}

	public void fight() {
		Weapon.battle();
	}

}
