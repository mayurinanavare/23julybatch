package allprogram;

public class prime12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int num=6;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
				
			}
		}
		if(temp==2)
		{
			System.out.println("number is prime : " +num);
		}
		else
		{
			System.out.println("number is not a prime" +num);
		}
		

	}

}
