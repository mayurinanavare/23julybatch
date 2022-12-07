package array;
//largest and smallest number in array 
public class largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {78,20,65,43,12};
		int max;
		int min;
		max=a[0];
		min=a[0];
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]>max)  //78>37
			{
				max=a[i];  //max madhe 78 store
				
			}
		}
		System.out.println("maximum element" +max);
		
		System.out.println("-------minimum element in array--------------");
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]<min)  //78>37
			{
				min=a[i];  //max madhe 78 store
				
			}
		}
		System.out.println("minimum element " +min);

	}

}
