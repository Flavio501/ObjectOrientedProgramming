
public class Cafe extends Bebida{

	public Cafe(String size) {
		super.Size = size;
	}

	@Override
	public String Descripcion() {
		return "Cafe " + super.Size;
	}

	@Override
	public int getCost() {
		if(super.Size.equals("Small")) {
			return 10;
		}
		else if(super.Size.equals("Medium")) {
			return 12;
		}
		else if(super.Size.equals("Large")) {
			return 15;
		}
		else {
			return 10;
		}
	}

}
