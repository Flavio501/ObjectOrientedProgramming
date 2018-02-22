import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerInputStream extends FilterInputStream{

	protected LowerInputStream(InputStream arg0) {
		super(arg0);
	}
	
	@Override
	public int read() throws IOException {
		int salida = super.read();
	    if (salida < 0) { 
	        return salida;
	    }
	    return (Character.toLowerCase((char) salida));
	}

}
