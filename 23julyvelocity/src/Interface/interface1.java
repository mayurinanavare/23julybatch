package Interface;

public interface interface1 extends interface2 {
	public  void demo() ;	
 	static void test()
	{
		System.out.println("welcome");
	}
	
	public static void main (String args[])
	{
		interface1.test();
		//interface2.demo2();
	}

}
