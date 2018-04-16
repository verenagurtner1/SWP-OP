
public class GemueseDecorator extends ZutatenDecorator{
	private static String beschreibung=" mit Gem�se";
	private static double preis=2.0;
	
	public GemueseDecorator(Pizza pizza)
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
