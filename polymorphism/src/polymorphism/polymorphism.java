package polymorphism;
//The condition of occuring in different forms//
 class polymorphism {
	
 public int polymorphism(int a,int b)
	{
		return (a+b);
	}
	public int polymorphism(int a,int b,int c) 
		{
		return (a+b+c);	
		}
public double polymorphism(double a,double b)
{
	return (a+b);
}
	public static void main(String[] args) {
	polymorphism poly=new polymorphism();
	System.out.println(poly.polymorphism(2,3));
	System.out.println(poly.polymorphism(4,5,6));
	System.out.println(poly.polymorphism(2.4,3.5));
	

	}

}
