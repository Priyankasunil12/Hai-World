package parameters;

public class parameters {
	//a and b are parameters//
	static int para(int a)
	{
		int c;
		c=a+1;
		return c;
		
	}
	public static void main(String[] args) {
		int x=52;
		int z;
		parameters p=new parameters();
		z=p.para(x);
		System.out.println("The value of z " + z );		
		
	}

}
