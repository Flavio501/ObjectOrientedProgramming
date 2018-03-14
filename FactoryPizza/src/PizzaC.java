
public class PizzaC extends Pizza{
	
	public PizzaC(String nombre) {
		this.Nombre = nombre;
	}
	@Override
	public void prepararPizza() {
		System.out.println("PizzaC preparada en " + this.Nombre);
	}

	@Override
	public void empacarPizza() {
		System.out.println("PizzaC empacada en " + this.Nombre);
	}

	@Override
	public void entregarPizza() {
		System.out.println("PizzaC entregada en " + this.Nombre + "\n");
	}
}
