import java.util.Observable;
import java.util.Observer;

public class ClienteA implements Observer, Showable{
	
	public ClienteA(Observable DHL) {
		DHL.addObserver(this);
	}
	public void show(int valor, Observable obs) {
		if(obs instanceof DHL) {
			System.out.println("El Paquete: " + valor + " ha llegado por DHL");
		}
		else if(obs instanceof Fedex) {
			System.out.println("El Paquete: " + valor + " ha llegado por Fedex");
		}
		if(obs instanceof CorreosMex) {
			System.out.println("El Paquete: " + valor + " ha llegado por CorreosMex");
		}
	}

	@Override
	public void update(Observable observable, Object arg) {
		update(observable);
	}
	
	public void update(Observable observable) 
	{
		if(observable instanceof DHL) 
		{
			for(Pack pack : ((DHL) observable).getPaquetes()) {
				show(pack.getID(),observable);
			}
			observable.deleteObserver(this);
		}
		else if (observable instanceof Fedex) {
			for(Pack pack : ((Fedex)observable).getPaquetes()) {
				show(pack.getID(),observable);
			}
			observable.deleteObserver(this);
		}
		else if(observable instanceof CorreosMex) {
			for(Pack pack : ((CorreosMex) observable).getPaquetes()) {
				show(pack.getID(),observable);
			}
			observable.deleteObserver(this);
		}
	}
}
