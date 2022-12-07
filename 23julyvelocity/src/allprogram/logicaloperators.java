package allprogram;

public class logicaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
      System.out.println((10>5) &&(15>10)); 
      /*
       * and operator if both condition is true then output is true
       * true true =true
       * true false=false
       * false true=false
       * false false=false
       * 
       */
      
      System.out.println((78>100)|| (23>10)); 
      /*
       * or operator  if one condition is true then output is true
       * true false=true
       * false true=true
       * false false=false
       * true true =true
       */
      
      System.out.println(!(3==5)); //three equal to 5 condition is false but output true
      System.out.println(!(3==3));  //3 equal to 3 condition true but output is false
      }

}
