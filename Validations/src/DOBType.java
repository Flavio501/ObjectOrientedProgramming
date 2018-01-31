
public class DOBType implements ValidateField{

	public boolean validate(String campo) {
		if(campo.contains("//")) return false;
		else return true;
	}
}
