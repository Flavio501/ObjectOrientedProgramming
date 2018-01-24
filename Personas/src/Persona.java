
public class Persona {
		String Nombre;
		private int Edad;
		private boolean Genero;
		protected HabilidadMotriz mov;

		public Persona(String nombre, int edad, boolean genero){
			this.Nombre = nombre;
			this.Edad = edad;
			this.Genero = genero;
		}
		
		public String getNombre(){
			return this.Nombre;
		}
		public void setNombre(String newnombre){
			this.Nombre = newnombre;
		}
		
		public int getEdad(){
			return this.Edad;
		}		
		public void setEdad(int newedad){
			this.Edad = newedad;
		}
		
		public boolean getGenero(){
			return this.Genero;
		}
		public void setGenero(boolean newgenero){
			this.Genero = newgenero;
		}
		
		public void Caminar(){
			System.out.println("Camino como gente normal");
		}
		public String Hablar(){
			return "Hola, mundo";
		}
		public void Respirar(){
			System.out.println("Inhale, Exhale");
		}
	}
