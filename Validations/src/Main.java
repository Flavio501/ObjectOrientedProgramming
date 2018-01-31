
public class Main {
	public static void main(String[] args) 
	{
		MyFields name = new Name(new NameType(),null);
		MyFields phone = new Phone(new PhoneType(),"0");
		MyFields email = new Email(new EmailType(), "flavio@@cetys.mx");
		MyFields sex = new Sex(new SexType(), "Hombre");
		MyFields dob = new DOB(new DOBType(), "13/03//1997");
	
	}
}
