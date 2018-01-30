
public class DOBType implements ValidateField{

	public boolean validate(String campo) {
		if(campo) return true;
		return false;
	}

}
