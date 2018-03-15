
public class PizzaDefault extends Pizza{

	public PizzaDefault(String nombre,String desc) {
		super.Nombre = nombre;
		super.Descripcion = desc;
	}
	@Override
	public String Descripcion() {
		return super.Descripcion;
	}
	
}
