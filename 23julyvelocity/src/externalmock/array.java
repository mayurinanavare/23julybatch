package externalmock;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {70,90,30,40,50};
		int temp;
		int size;
		size=a.length;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("largest number is" +a[size-4]);  //5

	}

}
