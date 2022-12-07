package externalmock;

public class splitstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="mayuri,maruti,nanavare";
		//String str2=",";
		String str3[]=str1.split(",");
		for(int i=0;i<=str3.length-1;i++)
		{
			System.out.println(str3[i]);
		}

	}

}
