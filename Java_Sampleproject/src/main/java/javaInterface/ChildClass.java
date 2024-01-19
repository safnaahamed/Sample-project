package javaInterface;
//class always implements the interface
//mutliple inheritance can be achieved by adding parent interfaces using comma
public class ChildClass implements Interface1,Interface2 {

	public static void main(String[] args) {
		ChildClass cc= new ChildClass();
		cc.sum();
		cc.sub();
		//Interface1 i= new ChildClass();
		cc.print();
		cc.print1();
	}

	public void sum() {
		int c=a+b;
		System.out.println("The sum is = "+c);
		
	}

	public void sub() {
		int c=a-b;
		System.out.println("The difference is = "+c);
		
	}

	public void print() {
		System.out.println("This is the first method of Interface2");
		
	}

	public void print1() {
		System.out.println("This is the second method of Interface2");
		
	}

	

}
