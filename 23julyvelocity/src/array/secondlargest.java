package array;

//second largest value
public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {10,34,56,78,65};
       int size;
       size=a.length;
       //System.out.println(size);
       int temp;
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
       
       System.out.println("second largest number is" +a[size-1]);// 5-2=3 //5-3=2 position of a[2]is value is 56
	}

}
