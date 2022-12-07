package fromstarting;

public class superkeyword extends thiskeyword {
	
   public void demo1()
   {
	   int a=24;
	   System.out.println(a);
	   System.out.println(super.a);
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superkeyword sk=new superkeyword();
		//System.out.println(sk.a);
		sk.demo1();
		sk.demo();
	

	}

}
