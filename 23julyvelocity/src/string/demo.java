package string;

public class demo  {
	
	 String name1="mayuri";  //constant pool area
	 String name2="mayuri";
	// String name1="class";
	 
	  //String name3="mayuri";
	 
	 String a="mayuri";
	 String b="nanavare";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d=new demo();
		System.out.println(d.name1==d.name2); //data are same so string pool create one object for both
		System.out.println(d.a==d.b);  ///data are different so string pool create two different object 
		
		
		

	}

}
