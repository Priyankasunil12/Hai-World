
public class Arguments {
	static int argu(int a,int b)
	{
	    return a+b;
	}

	public static void main(String[] args) {
		int x=13;
		int y=12;
		int sum;
		Arguments obj=new Arguments();
		// x and y are arguments//
		sum=obj.argu(x, y);
		System .out.println("The sum is " + sum);

	}

}
