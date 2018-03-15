
public class Aceituna extends IngredientePizza {

	public Aceituna(Pizza piz) {
		super(piz);
		super.Nombre = piz.Nombre;
	}

	@Override
	public String Descripcion() {
		return super.pizza.Descripcion() + " con aceitunas";
	}

}