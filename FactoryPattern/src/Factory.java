
public class Factory {
	
	//Kunde ruft nur Factory ab
	IPizza Pizza;
	
	public static IPizza createPizza(String pizzawahl)
	{
		if(pizzawahl.equalsIgnoreCase("Margaritha"))
		{
			PizzaMargaritha pizzam = new PizzaMargaritha();
			pizzam.zubereiten();
			
			return pizzam;
		}
		else if(pizzawahl.equalsIgnoreCase("Diavolo"))
		{
			PizzaDiavolo pizzad = new PizzaDiavolo();
			pizzad.zubereiten();
			
			return pizzad;
		}
		else if(pizzawahl.equalsIgnoreCase("Spinaci"))
		{
			PizzaDiavolo pizzad = new PizzaDiavolo();
			pizzad.zubereiten();
			
			return pizzad;
		}
		else {
			System.out.println("Die ausgewählte Pizza verkaufen wir leider nicht");
			return null;
		}
		
		
	}
}
