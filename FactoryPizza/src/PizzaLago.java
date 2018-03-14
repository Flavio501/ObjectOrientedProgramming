
public class PizzaLago extends PizzaStore{

	@Override
	public Pizza createPizza(String tipoPizza) {
		switch(tipoPizza) {
		case "PizzaA":
			return new PizzaA("pizzaLago");
		case "PizzaB":
			return new PizzaB("pizzaLago");
		case "PizzaC":
			return new PizzaC("pizzaLago");
		default:
			return new PizzaDefault("pizzaLago");
		}
	}
}
