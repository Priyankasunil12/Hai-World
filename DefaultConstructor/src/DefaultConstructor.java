
public class DefaultConstructor {
	int num;
	String name;
	DefaultConstructor()
	{
		System.out.println("Default Constructor");
	}

	public static void main(String[] args) {
		//default constructor is invoked when creating the obj//
		DefaultConstructor con=new DefaultConstructor();
		//Default constructor will provide default values to the variables//
		System.out.println("Default value for num : " + con.num);
		System.out.println("Default value for name : " + con.name);
		

	}

}
