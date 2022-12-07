package staicandnonstaticprogram;

public class nonstaticdiffclass {
	
	public void sub()
	{
		int a=30;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nonstatic ns=new nonstatic();
		ns.add();
        nonstaticdiffclass ds =new nonstaticdiffclass();
        ds.sub();
	}

}
