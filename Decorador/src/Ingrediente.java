
public abstract class Ingrediente extends Bebida{
	private Bebida bebida;

    public Ingrediente(Bebida beb, int costo) {
        this.bebida = beb;
        super.Costo = costo;
    }
    
    @Override
    public int getCost() {
        return bebida.getCost() + super.Costo;
    }
    public String descripcionIngrediente() {
        return bebida.Descripcion();
    }
}
