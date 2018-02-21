
public class Mocka extends Bebida{
	public Mocka(String size) {
		super.Size = size;
	}

	@Override
	public String Descripcion() {
		return "Mocka " + super.Size;
	}

	@Override
	public int getCost() {
		if(super.Size.equals("Small")) {
			return 30;
		}
		else if(super.Size.equals("Medium")) {
			return 37;
		}
		else if(super.Size.equals("Large")) {
			return 45;
		}
		else {
			return 30;
		}
	}
}
