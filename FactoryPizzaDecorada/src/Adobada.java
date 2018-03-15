
public class Adobada extends IngredientePizza {

	public Adobada(Pizza piz) {
		super(piz);
		super.Nombre = piz.Nombre;
	}

	@Override
	public String Descripcion() {
		return super.pizza.Descripcion() + " con adobada";
	}

	@Override
	public void prepararPizza() {
		System.out.println(Descripcion() + " preparada en " + this.pizza.Nombre);
	}

	@Override
	public void empacarPizza() {
		System.out.println(Descripcion() + " empacada en "+ this.pizza.Nombre);
	}

	@Override
	public void entregarPizza() {
		System.out.println(Descripcion() + " entregada en " + super.pizza.Nombre + "\n");
	}

}