
public class Datei implements IComponent{

	@Override
	public void operation() {
		//zeigt den Inhalt an
		System.out.println("Anzeige des Dateiinhalts");
		
	}

	@Override
	public int getSize() {
		//System.out.println("Größe der Date");
		return 1;
	}

	@Override
	public String getContent() {
		String inhalt ="Inhalt der Datei";
		return inhalt;
	}

}
