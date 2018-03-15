
public class Main {

	public static void main(String[] args) {
		PizzaStore ps = new PizzaCetys();
		
		Pizza pizza = ps.orderPizza("");
		pizza = ps.orderPizza("PizzaA");
		pizza = ps.orderPizza("PizzaB");
		pizza = ps.orderPizza("PizzaC");
		
		ps = new PizzaLago();
		pizza = ps.orderPizza("");
		pizza = ps.orderPizza("PizzaA");
		pizza = ps.orderPizza("PizzaB");
		pizza = ps.orderPizza("PizzaC");

	}

}
