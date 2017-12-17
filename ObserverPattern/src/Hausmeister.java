
public class Hausmeister implements IHeizObserver{
	
	public void update()
	{
		System.out.println("Ich bin der Hausmeister und der Wert der Heizung liegt jetzt bei "+ Heizung.getHeizWert()+"°C");
	}

}
