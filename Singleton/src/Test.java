public class Test {

	public static void main(String[] args) {
		Person eins = Person.getInstance();
		Person zwei = Person.getInstance();
		
		eins.setName("Susan");
		zwei.name();
	}

}