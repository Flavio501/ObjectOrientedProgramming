
public abstract class Pizza {
	
	public String Nombre;
	public String Descripcion;
	
	public abstract String Descripcion();

	public void prepararPizza() {
		System.out.println(Descripcion() + " preparada en " + this.Nombre);
	}

	public void empacarPizza() {
		System.out.println(Descripcion() + " empacada en "+ this.Nombre);
	}

	public void entregarPizza() {
		System.out.println(Descripcion() + " entregada en " + this.Nombre + "\n");
	}
}
