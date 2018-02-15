import java.util.Observer;

public class Main {

	public static void main(String[] args) {
		DHL dhl = new DHL();
		Fedex fedex = new Fedex();
		CorreosMex cm = new CorreosMex();
		int contador =0;
		while(contador<100000) {
		Observer paco = new ClienteA(dhl);
		dhl.regPack(paco);
		dhl.regPack(paco);
		dhl.delivery();
		
		paco = new ClienteA(fedex);
		fedex.regPack(paco);
		fedex.regPack(paco);
		fedex.delivery();
		
		paco = new ClienteA(cm);
		cm.regPack(paco);
		cm.regPack(paco);
		cm.delivery();
		contador++;
		}
		
	}

}
