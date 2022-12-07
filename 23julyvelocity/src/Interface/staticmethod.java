package Interface;

public class staticmethod implements interface1,interface2 {

	public void demo()                         //incomplete method from interface1
	{
		System.out.println("incomplete method");
	}
	
	public   void demo2()                       //default method from interface2
	{
		System.out.println("default method can be override");
	}
	
	static void test()                           ///static method can not override and come from interface1
	{
		System.out.println("static method can not override");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticmethod sm=new staticmethod();
		sm.demo(); 
		interface1.test();                        //static method call using interface name
		sm.demo2();
		sm.test();
		
		

	}

}
