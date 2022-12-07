package array;

public class arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		int size=a.length;
	
		System.out.println(size);

		a[0]=a[0]+a[1];
		a[1]=a[1]+a[2];
		a[2]=a[2]+a[3];
		a[3]=a[3]+a[4];
		a[4]=a[3]+a[4];
		System.out.println(a[0]+ " " +a[1]+ " "+a[2]+ " "+a[3]+ " "+a[4]);
		
		
		

	}

}
