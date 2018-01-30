
public class NameType implements ValidateField{

	public boolean validate(String nombre) {
		if(nombre != null) {
			return true;
		}
		else {
			return false;
		}
	}
}
