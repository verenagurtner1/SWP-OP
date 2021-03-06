
public class SchinkenDecorator extends ZutatenDecorator{

	private static String beschreibung=" mit Schinken";
	private static double preis=2.5;
	
	public SchinkenDecorator(Pizza pizza)
	{
		this.pizza = pizza;
	}

	public String getBeschreibung(){
		
		return this.pizza.getBeschreibung() + beschreibung;
	}

	public double preis()
	{
		return this.pizza.preis()+preis;
	}
}
