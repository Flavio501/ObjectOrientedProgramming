
public class SexType implements ValidateField{
	
	public boolean validate(String campo) {
		if(campo == "M") return true;
		else if(campo == "F") return true;
		else return false;
	}

}
