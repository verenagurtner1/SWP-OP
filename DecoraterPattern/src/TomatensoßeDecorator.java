
public class TomatensoﬂeDecorator extends ZutatenDecorator{

	private static String beschreibung=" mit Tomatensoﬂe";
	private static double preis=1.0;
	
	public TomatensoﬂeDecorator(Pizza pizza)
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
