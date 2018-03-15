
public class PizzaCetys extends PizzaStore{

	@Override
	public Pizza createPizza(String tipoPizza) {
		switch(tipoPizza) {
		case "PizzaA":
			Pizza a = new PizzaA("pizzaCetys",tipoPizza);
			a = new Pepperoni(a);
			return a;
		case "PizzaB":
			Pizza b = new PizzaB("pizzaCetys",tipoPizza);
			b = new Aceituna(b);
			return b;
		case "PizzaC":
			Pizza c = new PizzaC("pizzaCetys",tipoPizza);
			c = new Pepperoni(c);
			c = new Aceituna(c);
			return c;
		default:
			return new PizzaDefault("pizzaCetys","Pizza chafa mas cara por no especificar");
		}
	}
}
