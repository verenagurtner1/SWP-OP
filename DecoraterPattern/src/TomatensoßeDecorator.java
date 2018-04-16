
public class Tomatenso�eDecorator extends ZutatenDecorator{

	private static String beschreibung=" mit Tomatenso�e";
	private static double preis=1.0;
	
	public Tomatenso�eDecorator(Pizza pizza)
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
