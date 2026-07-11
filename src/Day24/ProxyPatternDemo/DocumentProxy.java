package Day24.ProxyPatternDemo;

public class DocumentProxy implements Document{

	private String role;
	private RealDocument document;
	
	public DocumentProxy(String role) {
		this.role = role;
	}
	
	@Override
	public void open() {
		
		if(role.equalsIgnoreCase("ADMIN")) {
			
			if(document == null) {
				document = new RealDocument();
			}
			document.open();
		}
		else {
            System.out.println("Access Denied");
		}
	}
}
