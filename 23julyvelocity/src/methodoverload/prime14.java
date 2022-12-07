package methodoverload;

public class prime14 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	
	int count=0;
		for(int no=1;no<=20;no++)
		{  
		
			int temp=0;
			for(int i=1;i<=no;i++)
			{
				if(no%i==0)
				{
					
					temp=temp+1;
					
					
				}

				
			}
			if(temp==2)
		     {
				  
		   		  System.out.print(no + " ");
		
			count++;
		     }
		}
		System.out.println();
		System.out.println("total prime number is:" +count);
		
		    
	}
	}


				
			    
			