package Day24.ProxyPatternDemo;

public class RealDocument implements Document{

	@Override
	public void open() {
		
        System.out.println("Opening Confidential Document");

	}
}
