
public class Test {
	
	static IHeizObserver hausmeister = new Hausmeister();
	static IHeizObserver verwaltung = new Hausverwaltung();
	
	static Heizung heizung = new Heizung();
	
	public static void main(String[] args) {
		heizung.subscribe(hausmeister);
		heizung.subscribe(verwaltung);
		
		heizung.setHeizWert(15);
		
		heizung.unsubscribe(hausmeister);
		
		heizung.setHeizWert(20);

	}

}
