import java.util.Stack;

public class CommandRecorder {

	public Stack mainStack;
	public Stack secund�rStack;
	public ICommand ICommand;
	
	public void undoSchritt(ICommand c)
	{
		
	}
	
	public void redoSchritt()
	{
		
	}
	
	public void ausf�hren(ICommand ICommand)
	{
		this.ICommand=ICommand;
	}
}
