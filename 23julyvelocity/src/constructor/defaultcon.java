package constructor;

public class defaultcon {
	
  public void add()
  {
	  int a=10,b=20;
	  System.out.println("addition of two number is :" +(a+b));
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          defaultcon dc=new defaultcon();  //compiler call constructor
          dc.add();
	}

}
