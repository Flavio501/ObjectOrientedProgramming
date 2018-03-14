
public class Main {

	public static void main(String[] args) {
		PizzaStore ps = new PizzaCetys();
		
		Pizza pizza1 = ps.orderPizza("PizzaA");
		pizza1 = ps.orderPizza("");
		Pizza pizza2 = ps.orderPizza("PizzaB");
		Pizza pizza3 = ps.orderPizza("PizzaC");
		
		ps = new PizzaLago();
		Pizza pizza4 = ps.orderPizza("PizzaA");
		pizza4 = ps.orderPizza("");
		Pizza pizza5 = ps.orderPizza("PizzaB");
		Pizza pizza6 = ps.orderPizza("PizzaC");

	}

}
