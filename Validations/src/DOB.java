
public class DOB extends MyFields{

	private String DOB;
	public DOB(ValidateField F,String dob) {
		super(F);
		if(validation(dob)) {
			this.DOB = dob;
		}
		else {
			System.out.println("Corregir formato de fecha de nacimiento");
		}
	}
	
	public boolean validation(String dob) {
		return Field.validate(dob);
	}

}
