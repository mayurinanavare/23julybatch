package defaultinterface;

public interface A {
	
	public void demo();
	
	public void demo1();
	
	default void demo3()
	{
		//System.out.println("default method");
	}

}
