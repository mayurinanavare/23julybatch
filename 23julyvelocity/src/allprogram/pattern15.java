package allprogram;

public class pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int star=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			  if(j>=1)
				{
					System.out.print(" ");
				}
			
			}
			System.out.println();
			star++;
		}
	}

}