package string;

public class space {

	static String a="mayurinanavare  ";
static	int sp=0;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 for(int i=a.length()-1;i>=0;i--)
 { 
	
	 char ch=a.charAt(i);
	 if(ch==' ')
	 {
		 sp=sp+1;
	 }
	
      
	 

 }
 System.out.println("number of space in string " +sp);
		
	}

}
