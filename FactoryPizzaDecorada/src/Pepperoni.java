
public class Pepperoni extends IngredientePizza {

	public Pepperoni(Pizza piz) {
		super(piz);
		super.Nombre = piz.Nombre;
	}

	@Override
	public String Descripcion() {
		return super.pizza.Descripcion() + " con pepperoni";
	}

}
