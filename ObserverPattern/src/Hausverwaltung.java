
public class Hausverwaltung implements IHeizObserver{
	
	public void update()
	{
		System.out.println("Ich bin die Hausverwaltung und der Wert der Heizung liegt jetzt bei "+ Heizung.getHeizWert()+"°C");
	}

}
