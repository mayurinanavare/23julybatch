package inheritance;

public class classB extends classA {
	
	public void showB()
	{
		System.out.println("classB method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classB cb=new classB();
		cb.showA();
		cb.showB(); // single inheritance 

	}

}
