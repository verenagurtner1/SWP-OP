
public class HoeherCommand implements ICommand{
	
	private Figur f;
	private int meter;

	@Override
	public void doit() {
		f.hoeher(meter);
		
	}

	@Override
	public void undoit() {
		f.hoeher(-meter);
		
	}
	
	public HoeherCommand(Figur f,int meter)
	{
		this.f=f;
		this.meter=meter;
	}

}
