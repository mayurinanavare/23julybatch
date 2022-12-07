package Interface;

public class staticmethod2 implements interface2 {
	
	public void demo2()
	{
	    interface2.super.demo2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticmethod2 sm=new staticmethod2();
		sm.demo2();
		
	}

}
