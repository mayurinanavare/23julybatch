package constructor;

public class paraconstr {
	
	paraconstr() // user define constructor with zero parameters
	{
		this(10,'+',3.4f);
		String name="mayuri";
		String name1="nanavare";
		System.out.println("string are:" +(name+ " " +name1));
		System.out.println();
	}
	paraconstr(int a,char c,float b) //user define constructor with parameters
	{
		 /*a=45;
		 c='+';
		 b=3.45f;*/
		this("i am happy");
		 System.out.println("addition of a and b using operators: " +(a+b) );
		 System.out.println();
		
}
	paraconstr(String name)
	{
		System.out.println(name);
		System.out.println();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paraconstr xy =new paraconstr();
		paraconstr pc1=new paraconstr(10,'+',3.45f);
		//paraconstr pc2=new paraconstr(20,'+',3.45f);
		paraconstr pc3=new paraconstr("welcome to software testing course");
		
		
		

	}

}
