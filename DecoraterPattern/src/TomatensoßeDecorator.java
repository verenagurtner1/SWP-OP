
public class TomatensoßeDecorator extends ZutatenDecorator{

	private static String beschreibung=" mit Tomatensoße";
	private static double preis=1.0;
	
	public TomatensoßeDecorator(Pizza pizza)
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
