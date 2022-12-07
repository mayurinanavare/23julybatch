package array;

public class simple1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		 a[0]=10;
		 a[1]=12;
		 a[2]=34;
		 a[3]=35;
		 a[4]=56;
		 //a[5]=67;  //arrayindexoutofboundexception
		 
		 System.out.println(a[1]);
		 
		 System.out.println("----------------print all array-----------");
		 for(int i=0;i<=a.length-1;i++)
		 {
			 System.out.println(a[i]);
		 }

	}

}
