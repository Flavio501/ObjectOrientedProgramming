
public class Leche extends Ingrediente{
	public Leche(Bebida beb, int costo) {
		super(beb, costo);
	}

	@Override
	public String Descripcion() {
		return descripcionIngrediente() + " con leche";
	}
}
