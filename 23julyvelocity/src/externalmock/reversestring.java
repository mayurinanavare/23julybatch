package externalmock;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="mayuri";
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);

	}

}
