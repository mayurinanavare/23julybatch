package Interface;

public class childclass extends parentclass {

	public void demo()
	{
		System.out.println(" welcome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//childclass cs=new childclass();
		//cs.demo();
		parentclass ps=new childclass();
		ps.demo();
		
		
		

	}

}
