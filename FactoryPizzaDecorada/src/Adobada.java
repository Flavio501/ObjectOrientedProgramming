
public class Adobada extends IngredientePizza {

	public Adobada(Pizza piz) {
		super(piz);
		super.Nombre = piz.Nombre;
	}

	@Override
	public String Descripcion() {
		return super.pizza.Descripcion() + " con adobada";
	}

}