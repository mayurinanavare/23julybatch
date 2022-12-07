package constructor;

import java.util.Scanner;

public class scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first integer number");
		int num1=sc.nextInt();
		System.out.println("enter second integer number");
		int num2=sc.nextInt();
		int num3=num1+num2;
		System.out.println("addition of two number is :" +num3);
		
		
		

	}

}
