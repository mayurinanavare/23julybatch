package externalmock;

public class spacestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="mayuri nanavare kashid";
		int count=0;
		for(int i=0;i<=name.length()-1;i++)
		{
			char sd=name.charAt(i);
			if(sd==' ')
			{
				count++;
			}
		}
System.out.println(count);
	}

}
