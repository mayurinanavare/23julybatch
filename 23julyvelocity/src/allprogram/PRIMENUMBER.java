package allprogram;

public class PRIMENUMBER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int no=1;no<=10;no++)
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
			System.out.print(no + " " );
		}
	
		}
		
	}

}
