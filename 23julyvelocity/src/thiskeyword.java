public class thiskeyword {

	
	thiskeyword()  // this keyword for constructor
	{
		System.out.println("no parameter constructor");
	}
	thiskeyword(String name)
	{
		this();
		
	}

	public void demo()     //this keyword for method
	{
		
		System.out.println("welcome");
	}
	public void demo1()
	{
		this.demo();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thiskeyword tk=new thiskeyword("mayuri");
		tk.demo1();
		
}

}
