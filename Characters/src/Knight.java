
public class Knight extends Characters{
	
	
	public Knight(String clase, WeaponBehaviour w) {
		super(clase, w);
	}
	
	public Knight(String clase) {
		super(clase);
	}
	
	public void fight() {
		Weapon.battle();
	}
	
}
