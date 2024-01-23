package exceptionsample;

public class Class1Exception {
	
	public void sium() {
		try {
		int a=10/0;
		System.out.println(a);
		}catch(ArithmeticException e) {
			System.out.println("The exception handled is  "+e);
		}catch(ArrayIndexOutOfBoundsException b) {
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Class1Exception ce1 = new Class1Exception();
		ce1.sium();
	}

}
