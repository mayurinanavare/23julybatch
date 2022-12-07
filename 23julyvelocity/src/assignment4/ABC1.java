package assignment4;

public class ABC1 extends ABC implements XYZ{
	
	float b=3.45f;
	public void add()
	{
		System.out.println("interface method completed");
	}
	public void display()
	{
		String name="software";
		String name1="testing";
		System.out.println(name+name1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC1 x=new ABC1();
		x.show();
		x.add();
		System.out.println(x.name);
		System.out.println(c);
		System.out.println(x.b);

	}

}
