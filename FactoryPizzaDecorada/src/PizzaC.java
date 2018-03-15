
public class PizzaC extends Pizza{
	
	public PizzaC(String nombre, String desc) {
		super.Nombre = nombre;
		super.Descripcion = desc;
	}
	
	@Override
	public String Descripcion() {
		return super.Descripcion;
	}
}
