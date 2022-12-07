package multilevelinheritance;

public class classC extends classB {
	
	public void add()
	{
	
		//System.out.println("addition of two number is:" +(a+b));
		System.out.println("addition of two number");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		classC cs=new classC();
		cs.input();
		cs.input2();
		cs.add();
	System.out.println(cs.b);

	}

}
