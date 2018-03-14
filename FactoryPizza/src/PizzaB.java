
public class PizzaB extends Pizza{
	
	public PizzaB(String nombre) {
		this.Nombre = nombre;
	}
	@Override
	public void prepararPizza() {
		System.out.println("PizzaB preparada en " + this.Nombre);
	}

	@Override
	public void empacarPizza() {
		System.out.println("PizzaB empacada en " + this.Nombre);
	}

	@Override
	public void entregarPizza() {
		System.out.println("PizzaB entregada en " + this.Nombre + "\n");
	}
}
