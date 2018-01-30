
public class Name extends MyFields{

	private String Name;
	public Name(ValidateField F,String name) 
	{
		super(F);
		if(validation(name)) 
		{
			this.Name = name;
		}
		else {
			System.out.println("Corregir formato");
		}
	}
	
	public boolean validation(String text) {
		return Field.validate(text);
	}
	

}
