package keyword.Final;

//public class ChildClass extends Keyword_Final{ Final class cannot be inherited	

public class ChildClass {
	final int a;//normally when final is given to an integer, the data is constant
	//but using constructor we can initialize the data
	public ChildClass() {
		a=20;
		
	}
public final void print1() {
		System.out.println("This is final method");

	}

	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.print1();

	}

}
