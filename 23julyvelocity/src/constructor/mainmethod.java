package constructor;

public class mainmethod {

	public static void main(int a) {   //main method overloading
		// TODO Auto-generated method stub
		System.out.println(a);
		

	}
	public  static void main(String name)
	{
		System.out.println(name);
	}
	public static void main(String [] args)
	{
		main(10);
		main("mayuri");
		System.out.println("i am so happy");
	}

}
