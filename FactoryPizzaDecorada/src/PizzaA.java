
public class PizzaA extends Pizza{

	public PizzaA(String nombre, String desc) {
		super.Nombre = nombre;
		super.Descripcion = desc;
	}
	
	@Override
	public String Descripcion() {
		return super.Descripcion;
	}
	
}
