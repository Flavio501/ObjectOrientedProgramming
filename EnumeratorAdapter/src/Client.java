import java.util.*;

public class Client {

	public static void main(String[] args) {
		
		Vector<Object> vec = new Vector<Object>();
		vec.add("Primero");
		vec.add("Segundo");
		vec.add("Tercero");
		
		Enumeration enu = vec.elements();
		Adapter adapter = new Adapter(enu);
		
		while(adapter.hasNext()) {
			System.out.println(adapter.next().toString());
		}
		
		adapter.remove();
		
	}

}
