import java.util.ArrayList;

public class Heizung{

	private static float heizwert;
	static ArrayList<IHeizObserver> observer=new ArrayList<IHeizObserver>();
	
	public static float getHeizWert()
	{
		return heizwert;
	}

	public void setHeizWert(float heizWert) 
	{
		this.heizwert = heizWert;
		informAll();
	}
	
	public static void subscribe (IHeizObserver observers)
	{
		observer.add(observers);
	}
	
	public static void unsubscribe (IHeizObserver observers)
	{
		observer.remove(observers);
	}
	
	public void informAll()
	{
		for(IHeizObserver observers : observer)
		{
			observers.update();
		}
			
	}
	

}
