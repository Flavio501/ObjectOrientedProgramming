
public class Crema extends Ingrediente{

	public Crema(Bebida beb, int costo) {
		super(beb, costo);
	}

	@Override
	public String Descripcion() {
		return descripcionIngrediente() + " con crema";
	}

}
