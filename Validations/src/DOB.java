
public class DOB extends MyFields{

	private String DOB;
	public DOB(ValidateField F,String dob) {
		super(F);
		if(validation(dob)) {
			this.DOB = dob;
		}
	}
	
	public boolean validation(String dob) {
		return Field.validate(dob);
	}

}
