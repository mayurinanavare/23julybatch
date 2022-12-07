package defaultinterface;

public class interfaceclass1 implements A{
	public void demo()
	{
		System.out.println("public and abstract method show in second implement class");
	}
	public void demo1()
	{
		System.out.println("public and abstract method show in second implement class");
	}
	public void demo3()
	{
		System.out.println("default method override");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		interfaceclass1 is=new interfaceclass1();
		is.demo();
		is.demo1();
		is.demo3();

	}

}
