package javasampleproject;

public class javasuperclasschild extends javasuperclassparent{
	
	public void print() {
		System.out.println(+a+" "+b);
		System.out.println(super.a);
		super.add();
		
	}

	public static void main(String[] args) {
		javasuperclasschild sup = new javasuperclasschild();
		//sup.add();
		sup.print();

	}

}
