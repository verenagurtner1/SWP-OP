
public class Fiebermessen implements Component{

	@Override
	public void operation() {
		System.out.println("Fieber wird gemessen");
	}

	@Override
	public int getPrize() {
		return 11;

	}
}
