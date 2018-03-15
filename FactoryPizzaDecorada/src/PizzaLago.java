
public class PizzaLago extends PizzaStore{

	@Override
	public Pizza createPizza(String tipoPizza) {
		switch(tipoPizza) {
		case "PizzaA":
			Pizza a = new PizzaA("pizzaLago",tipoPizza);
			a = new Adobada(a);
			return a;
		case "PizzaB":
			Pizza b = new PizzaB("pizzaLago",tipoPizza);
			b = new Aceituna(b);
			b = new Pepperoni(b);
			return b;
		case "PizzaC":
			Pizza c = new PizzaC("pizzaLago",tipoPizza);
			c = new Pepperoni(c);
			c = new Aceituna(c);
			c = new Adobada(c);
			return c;
		default:
			return new PizzaDefault("pizzaLago",tipoPizza);
		}
	}
}
