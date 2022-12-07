package string;
//convert the given string into sequence of character
public class length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="mayuri";
		System.out.println(name.length());  //find length of string
		System.out.println(name.length()-1); //find index wise length of string
		for(int i=0;i<=name.length()-1;i++)
		{
			char ch=name.charAt(i);
		
		
		System.out.println(ch);
		
		}
	}

}
