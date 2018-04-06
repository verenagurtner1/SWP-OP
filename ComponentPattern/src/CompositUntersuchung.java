
import java.awt.Composite;
import java.util.ArrayList;

public class CompositUntersuchung implements Component {
private ArrayList<Component> child = new ArrayList<>(); 
	
	@Override
	public void operation() {
		System.out.println("Untersuchung wird durchgef�hrt");
	}

	@Override
	public int getPrize() {
		int sum = 0;
		for (int i = 0; i < child.size(); i++) {
			sum += child.get(i).getPrize();
		}
		return sum;
	}
	
	public void addChild(Component c) {
		child.add(c);
	}
	
	public void removeChild(int pos) throws IndexOutOfBoundsException{
		child.remove(pos);
	}
	
	public Component getChild(int pos) throws IndexOutOfBoundsException{
		return child.get(pos);
	}
	
	public int getChildSize() {
		return child.size();
	}
}