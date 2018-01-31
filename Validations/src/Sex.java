
public class Sex extends MyFields{

	private String Sex;
	public Sex(ValidateField F, String sex) {
		super(F);
		if(validation(sex)) {
			this.Sex = sex;
		}
		else{
			System.out.println("Corregir Formato de sexo");
		}
	}
	public boolean validation(String sex) {
		return Field.validate(sex);
	}
}
