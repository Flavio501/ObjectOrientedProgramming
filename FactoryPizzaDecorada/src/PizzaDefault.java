
public class PizzaDefault extends Pizza{

	public PizzaDefault(String nombre,String desc) {
		super.Nombre = nombre;
		super.Descripcion = desc;
	}
	@Override
	public String Descripcion() {
		return super.Descripcion;
	}
	
	@Override
	public void prepararPizza() {
		System.out.println("Pizza chafa que cuesta extra por no especificar preparada en " + this.Nombre);
	}

	@Override
	public void empacarPizza() {
		System.out.println("Pizza chafa que cuesta extra por no especificar empacada en " + this.Nombre);
	}

	@Override
	public void entregarPizza() {
		System.out.println("Pizza chafa que cuesta extra por no especificar entregada en " + this.Nombre + "\n");
	}
}
