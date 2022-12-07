package defaultinterface;

public class interfaceclass implements A {  //implement class1
	
	public void demo()
	{
		System.out.println("public and abstract method show in first implement class");
	}
	public void demo1()
	{
		System.out.println("public and abstract method  show in first implement class ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceclass is=new interfaceclass();
		is.demo();
		is.demo1();
	//	is.demo3();   //default method calling without override

	}

}
