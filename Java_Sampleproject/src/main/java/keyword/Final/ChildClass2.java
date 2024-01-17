package keyword.Final;

public class ChildClass2 extends ChildClass  {
	//we cant override the final methods 
	/*
	public final void print1() {
		System.out.println("This is final method - not overriding");

	}
*/
	
public void keyword() {
	
	System.out.println("The final method and class");
}

public static void main(String []args) {
	
	ChildClass2 cc2=new ChildClass2();
	cc2.keyword();
	cc2.print1(); // we can inherit the final methods using extends but cannot override
}
}
