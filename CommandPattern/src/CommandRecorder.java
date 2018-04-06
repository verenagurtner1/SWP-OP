import java.util.Stack;

public class CommandRecorder {

	public Stack mainStack;
	public Stack secundärStack;
	public ICommand ICommand;
	
	public void undoSchritt(ICommand c)
	{
		
	}
	
	public void redoSchritt()
	{
		
	}
	
	public void ausführen(ICommand ICommand)
	{
		this.ICommand=ICommand;
	}
}
