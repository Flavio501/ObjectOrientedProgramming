public class Email extends MyFields{
	private String Email;

	public Email(ValidateField F,String email) {
		super(F);
		if(validation(email)) {
			this.Email = email;
		}
		else {
			System.out.println("Corregir formato");
		}
	}
	
	public boolean validation(String email) {
		return Field.validate(email);
	}
	
}
