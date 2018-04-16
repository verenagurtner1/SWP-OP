
public class KaeseDecorator extends ZutatenDecorator{
	private static String beschreibung=" mit K�se";
	private static double preis=2.0;
	
	public KaeseDecorator(Pizza pizza)
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
