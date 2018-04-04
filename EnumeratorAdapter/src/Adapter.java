import java.util.*;

public class Adapter implements Iterator{

	Enumeration enumer;
	
	public Adapter(Enumeration enu) {
		this.enumer = enu;
	}
	
	@Override
	public boolean hasNext() {
		if(enumer.hasMoreElements()) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		return enumer.nextElement();
	}

	@Override
	public void remove() {
		System.out.println("Deprecated since myAPI v13");
	}


}
