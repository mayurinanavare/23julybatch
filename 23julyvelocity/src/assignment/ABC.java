package assignment;

public class ABC implements A,B {    

	public void show()
	{
		System.out.println("complete method of interface A");
	}
	public void display()
	{
		System.out.println("complete method of interface B");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC x=new ABC();
		x.show();
		x.display();
		System.out.println(name);  //variable of interface A
		System.out.println(b);  //variable of interface A
		System.out.println(c);  //variable of interface B

	}

}
