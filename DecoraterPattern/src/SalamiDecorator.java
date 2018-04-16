
public class SalamiDecorator extends ZutatenDecorator{

	private static String beschreibung=" mit Salami";
	private static double preis=2.0;
	
	public SalamiDecorator(Pizza pizza)
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
