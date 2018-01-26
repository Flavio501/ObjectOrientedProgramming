
public class Queen extends Characters{

	public Queen(String clase, WeaponBehaviour w) {
		super(clase, w);
	}
	
	public void fight() {
		Weapon.battle();
	}

}
