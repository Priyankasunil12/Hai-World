package overloading1;

public class overloading1 {
	static void display(int a)
	{
		System.out.println("Argument : " + a);
	}
static void display(double a, double b)
{
	System.out.println("Arguments are : " + a  + b);
}
	public static void main(String[] args) {
	display(5);
 display(3.5 , 4.5);
		

	}

}
