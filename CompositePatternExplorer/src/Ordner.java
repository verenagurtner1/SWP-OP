import java.util.ArrayList;

public class Ordner implements IComponent{

	ArrayList<IComponent> componenten = new ArrayList<>();
	private String name="Datei";
	private int groeﬂe=1;
	private String inhalt="";
	
	public Ordner(String n)
	{
		this.name=n;
	}

	@Override
	public int getSize() {
		//groeﬂe ++ oder so?
		return groeﬂe;
	}

	@Override
	public String getContent() {
		String inhalt ="Inhalt des Ordners";
		return inhalt;
	}

	@Override
	public String getName() {
		return name;
	}
	
	public void addChild(IComponent component)
	{
		componenten.add(component);
	}
	
	public IComponent getChild(int pos)
	{
		return componenten.get(pos);
	}
	
	public void deleteChild(int pos){
		componenten.remove(pos);
	}
	
	public ArrayList<String[]> getInhalt(ArrayList<IComponent> componenten){
		
		ArrayList<String[]> Liste = new ArrayList<>();
		
		for(int anzahl = 0;anzahl<=componenten.size();anzahl++)
		{
			String[] reihe=new String[2];
			//ausf¸hren von Methode operation von Typ IComponent, da dann egal isch ob Datei oder Ordner
			reihe[1]=componenten.get(anzahl).getContent();
			reihe[2]=componenten.get(anzahl).getName();
			
			Liste.add(reihe);
		}
		return Liste;
	}

}
