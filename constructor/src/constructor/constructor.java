package constructor;

 public class constructor {
	String name="program";
	constructor()
	{
	System.out.println("constructor created");
		
	}

	public static void main(String[] args) {
	constructor cons=new constructor();
	
System.out.println("constructor created " + cons.name);
			
   }

}
