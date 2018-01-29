
public class Main {

	public static void main(String[] args) {
		Figur f = new Figur();
		VorCommand cmd=new VorCommand(f,2);
		cmd.doit();
	}

}
