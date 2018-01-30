
public class Phone extends MyFields{
	private int PhoneNumber;
	
	public Phone(ValidateField F, int phone) {
		super(F);
		this.PhoneNumber = phone;
	}
	
	public boolean validation() {
		return Field.validate(PhoneNumber);
	}
	
}
