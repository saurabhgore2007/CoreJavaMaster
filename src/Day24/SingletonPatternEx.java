package Day24;

class ConfigurationManager {

    static {
        System.out.println("Configuration Static Block");
    }

    private static ConfigurationManager instance =
            new ConfigurationManager();

    private ConfigurationManager() {
        System.out.println("Constructor");
    }

    public static ConfigurationManager getInstance() {
        return instance;
    }

}

public class SingletonPatternEx {

	 static {
	        System.out.println("Test Static Block");
	    }
	 
	public static void main(String[] args) {
		
		 	System.out.println("Main Started");

	        ConfigurationManager.getInstance();

	}

}