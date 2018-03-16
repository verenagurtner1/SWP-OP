
public class Zutaten {
	
	String zutat;
	int menge;
	String einheit;
	
	public String getZutat() {
		return zutat;
	}
	public void setZutat(String zutat) {
		this.zutat = zutat;
	}
	public int getMenge() {
		return menge;
	}
	public void setMenge(int menge) {
		this.menge = menge;
	}
	public String getEinheit() {
		return einheit;
	}
	public void setEinheit(String einheit) {
		this.einheit = einheit;
	}
	
	
	public Zutaten(String zutat, int menge,String einheit) {
		super();
		this.zutat = zutat;
		this.menge = menge;
		this.einheit = einheit;
	}
	@Override
	public String toString() {
		return "Zutaten [Zutat=" + zutat + ", Menge=" + menge + ", Einheit=" + einheit + "]";
	}
	
	

}
