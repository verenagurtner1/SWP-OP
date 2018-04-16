
public class Test {

	public static void main(String[] args) {
		
		System.out.println("HIIIIIII");
		Ordner ordner = new Ordner("temp");
		ordner.addChild(ordner);
		Datei datei = new Datei("dokument1");
		ordner.addChild(datei);
		//System.out.println(ordner.getInhalt(componenten));
		System.out.println("Größe des Ordners: "+ordner.getSize());
	}

}
