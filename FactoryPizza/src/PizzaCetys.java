
public class PizzaCetys extends PizzaStore{

	@Override
	public Pizza createPizza(String tipoPizza) {
		switch(tipoPizza) {
		case "PizzaA":
			return new PizzaA("pizzaCetys");
		case "PizzaB":
			return new PizzaB("pizzaCetys");
		case "PizzaC":
			return new PizzaC("pizzaCetys");
		default:
			return new PizzaDefault("pizzaCetys");
		}
	}
}
