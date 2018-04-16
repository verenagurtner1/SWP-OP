import java.util.ArrayList;

public class Ordner implements IComponent{

	ArrayList<IComponent> componenten = new ArrayList<>();
	
	@Override
	public void operation() {
		//zeigt Inhalt des Ordners an
		System.out.println("Inhalte des Ordners:");
		//Anzeige von Inhalt 
		
	}

	@Override
	public int getSize() {
		
		return 1;
	}

	public void addComponent(IComponent c){
		componenten.add(c);
	}
	
	public void deleteComponent(int pos){
		componenten.remove(pos);
	}
	
	public IComponent getComponent(int pos){
		return componenten.get(pos);
	}
	
	public ArrayList<IComponent> getInhalt(){
		
		for(int anzahl = 0;anzahl<=componenten.size();anzahl++)
		{
			//ausführen von Methode operation von Typ IComponent, da dann egal isch ob Datei oder Ordner
		}
		return componenten;
	}

	@Override
	public String getContent() {
		
		// TODO Anzahl von Inhalte vom Ordner 
		System.out.println("PENIS");
		return null;
	}
}
