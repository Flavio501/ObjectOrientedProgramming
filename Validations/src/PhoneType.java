
public class PhoneType implements ValidateField{
	
	public boolean validate(String numero) {
		int Temp =Integer.parseInt(numero);
		if(Temp != 0) {
			return true;
		}
		else {
			return false;
		}
	}

}
