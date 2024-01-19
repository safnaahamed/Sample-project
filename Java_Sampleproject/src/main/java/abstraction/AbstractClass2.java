package abstraction;

public class AbstractClass2 extends AbstractClass1 {

	public static void main(String[] args) {
		AbstractClass2 ac = new AbstractClass2();
		ac.sub();
		ac.sum();

	}

	@Override
	public void sum() {
		int a =10;
		int b=20;
		int c=a+b;
		System.out.println("This is abstract method: "+c);
		
	}

}
