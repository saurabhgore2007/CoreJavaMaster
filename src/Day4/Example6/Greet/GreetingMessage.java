package Day4.Example6.Greet;

//Child Class
public class GreetingMessage extends Message {

	public String greet;
		
		public GreetingMessage()
		{
			super();
			this.greet = "Awesome";
		}
	
		public GreetingMessage(String greet)
		{
			this.greet = greet;
		}
	
		public GreetingMessage(String greet, String msg)
		{
			super(msg);
			this.greet = greet;
		}
	
		@Override
		public String toString()
		{
			return super.toString() + "\t" + greet;
		}
}
