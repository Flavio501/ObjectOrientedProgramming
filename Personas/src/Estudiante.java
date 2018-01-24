
public class Estudiante extends Persona{
	public int Matricula;
	public String Carrera;
	
	public Estudiante(String nombre, int edad, boolean genero, int matricula, String carrera) {
		super(nombre, edad, genero);
		this.Matricula = matricula;
		this.Carrera = carrera;
		this.mov = new MoverDePie();
	}
	
	public int getMatricula() {
		return this.Matricula;
	}
	public void setMatricula(int matricula) {
		this.Matricula = matricula;
	}
	
	public String getCarrera() {
		return this.Carrera;
	}
	public void setCarrera(String carrera) {
		this.Carrera = carrera;
	}
	
	public void Caminar(){
		mov.mover();
	}
	
	public String Hablar(){
		return "Hola, profesor";
	}
	
	public void Respirar(){
		System.out.println("Inhale, Exhale");
	}
}