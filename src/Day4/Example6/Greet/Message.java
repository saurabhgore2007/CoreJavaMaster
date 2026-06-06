package Day4.Example6.Greet;

//Parent Class
public class Message {

    public String msg;
	
		public Message()
		{
			this.msg= "Hello World";
		}
	
		public Message(String msg)
		{
			this.msg = msg;
		}
		
		@Override
		public String toString()
		{
			return msg;
		}
}
