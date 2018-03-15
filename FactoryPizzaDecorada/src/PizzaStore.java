
public abstract class PizzaStore {
	
	
	public Pizza orderPizza(String tipoPizza){
		Pizza pz = createPizza(tipoPizza);
		pz.prepararPizza();
		pz.empacarPizza();
		pz.entregarPizza();
		return pz;
		
	}
	public abstract Pizza createPizza(String tipoPizza);
}
