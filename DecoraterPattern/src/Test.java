
public class Test {

	public static void main(String[] args) {
		Pizza p = new GemueseDecorator( new KleinePizza());
		p= new KaeseDecorator(p);
		p=new GemueseDecorator(p);
		System.out.println("Beschreibung der Pizza: "+p.getBeschreibung());
		System.out.println("Preis der Pizza: "+p.preis()+"�");
		
		/*
		 *f�r Decorator und FactoryPattern zusammen
		if(pizza s=="diavolo")
		{
			Pizza getPizzaDiavolo()
			
			//des daweil in a pivate Variable speichern und ABfragen um mehr Zuatten hinzuzuf�gen
			return new SalamiDec (new K�seDec(new PfefferoniDec(new MPizza)));
		}
		*/
	}

}
