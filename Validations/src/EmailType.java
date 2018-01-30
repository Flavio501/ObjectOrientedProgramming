
public class EmailType implements ValidateField{
	
	public boolean validate(String hex) {
		matcher = pattern.matcher(hex);
		return matcher.matches();
	}
	
}
