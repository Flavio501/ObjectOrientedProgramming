
public class Latte extends Bebida{
	public Latte(String size) {
		super.Size = size;
	}

	@Override
	public String Descripcion() {
		return "Latte " + super.Size;
	}

	@Override
	public int getCost() {
		if(super.Size.equals("Small")) {
			return 20;
		}
		else if(super.Size.equals("Medium")) {
			return 25;
		}
		else if(super.Size.equals("Large")) {
			return 35;
		}
		else {
			return 20;
		}
	}
}
