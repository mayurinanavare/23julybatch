package multilevelinheritance;

import java.util.Scanner;

public class classB extends classA {
    int b=80;
	public void input2()
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter second number");
		b=sc.nextInt();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
