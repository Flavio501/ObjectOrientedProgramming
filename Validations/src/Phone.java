
public class Phone extends MyFields{
	private String PhoneNumber;
	
	public Phone(ValidateField F, String phone) {
		super(F);
		if(validation(phone)) {
			this.PhoneNumber = phone;
		}
		else {
			System.out.println("Corregir formato de telefono");
		}
	}
	public boolean validation(String phone) {
		return Field.validate(phone);
	}
	
}
