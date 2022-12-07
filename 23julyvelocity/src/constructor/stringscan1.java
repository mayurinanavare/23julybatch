package constructor;

import java.util.Scanner;

public class stringscan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter any string");
		String name=sc.nextLine();
		System.out.println("entered string is:" +name);
		System.out.println("position of character is:" +name.charAt(1));
		
		
		

	}

}
