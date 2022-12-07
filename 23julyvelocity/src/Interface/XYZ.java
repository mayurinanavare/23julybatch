package Interface;

public class XYZ implements A {
	
	
	public void add()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
	}
	public void mul()
	{   
	 
		//System.out.println("name of interface " +name);
		System.out.println("software testing");
	}
	public void sub()
	{
		System.out.println("welcome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(name);
	
		XYZ x=new XYZ();
		x.add();
		x.mul();
		x.sub();
		

	}

}
