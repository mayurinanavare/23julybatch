package polymorphism;

public class compilepoly {
	
	public void test(int a,int b)
	{
		System.out.println("addition of two number is:" +(a+b));
	}
	public static void test()
	{
	  String name1="mayuri";
	  System.out.println("length of string is:" +name1.length());
	}
	public static void test(float a)
	{
		System.out.println("float number is:" +a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compilepoly cp=new compilepoly();
		cp.test(10, 20);
		cp.test();
		cp.test(3.45667894f);
		
		

	}

}
