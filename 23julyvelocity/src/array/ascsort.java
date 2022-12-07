package array;

import java.util.Arrays;

public class ascsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {30,40,50,10,60,78,56};
		System.out.println("-----print all array-------");
		for(int i=0;i<=a.length-1;i++)
		{
			//Arrays.sort(a);
			System.out.println(a[i]);
		}
	Arrays.sort(a);
	System.out.println("----------------sorted array--------------------");
	for(int i=0;i<=a.length-1;i++)
	{
		//Arrays.sort(a);
		System.out.println(a[i]);
	}
	System.out.println();
	System.out.println("after sorting position are changed");
	System.out.println(a[0]);
	System.out.println();
	System.out.println("-----------------desc order array-----------------");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.println(a[i]);
	}
	
	//System.out.println(a[0]);  // only value arrange in descending order 
	                             //index should be same 
	                             //for eaxmple index a[0] value should be 23 
	                             //not a 89 
	
	
	


	}

}
