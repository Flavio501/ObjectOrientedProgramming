public class EmailType implements ValidateField{
	
	public boolean validate(String hex) {
		if(hex.contains("@@")) {
			return false;
		}
		else {
			return true;
		}
	}
	
}
