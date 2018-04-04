
public class TurkeyDogAdapter implements Dogable{
	Turkey myTurk;
	
	public TurkeyDogAdapter(Turkey turk) {
		this.myTurk = turk;
	}
	
	@Override
	public void bark() {
		myTurk.Gorg();
	}

	@Override
	public void bite() {
		myTurk.Pike();
	}
	
}
