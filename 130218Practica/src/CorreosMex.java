import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CorreosMex extends Observable{
	
	private List<Pack> paquetes = new ArrayList<Pack>();
	
	public void packetChanged() {
		setChanged();
		notifyObservers(this);
	}
	
	public int genID() {
		Random rnd = new Random();
		int n = 100000 + rnd.nextInt(900000);
		return n;
	}
	
	public void regPack(Observer cliente) {
		paquetes.add(new Pack(genID(),false,cliente));
	}
	
	public List<Pack> getPaquetes(){
		return this.paquetes;
	}
	
	public void delivery() {
		for(Pack paq : paquetes) 
		{
			paq.setDelivered(true);
		}
		try {
			TimeUnit.SECONDS.sleep(10);
			packetChanged();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
