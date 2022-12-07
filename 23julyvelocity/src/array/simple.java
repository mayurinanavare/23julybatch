package array;

public class simple {

	 int a[]= {10,23,34,56,67,78};  ///non static array 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     String name[]= {"mayuri","samrth","yogesh","pooja","rucha"};
	     //private int a=10;
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.print(name[i] +" ");
		}
		
		System.out.println();
		System.out.println(name[0]);
		simple s=new simple();
		for(int i=0;i<=s.a.length-1;i++)
		{
			System.out.println(s.a[i]);
		}

	}

}
