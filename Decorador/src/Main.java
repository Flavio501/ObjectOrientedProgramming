
public class Main {
	
	public static void main(String [ ] args)
	{
		Bebida bebida = new Cafe("Small");
		System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion());
    	bebida = new Crema(bebida, 15);
    	System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion());
    	bebida = new Leche(bebida, 20);
    	System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion()+"\n");
    	
    	bebida = new Cafe("Medium");
		System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion());
    	bebida = new Crema(bebida, 15);
    	System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion());
    	bebida = new Leche(bebida, 20);
    	System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion()+"\n");
    	
    	bebida = new Cafe("Large");
		System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion());
    	bebida = new Crema(bebida, 15);
    	System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion());
    	bebida = new Leche(bebida, 20);
    	System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion()+"\n");
    	
    	bebida = new Latte("Small");
		System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion());
    	bebida = new Crema(bebida, 15);
    	System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion());
    	bebida = new Leche(bebida, 20);
    	System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion()+"\n");
    	
    	bebida = new Latte("Medium");
		System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion());
    	bebida = new Crema(bebida, 15);
    	System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion());
    	bebida = new Leche(bebida, 20);
    	System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion()+"\n");
    	
    	bebida = new Latte("Large");
		System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion());
    	bebida = new Crema(bebida, 15);
    	System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion());
    	bebida = new Leche(bebida, 20);
    	System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion()+"\n");
    	
    	bebida = new Mocka("Small");
		System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion());
    	bebida = new Crema(bebida, 15);
    	System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion());
    	bebida = new Leche(bebida, 20);
    	System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion()+"\n");
    	
    	bebida = new Mocka("Medium");
		System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion());
    	bebida = new Crema(bebida, 15);
    	System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion());
    	bebida = new Leche(bebida, 20);
    	System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion()+"\n");
    	
    	bebida = new Mocka("Large");
		System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion());
    	bebida = new Crema(bebida, 15);
    	System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion());
    	bebida = new Leche(bebida, 20);
    	System.out.println("$"+bebida.getCost() + ", " + bebida.Descripcion()+"\n");
	}
}