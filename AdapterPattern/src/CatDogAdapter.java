
public class CatDogAdapter implements Dogable{
	
	Catable myCat;
	public CatDogAdapter(Catable cat) {
		this.myCat = cat;
	}
	
	@Override
	public void bark() {
		myCat.purr();
	}

	@Override
	public void bite() {
		myCat.slash();
	}
	
}
