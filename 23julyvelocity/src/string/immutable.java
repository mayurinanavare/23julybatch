package string;

public class immutable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String obj="mayuri";
		String obj1="mayuri";
		String obj2="mayuri";
		String obj3="mayu";  //
		System.out.println(obj);
		System.out.println(obj3);
		
		//string is immutable because we  can declare string using different reference variable
		//but value is assigned to that variable is same
		//but if i am change value of any string then it affact to other two string
		//overcome this problem that why string is immutable
		//if i am change the value of variable then it create different object in memory 
		

	}

}
