package string;

public class string1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="mayuri,maruti,nanavre";
		String str3=",";
		String str2[]=str1.split(str3);
		for(int i=0;i<=str2.length-1;i++)
		{
			System.out.println(str2[i]);
		}

	}

}
