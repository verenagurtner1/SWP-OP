
public class User {
	
	//uses IPizza
	//called Factory

	public static void main(String[] args) {
		
		System.out.println("Kunde bestellt Pizza");
		Factory.createPizza("Margaritha");

		System.out.println("Kunde bestellt Pizza");
		Factory.createPizza("Diavolo");

		System.out.println("Kunde bestellt Pizza");
		Factory.createPizza("Spinaci");
	}

}
