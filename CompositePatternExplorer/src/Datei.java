
public class Datei implements IComponent{

	private String name="Datei";
	private int groe�e=1; 
	private String inhalt="";
	
	public Datei(String n)
	{
		this.name=n;
	}

	@Override
	public int getSize() {
		return groe�e;
	}

	@Override
	public String getContent() {
		String inhalt ="Inhalt der Datei";
		return inhalt;
	}

	@Override
	public String getName() {
		return name;
	}

}
