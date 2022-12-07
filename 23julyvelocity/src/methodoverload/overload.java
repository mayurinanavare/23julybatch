package methodoverload;

public class overload {
	
	public void print(int num)
	{
		System.out.println("First print method:");
		System.out.println("integer number :" +num );
		System.out.println();
	}
	public  void print(float num) 
	{
		System.out.println("Second print method:");
		System.out.println("float number:" +num);
		System.out.println();
	}
	public void print(String name)
	{
		System.out.println("Third print method:" );
		System.out.println("String:" +name);
		System.out.println();
	}
	public static void print(int num1,int num2)
	{
		System.out.println("Fourth print method:");
		System.out.println("Addition of two number is:" +(num1+num2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload ol=new overload();
		ol.print(5);
		ol.print(7);
		ol.print(3.563f);
		ol.print("mayuri");
		ol.print(10,20);
		
	

	}

}
