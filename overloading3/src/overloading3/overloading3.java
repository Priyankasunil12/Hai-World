package overloading3;

public class overloading3 {
	static void display(int a)
	{
		System.out.println("Got integer vaue " + a);
		
	}
    static void display(String a)
    {
    	System.out.println("Got string value " + a);
    }
	public static void main(String[] args) {
		display(2);
		display("Hello");

	}

}
