
public class VorCommand implements ICommand{
	
	private Figur f;
	private int meter;

	@Override
	public void doit() {
		f.vor(meter);
		System.out.println("Die Figur ist "+meter+" Meter nach hinten gefahren.");
		
	}

	@Override
	public void undoit() {
		f.vor(-meter);
		System.out.println("Die Figur ist "+meter+" Meter nach vorne gefahren.");
	}
	
	public VorCommand(Figur f,int meter)
	{
		this.f=f;
		this.meter=meter;
	}

}
