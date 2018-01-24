
public class Main {

	public static void main(String[] args) {
		Persona persona = new Persona("Flavio",20,true);
		Estudiante estudiante = new Estudiante("Flavio",20,true,24402,"ICC");
		Cocinero cocinero = new Cocinero("Flavio",20,true,"Chef","Italiano");
		persona.Caminar();
		estudiante.Caminar();
		cocinero.Caminar();
	}

}
