package constructor;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any year");
		int year=sc.nextInt();
		if((year%4==0) && (year%400==0)|| (year%100!=0))
		{
			System.out.println("entered year is leap");
		}
		else
		{
			System.out.println("entered year is not leap year");
		}
			
		

	}

}
