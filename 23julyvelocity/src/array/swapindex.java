package array;

public class swapindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {89,23,45,56,67,78};
		int temp;
		for(int i=0;i<=a.length-1;i++)  //i=0
		{
			for(int j=i+1;j<=a.length-1;j++) //j=1
			{
				if(a[i]<a[j])  //89>23
				{
					temp=a[i];  //a[i] value stored in temp that is temp=89
					a[i]=a[j];  //a[j] chi value a[i] madhe stored karaychi that is 23 is stored a[i]
					a[j]=temp; //a[j]  madhe  temp chi value stored kara 
				}
			}
		}
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		
	
		}
		
	}
	//System.out.println(a[0]);
	
}
