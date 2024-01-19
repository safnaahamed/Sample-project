package javaInterface;
//here both hierarchical and multilevel inheritance
public class ChildClass2 implements Interface1 {

	public static void main(String[] args) {
		ChildClass2 cc = new ChildClass2();
		cc.print();
		cc.print1();
		cc.sum();
		cc.sub();

	}

	public void print() {
		System.out.println("This is the first method of Interface2");
		
	}

	public void print1() {
		System.out.println("This is the second method of Interface2");
		
	}

	public void sum() {
		System.out.println("This is the first method of Interface1");
		
	}

	public void sub() {
		System.out.println("This is the second method of Interface1");
		
	}

}
