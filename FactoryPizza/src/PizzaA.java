
public class PizzaA extends Pizza{

	public PizzaA(String nombre) {
		this.Nombre = nombre;
	}
	@Override
	public void prepararPizza() {
		System.out.println("PizzaA preparada en " + this.Nombre);
	}

	@Override
	public void empacarPizza() {
		System.out.println("PizzaA empacada en " + this.Nombre);
	}

	@Override
	public void entregarPizza() {
		System.out.println("PizzaA entregada en " + this.Nombre + "\n");
	}

}
