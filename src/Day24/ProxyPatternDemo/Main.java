package Day24.ProxyPatternDemo;

public class Main {

	public static void main(String[] args) {

		Document doc1 = new DocumentProxy("ADMIN");
		doc1.open();
		
        System.out.println();
        
        Document doc2 = new DocumentProxy("USER");
		doc2.open();
	
	}

}
