
public class MyFields {
	protected ValidateField Field;
	
	public MyFields(ValidateField F) {
		this.Field = F;
	}
	
	public void setField(ValidateField f) {
		this.Field = f;
	}
	
	public boolean validation() {
		return Field.validate(null);
	}
	
}
