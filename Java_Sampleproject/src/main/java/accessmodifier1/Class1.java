package accessmodifier1;

public class Class1 {
	int a = 10;
	int b = 20;

	public void add() {

		int c = a + b;
		System.out.println("The sum is (public) = " + c);
	}

	private void sub() {

		int c = a - b;
		System.out.println("The difference is (private)= " + c);
	}

	void multiply() {

		int c = a * b;
		System.out.println("The product is (default) = " + c);
	}

	protected void divide() {

		float c = a/b;
		System.out.println("The quotient is (protected) = " + c);
	}
	
	public static void main(String []args) {
		Class1 c1 = new Class1();
		c1.add();
		c1.sub();
		c1.multiply();
		c1.divide();
	}
}
