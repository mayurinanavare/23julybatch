package allprogram;

public class amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//153
		//1*1*1=1 5*5*5=125 3*3*3=27  1+125+27=153
		
		int num=23;
		int rem;
		int temp =0;
		int c;
		c=num;
		while(num>0)
		{
			rem=num%10;           // 153%10=15.3 ,15%10=1.5,1%10=0.1
			temp=(rem*rem*rem)+temp;// 27+5*5*5=27+125+1=153
			num=num/10;  
			
		}
		if(c==temp)
		{
			System.out.println("number is amstrong");
		}
		else
		{
		    System.out.println("number is not amstrong");	
		}

	}

}
