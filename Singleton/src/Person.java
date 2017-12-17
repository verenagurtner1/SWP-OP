/**
 * Erstellung eines Singleton Pattern
 * @author Verena
 *
 */
public class Person {
	
	static String name="";


	public static Person instance =null;
	private Person(String name)
	{
		this.name=name;
	}
	
	public static Person getInstance(){
		if(Person.instance==null)
		{
			instance=new Person(name);
			System.out.println("Es wurde ein neuer Singelton erstellt:");
		}
		return Person.instance;
	}
	
	public void setName(String Name)
	{
		name=Name;
	}
	
	public void name()
	{
		System.out.println(name);
	}
}