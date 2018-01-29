
public class VorCommand implements ICommand{
	
	private Figur f;
	private int meter;

	@Override
	public void doit() {
		f.vor(meter);
		
	}

	@Override
	public void undoit() {
		f.vor(-meter);
		
	}
	
	public VorCommand(Figur f,int meter)
	{
		this.f=f;
		this.meter=meter;
	}

}
