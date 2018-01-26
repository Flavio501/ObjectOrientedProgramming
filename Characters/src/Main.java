
public class Main {

	public static void main(String[] args) {
		Characters first = new Knight("Knight",new SwordBehaviour());
		Characters second = new Troll("Troll");
		Characters third = new King("King",new AxeBehaviour());
		Characters fourth = new Queen("Queen",new KnifeBehaviour());
		Characters fifth = new Troll("Troll",new DefaultBehaviour());
		
		first.speak();
		first.fight();
		first.setWeapon(new DefaultBehaviour());
		first.fight();
		second.speak();
		second.fight();
		third.speak();
		third.fight();
		fourth.speak();
		fourth.fight();
		fifth.speak();
		fifth.fight();

	}

}
