package constructor;

import java.util.Scanner;

public class oddevenscan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any integer number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("entered number is even");
			
		}
		else
		{
			System.out.println("entered number is odd");
			
		}
		

	}

}
