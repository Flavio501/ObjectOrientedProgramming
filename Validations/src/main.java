
public class main {
	MyFields name = new Name(new NameType(), "Flavio");
	MyFields phone = new Phone(new PhoneType(),664420323);
	MyFields email = new Email(new EmailType(), "flavio@cetys.mx");
	MyFields sex = new Sex(new SexType(), "M");
	MyFields dob = new DOB(new DOBType(), "13/03/1997");
	
	System.out.Println(name.Name);
}
