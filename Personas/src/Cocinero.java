
public class Cocinero extends Persona{
		
	public String Especialidad;
	public String Puesto;
	
	public Cocinero(String nombre, int edad, boolean genero,String especial, String puesto) {
		super(nombre, edad, genero);
		this.Especialidad = especial;
		this.Puesto = puesto;
		this.mov = new MoverDeManos();
	}
		
	public String getEspecialidad() {
		return this.Especialidad;
	}
	public void setEspecialidad(String Especialidad) {
		this.Especialidad = Especialidad;
	}
	
	public String getPuesto() {
		return this.Puesto;
	}
	public void setPuesto(String puesto) {
		this.Puesto = puesto;
	}
	
	public void Caminar(){
		mov.mover();
	}
	
	public String Hablar(){
		return "Orden lista";
	}
	
	public void Respirar(){
		System.out.println("Inhale, Exhale");
	}
}
