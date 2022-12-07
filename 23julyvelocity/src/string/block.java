package string;

public class block {

	 static int a=10;  //static variable
	 int b=30;          //instance variable
	static
	{
		System.out.println("static block");
	}
	void test1()  ///instance method 
	{
		System.out.println("non static method");
	}
 static void test() {
		a=20;
		System.out.println("from test method");
		//b=30; //cannot make static reference to non static field i.e instance variable
		//test1();  //	Cannot make a static reference to the non-static method test1() from the type block

	}
  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method");
		block b=new block();
		b.test();
		block.test();

	}

}
