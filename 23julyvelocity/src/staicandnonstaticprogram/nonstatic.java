package staicandnonstaticprogram;

public class nonstatic {
	
	public void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nonstatic ns=new nonstatic();
		ns.add();

	}

}
