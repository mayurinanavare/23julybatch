package abstractclass;

public abstract  class ABCD {
	public abstract   void add(); //incomplete method
	
	public void sub()  //complete method
	{
		
	}
	static void sub1()
	{
		System.out.println("satic method");
	}

	ABCD()
	{
		 System.out.println("addition of two number is:" );
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABCD x=new ABCD(); //abstract does not create object

	}

}
