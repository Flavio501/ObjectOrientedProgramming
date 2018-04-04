
public class Main {

	public static void main(String[] args) {
		CatDogAdapter catdogger = new CatDogAdapter(new Cat());
		TurkeyDogAdapter turkdogger = new TurkeyDogAdapter(new Turkey());
		Dogable dog = new Golden();
		
		dog.bark();
		dog.bite();
 
		catdogger.bark();
		catdogger.bite();
		
		turkdogger.bark();
		turkdogger.bite();

	}

}
