package allprogram;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0,1,1,2,3,5,8
		int a=0,b=1,c;
		System.out.print(a+ " "+b + "");
        for(int i=2;i<=10;i++)
        {
        	c=a+b;
        	System.out.print(" "+c+" ");
        	a=b; 
        	b=c;
        	
        }
	}

}
