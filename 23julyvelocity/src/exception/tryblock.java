package exception;

public class tryblock {
	
	public static void main(String args[])
	{
		int a=23;
		int b=0;
		int c=0;
		System.out.println("start");
		try
		{
		
			
		
		try
		{
			c=a/b;
		}
		catch(ArithmeticException s)
		{
			
			a=20;
			b=2;
			c=a/b;
			System.out.println("alternative code1");
		}
		}
		
		catch(ArithmeticException s)
		{
			a=50;
			b=2;
			c=a/b;
			System.out.println("alternative code");
		}
		System.out.println(c);
	}

}
