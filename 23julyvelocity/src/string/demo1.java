package string;

public class demo1 {

	
	 String a= new String("mayuri"); // non constant pool area
	 String b= new String("mayuri");
	 

	 String c= new String("mayuri"); // non constant pool area
	 String d= new String("nanavare");
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      demo1 d=new demo1();
      System.out.println(d.a==d.b); //data are same but non constant pool area create two object 
      
      System.out.println(d.c==d.d);  ///
      
      
      
       
	}

}
