
public class Pepperoni extends IngredientePizza {

	public Pepperoni(Pizza piz) {
		super(piz);
		super.Nombre = piz.Nombre;
	}

	@Override
	public String Descripcion() {
		return super.pizza.Descripcion() + " con pepperoni";
	}

	@Override
	public void prepararPizza() {
		System.out.println(Descripcion() + " preparada en " + super.pizza.Nombre);
	}

	@Override
	public void empacarPizza() {
		System.out.println(Descripcion() + " empacada en "+ super.pizza.Nombre);
	}

	@Override
	public void entregarPizza() {
		System.out.println(Descripcion() + " entregada en " + super.pizza.Nombre + "\n");
	}

}
