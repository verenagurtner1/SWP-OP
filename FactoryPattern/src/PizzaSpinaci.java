import java.util.ArrayList;

public class PizzaSpinaci implements IPizza{
	
	@Override
	public void zubereiten() {
		
		System.out.println("---------------------------------------------");
		System.out.println("Pizza Diavolo wird zubereitet:");
		ArrayList<Zutaten> zutaten = new ArrayList<Zutaten>();
		zutaten = getZutaten();
		System.out.println("Folgende Zutaten werden benötigt: "+zutaten);
		System.out.println("Pizza belegen");
		System.out.println("Pizza backen");
		System.out.println("---------------------------------------------");
		
	}

	@Override
	public ArrayList<Zutaten> getZutaten() {
	
		ArrayList<Zutaten> zutaten = new ArrayList<Zutaten>();
		Zutaten z0 = new Zutaten("Teig", 1,"eine Teigkugel");
		Zutaten z1 = new Zutaten("Tomatensauce", 7,"ml");
		Zutaten z2 = new Zutaten("Käse", 2,"Händevoll");
		Zutaten z3 = new Zutaten("Oregano", 1,"Prise");
		Zutaten z4 = new Zutaten("Spinat", 15,"Blätter");
		
//		for(int i=0;i<=10;i++)
//		{
//			//String a =z+i;
//			zutaten.add(z0);
//		}
		zutaten.add(z0);
		zutaten.add(z1);
		zutaten.add(z2);
		zutaten.add(z3);
		zutaten.add(z4);
	
		return zutaten;
	}

}
