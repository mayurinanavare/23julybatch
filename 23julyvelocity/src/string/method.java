package string;

public class method {  //trim ,split -string method 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="velo eity ";
		String b="VELOCITY"; //each have different object string is case sensitive
		String c="ci,ty";
		System.out.println(a.replace('y', 'm')); //replace character
		System.out.println(b.replace('L', 'N'));
		System.out.println(a.isEmpty()); //it show is empty string 
		System.out.println(c.concat(a)); //combine two string 
		System.out.println(b.substring(0,1));  //it generate new string with start and end index
		
		//System.out.println(a.replaceAll('l', 'cn'));
		System.out.println(c.substring(1)); //create new string using start string
		System.out.println(a.endsWith("y")); //
		System.out.println(a.endsWith("ity"));
		System.out.println(a.endsWith("it"));
		System.out.println(a.startsWith(c));
		System.out.println(a.startsWith("v")); //compare both string as well as cahracter
		System.out.println(a.indexOf("e"));
		System.out.println(a.charAt(6));
		System.out.println(c.contains(c)); //check character persent in string 
		System.out.println(a.equals(c));   //compare 
		System.out.println(b.equalsIgnoreCase(a)); // not understhand
		System.out.println(c.length());
		System.out.println(b.toLowerCase());
		System.out.println(c.toUpperCase());
		System.out.println(c.split(c, 2));
		
	System.out.println(a.toString());
		//System.out.println(a.join(c, args)) //join 
		System.out.println(a.stripIndent());
		
		
		

	}

}
