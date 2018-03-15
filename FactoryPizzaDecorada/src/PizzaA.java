
public class PizzaA extends Pizza{

	public PizzaA(String nombre, String desc) {
		super.Nombre = nombre;
		super.Descripcion = desc;
	}
	
	@Override
	public String Descripcion() {
		return super.Descripcion;
	}
	
	@Override
	public void prepararPizza() {
		System.out.println(Descripcion() + " preparada en " + super.Nombre);
	}

	@Override
	public void empacarPizza() {
		System.out.println(Descripcion() + " empacada en "+ super.Nombre);
	}

	@Override
	public void entregarPizza() {
		System.out.println(Descripcion() + " entregada en " + super.Nombre + "\n");
	}
}
