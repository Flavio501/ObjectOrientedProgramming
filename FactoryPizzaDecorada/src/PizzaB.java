
public class PizzaB extends Pizza{
	
	public PizzaB(String nombre, String desc) {
		super.Nombre = nombre;
		super.Descripcion = desc;
	}
	
	@Override
	public String Descripcion() {
		return super.Descripcion;
	}
}
