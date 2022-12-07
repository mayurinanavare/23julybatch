package allprogram;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String UN="mayuri";
		String PW="mayu@12";
		if(UN=="mauri")
		{
			System.out.println("user name is correct");
			if (PW=="mayu12")
			{
				System.out.println("password is correct");
				System.out.println("login is sucessful");
			}
			else
			{
				System.out.println("wrong password");
				System.out.println("login faild");
			}
		}
		else
		{
			System.out.println("incorrect username");
			System.out.println("login failed");
		}

	}

}
