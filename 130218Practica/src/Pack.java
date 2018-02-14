import java.util.Observer;

public class Pack {
	private int ID;
	private boolean Delivered;
	private Observer Cliente;
	
	public Pack(int id, boolean del,Observer cliente) {
		this.ID = id;
		this.Delivered = del;
		this.Cliente = cliente;
	}
	
	public int getID() {
		return ID;
	}
	
	public boolean getDelivered() {
		return Delivered;
	}
	
	public void setDelivered(boolean del) {
		this.Delivered = del;
	}
	
	public Observer getCliente() {
		return Cliente;
	}
}
